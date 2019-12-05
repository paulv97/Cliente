package ClienteRMI;

import RemoteInterface.TrackerInt;

import java.io.*;
import java.net.InetAddress;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;
import static main.Main.localIP;
import view.TorrentView;
public class HiloControlArchivo extends Thread{

    Map<Integer,Object[]> map;
    int numPartes;
    String fileName;
    TrackerInt tracker;
    BufferedOutputStream bosS;
    BufferedOutputStream bosC;
    public double porcentaje;
    TorrentView view;
    public HiloControlArchivo(Map<Integer, Object[]> map, int numPartes, String fileName, TrackerInt tracker) {
        this.map = map;
        this.numPartes = numPartes;
        this.fileName = fileName;
        this.tracker = tracker;
    }

    @Override
    public void run() {
        escribir();
    }
    
    public void setView(TorrentView view) {
        this.view = view;
    }

    private synchronized void escribir(){
        try {
            final File newFile = new File( "./.clonedFiles/"+fileName);
            bosC = new BufferedOutputStream(new FileOutputStream(fileName,true));
            bosS = new BufferedOutputStream(new FileOutputStream(newFile,true));
            int i = 0;
            Object[] array;
            while (i != numPartes+1) {
                if ((array = map.get(i)) != null) {
                    bosC.write((byte[])array[0],0,(int) array[1]);
                    bosS.write((byte[])array[0],0,(int) array[1]);

                    porcentaje= (map.size()/numPartes)*100;

                    if(i==numPartes)
                        porcentaje=100;
                    i++;
                    
                    this.view.pbDescarga.setValue((int) porcentaje);
                } else {
                    continue;
                }
            }
            //InetAddress address = InetAddress.getLocalHost();
            tracker.updateAddress(localIP.toString(),fileName);
            System.out.println("Archivo descargado");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bosC.close();
                bosS.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
