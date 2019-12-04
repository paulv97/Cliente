package RemoteInterface;

import java.io.FileNotFoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInt extends Remote {

    void transferGroup(ClientInt client,int k,Integer i, int numPeers,String fileName) throws RemoteException, FileNotFoundException;

}

