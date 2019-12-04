/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import view.TorrentView;

/**
 *
 * @author Jose
 */
public class Main {

    private static final int PUERTO = 1099;
    public static final String IP="192.168.0.100";
    public static String localIP = null;

    public static void main(String[] args) throws UnknownHostException, IOException {
        //System.setSecurityManager(new SecurityManager());
        Socket getAddress = new Socket("www.google.com", 80);
        InetAddress address = InetAddress.getByName(getAddress.getLocalAddress().toString().split("/")[1]);
        localIP=address.toString().substring(1,address.toString().length());
        getAddress.close();
        Controller ctrl = new Controller(new TorrentView());
        ctrl.init();
    }
    
}
