/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteRMI;

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
import java.rmi.AlreadyBoundException;
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
import static main.Main.localIP;
/**
 *
 * @author davidpinos
 */
public class HiloEjecucion extends Thread{
       
    private Cliente cliente;
    private String path;
    public HiloEjecucion (Cliente cliente,String path){
        this.cliente=cliente;
        this.path=path;
    }
    
    @Override
    public void run(){
        descargar();
    }
    
    
    public synchronized void descargar(){
        cliente.download(path);
        /*try {
                Naming.unbind("rmi://" + localIP + "/" + localIP);
                server = new Server();
                Naming.bind("rmi://"+localIP+"/"+localIP,server);
            }catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }catch (AlreadyBoundException e){
                e.printStackTrace();
            }*/
    }
    
}
