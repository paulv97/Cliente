/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
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
    
    public static void main(String[] args) {
        Controller ctrl = new Controller(new TorrentView());
        ctrl.init();
    }
    
}
