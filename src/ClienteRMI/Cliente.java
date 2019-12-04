package ClienteRMI;

import static C_S_RMI.main.IP;
import RemoteInterface.ClientInt;
import RemoteInterface.TrackerInt;
import java.io.BufferedReader;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

import static util.SHA1.SHA1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Cliente extends UnicastRemoteObject implements ClientInt {

    private final int bytesize= 60000;
    private Map<Integer, Object[]> map;
    private String hash;
    private TrackerInt tracker;
    private String FileName;
    /*public Cliente(String FileName, Map<Integer, Object[]> map, String hash) throws RemoteException {
        this.map=map;
        this.hash=hash;
        this.FileName = FileName;
    }*/
    public Cliente(TrackerInt tracker)throws RemoteException{
        this.tracker = tracker;
    }

    public void startDownload(String IPNAme,String FileName,String hash,Map<Integer, Object[]> map,int numParts){
        this.hash=hash;
        this.FileName = FileName;
        this.map = map;
        try {
            
            String []dir = tracker.getAddress(FileName);
            for (int k=0;k<dir.length;k++){
                HiloConexion hilo = new HiloConexion(dir[k],tracker,FileName,k,this,dir.length,0);
                hilo.start();
            }
            HiloControlArchivo hiloCA = new HiloControlArchivo(map,numParts,FileName,tracker);
            hiloCA.start();
        }catch (Exception e){
            
        }
    }

    @Override
    public synchronized boolean sendData(byte[] data, int len, int numPart) throws RemoteException {
        byte [] recievedData = data;
        byte [] trash = new byte[bytesize];
        String calculatedHash="";
        String controlHash="";
        calculatedHash = SHA1(recievedData);
        controlHash = hash.substring(20*numPart,20*(numPart+1));
            if(calculatedHash.equals(controlHash)){
                Object [] array = {recievedData,len};
                map.put(numPart,array);
                return true;
            }
            else{
                return false;
            }
    }

    public boolean copyFile(String fromFile, String toFile) {
        File origin = new File(fromFile);
        File destination = new File(toFile);
        if (origin.exists() && !destination.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // We use a buffer for the copy (Usamos un buffer para la copia).
                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }
    
    public String selectFile(){
        JFrame parent = new JFrame("Elegir torrent");
        JFileChooser jf = new JFileChooser();
        jf.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filtroImagen=new FileNameExtensionFilter("TORRENT","torrent");
        jf.setFileFilter(filtroImagen);
        int result = jf.showOpenDialog(parent);
        //preguntar si da igual donde este file torrent
        if (result == JFileChooser.APPROVE_OPTION) {
            //optionalName[0] = jf.getSelectedFile().getName();
            //copyFile(jf.getSelectedFile().getPath(), name);
            return jf.getSelectedFile().getPath();
            //download(path);
        }else{
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO ARCHIVO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return "";
    }
    
    
    public void createTorrent(JTextField dir, JTextField nom){
        JFrame parent = new JFrame("Elegir torrent");
        JFileChooser jf = new JFileChooser();
        jf.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = jf.showOpenDialog(parent);
        //preguntar si da igual donde este file torrent
        if (result == JFileChooser.APPROVE_OPTION) {
            String name=jf.getSelectedFile().getName();
            String path = jf.getSelectedFile().getPath();
            //copyFile(path, name);
            copyFile(path, "./.clonedFiles/"+name);
            int numPartes = (int)Math.ceil( (new File("./.clonedFiles/"+name).length()) / 60000);
            try {
                //necesito ver como me conecto al torrent, obtener direccion ip del torrent sin tener un .torrent de donde leer.
                tracker.createTorrent(name,InetAddress.getLocalHost().getHostAddress(),numPartes);
                dir.setText(path);
                nom.setText(name);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "NO SE HA CREADO TORRENT. HA OCURRIDO UN ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO ARCHIVO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public void download (String pathArchivo){
        
        try {
            
            String direccion = pathArchivo;
            Map<Integer, Object[]> map = Collections.synchronizedMap(new HashMap<>());
            //leer el .torrent
            if (!direccion.equals("")){
                BufferedReader to = new BufferedReader(new FileReader(new File(direccion)));
                //Obtencion del nombre del archivo
                String fileName = to.readLine();
                //Obtencion cadena hash para control de integridad
                String hash = to.readLine();
                //Obtencion numero de partes
                int numParts = Integer.parseInt(to.readLine());
                to.close();
                //Cliente client = new Cliente(fileName,map,hash);

                InetAddress address = InetAddress.getLocalHost();
                Naming.rebind("rmi://"+IP+"/"+address.getHostAddress(),this);
                System.out.println("Cliente remoto listo");
                this.startDownload(IP+"/tracker",fileName,hash,map,numParts);
            }else{
                System.out.println("no se selecciono archivo");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
