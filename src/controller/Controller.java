/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ClienteRMI.Cliente;
import RemoteInterface.ServerInt;
import RemoteInterface.TrackerInt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.security.Permission;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import ServerRMI.Server;
import view.TorrentView;
import static main.Main.IP;
/**
 *
 * @author Jose
 */
public class Controller implements ActionListener {
    private TorrentView view;
    private ServerInt servidor;
    private final String ipTracker=IP;
    private TrackerInt tracker;
    private Cliente cliente;
    private String path ;
    public Controller(TorrentView view) {
        this.view = view;
    }
    
    public void init() {
        this.view.btnSeleccionarArchivo.addActionListener(this);
        this.view.btnCrearTorrent.addActionListener(this);
        this.view.btnDescargar.addActionListener(this);
        this.view.btnDestinoArchivo.addActionListener(this);
        this.view.btnNombreTorrent.addActionListener(this);
        this.view.btnSeleccionarArchivoTorrent.addActionListener(this);
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        this.view.btnNombreTorrent.setVisible(false);
        this.view.btnSeleccionarArchivo.setVisible(false);
        this.view.btnDestinoArchivo.setVisible(false);
        this.view.txtDestinoArchivo.setVisible(false);
        this.view.jLabel6.setVisible(false);
        try {

            //java.rmi.registry.LocateRegistry.createRegistry(1099);  //Si es tracker la linea se comenta, si no, se descomenta
            ServerInt server = new Server();
            InetAddress address = InetAddress.getLocalHost();
            Naming.rebind("rmi://"+address.getHostAddress()+"/"+address.getHostAddress(),server);
            System.out.println("Servidor Listo");
            tracker = (TrackerInt)Naming.lookup("rmi://"+ipTracker+"/tracker");
            cliente = new Cliente(tracker);
            //Naming.rebind("rmi://"+address.getHostAddress()+"/"+address.getHostAddress()+"C",cliente);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource() == this.view.btnSeleccionarArchivo) 
            seleccionarArchivo();*/
        
        if(e.getSource() == this.view.btnCrearTorrent) 
            crearTorrent();
        
        if(e.getSource() == this.view.btnDescargar) 
            descargar();
        
       /* if(e.getSource() == this.view.btnDestinoArchivo) 
            seleccionarDestinoTorrent();
        
        /*if(e.getSource() == this.view.btnNombreTorrent) 
            ingresarNombreTorrent("torrent");*/
        
        if(e.getSource() == this.view.btnSeleccionarArchivoTorrent) 
            seleccionarArchivoTorrent();
    }
    
   /* private void seleccionarArchivo() {
       
    }*/
    
    private void crearTorrent() {
        cliente.createTorrent(view.txtArchivo,view.txtNombreTorrent);
    }
    
    private void descargar() {
        if (!path.equals("")){
            cliente.download(path);
        }else{
            JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO ARCHIVO TORRENT","SIN TORRENT", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
   /* private void seleccionarDestinoTorrent() {
        
    }
    
    private void ingresarNombreTorrent() {
        
    }*/
    
    private void seleccionarArchivoTorrent() {
        path =  cliente.selectFile();
        view.txtArchivoTorrent.setText(path);
    }
    
    
}
