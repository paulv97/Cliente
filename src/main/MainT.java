package main;

import TrackerRmi.Tracker;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MainT {

    private static final int PUERTO = 1099;
    private static final String IP = "192.168.0.100";

    public static void main(String[] args) {
        //Remote remote;

        try {

            //Remote remote = UnicastRemoteObject.exportObject(new Tracker(), 0);
            /*Registry registry = LocateRegistry.createRegistry(PUERTO);
            registry.bind("tracker", remote);*/
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            //System.setSecurityManager(new SecurityManager());
            Naming.rebind("rmi://" + IP + "/tracker", new Tracker());
            System.out.println("Servidor escuchando en el puerto " + String.valueOf(PUERTO));
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
