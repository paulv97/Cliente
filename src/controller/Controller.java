/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TorrentView;

/**
 *
 * @author Jose
 */
public class Controller implements ActionListener {
    private TorrentView view;
    
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.view.btnSeleccionarArchivo) 
            seleccionarArchivo();
        
        if(e.getSource() == this.view.btnCrearTorrent) 
            crearTorrent();
        
        if(e.getSource() == this.view.btnDescargar) 
            descargar();
        
        if(e.getSource() == this.view.btnDestinoArchivo) 
            seleccionarDestinoTorrent();
        
        if(e.getSource() == this.view.btnNombreTorrent) 
            ingresarNombreTorrent();
        
        if(e.getSource() == this.view.btnSeleccionarArchivoTorrent) 
            seleccionarArchivoTorrent();
    }
    
    private void seleccionarArchivo() {
        
    }
    
    private void crearTorrent() {
        
    }
    
    private void descargar() {
        
    }
    
    private void seleccionarDestinoTorrent() {
        
    }
    
    private void ingresarNombreTorrent() {
        
    }
    
    private void seleccionarArchivoTorrent() {
        
    }
}
