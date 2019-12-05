package main;

import TrackerRmi.Tracker;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.UnknownHostException;
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
            /*Socket getAddress = new Socket("www.google.com", 80);
            InetAddress address = InetAddress.getByName(getAddress.getLocalAddress().toString().split("/")[1]);
            System.out.println(address.toString());*/
            //System.setProperty("java.rmi.server.hostname", InetAddress.getLocalHost().getHostAddress());
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            //System.setSecurityManager(new SecurityManager());
            Naming.rebind("rmi://" + IP+ "/tracker", new Tracker());
            System.out.println("Servidor escuchando en el puerto " + String.valueOf(PUERTO));

        } catch (RemoteException | MalformedURLException  e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
