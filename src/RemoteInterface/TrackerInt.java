package RemoteInterface;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TrackerInt extends Remote {

    String[] getAddress(String FileName) throws RemoteException;

    String getAltAddress(String failedIP,String FileName) throws RemoteException;

    void updateAddress(String IP,String FileName)throws RemoteException;

    public boolean createTorrent(String nombreArchivo,String primeraIP, int numPartes) throws IOException,RemoteException;

}
