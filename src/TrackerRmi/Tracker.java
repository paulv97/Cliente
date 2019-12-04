package TrackerRmi;

import RemoteInterface.TrackerInt;
import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import util.SHA1;

public class Tracker extends UnicastRemoteObject implements TrackerInt {

    private Map<String, FileInformation> archivosDisponibles;
    private final int PUERTOT = 1099;//puerto del tracker
    private FileInformation fileInf;
    private int lastIP;

    public Tracker() throws RemoteException {
        recuperarObjeto();
        //System.out.println(archivosDisponibles.get("test.pdf").numPeersQueTienenArchivo);
    }

    public void recuperarObjeto() {
        try {
            ObjectInputStream archivo = null;
            File path = new File("archivosDisponibles");
            if (path.exists()) {
                archivo = new ObjectInputStream(new FileInputStream("archivosDisponibles"));
                archivosDisponibles = (Map<String, FileInformation>) archivo.readObject();
                archivo.close();
            } else {
                archivosDisponibles = Collections.synchronizedMap(new HashMap());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo abrir el archivo");
        }

    }

    @Override
    public String[] getAddress(String FileName) throws RemoteException{
        fileInf = archivosDisponibles.get(FileName);
        int num = fileInf.getNumConjuntos();
        lastIP = num;
        String[] address = new String[num];
        for (int i = 0; i < num; i++) {
            address[i] = getIP(i, FileName);
        }
        return address;
    }

    @Override
    public String getAltAddress(int index, String FileName)throws RemoteException {
        return getIP(0, FileName);
    }

    public synchronized String getIP(int actualPosition, String FileName) {
        fileInf = archivosDisponibles.get(FileName);
        if (actualPosition + 1 >= fileInf.getListaIPs().size()) {
            actualPosition = -1;
        }
        return fileInf.getListaIPs().get(actualPosition + 1);
    }

    @Override
    public void updateAddress(String IP, String FileName)throws RemoteException {
        fileInf = archivosDisponibles.get(FileName);
        fileInf.modifyData(IP);
        this.grabarObjeto();
    }


    public synchronized void grabarObjeto() {
        try {
            ObjectOutputStream entrada = new ObjectOutputStream(new FileOutputStream("archivosDisponibles"));
            entrada.writeObject(archivosDisponibles);
            entrada.flush();
            entrada.close();
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo");
        }
    }

    @Override
    public boolean createTorrent(String nombreArchivo, String primeraIP, int numPartes) throws IOException,RemoteException {
        String data = "";
        //data += InetAddress.getLocalHost().getHostAddress()+"\n";
        //data += 6000+"\n";
        //data += nombreArchivo+"\n";
        //String ip = InetAddress.getLocalHost().getHostAddress();
        FileInformation fileInf = new FileInformation(nombreArchivo, primeraIP, numPartes);
        archivosDisponibles.put(nombreArchivo, fileInf);
        grabarObjeto();
        //data += fileInf.getNumPartesArchivo()+"\n";
        //data += codifyFile("./.clonedFiles/"+nombreArchivo+"\n");
        //String []a = nombreArchivo.split("\\.");
        //String ruta = a[0]+".torrent";
        //File archivo = new File(ruta);
        //BufferedWriter bw;
        //bw = new BufferedWriter(new FileWriter(archivo));
        //bw.write(data);
        //bw.close();
        return true;
    }

    public String codifyFile(String nombre) throws IOException {
        String data = "";
        try {
            BufferedInputStream archivo = new BufferedInputStream(new FileInputStream(nombre));
            byte[] ar = new byte[60000];
            int in;
            while ((in = archivo.read(ar)) != -1)
                data += SHA1.SHA1(ar);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }


}
