/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Jose
 */
public class TorrentView extends javax.swing.JFrame {

    /**
     * Creates new form TorrentView
     */
    public TorrentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etchedBorder1 = (javax.swing.border.EtchedBorder)javax.swing.BorderFactory.createEtchedBorder();
        jLabel2 = new javax.swing.JLabel();
        pnlGeneracionTorrent = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtArchivo = new javax.swing.JTextField();
        btnSeleccionarArchivo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombreTorrent = new javax.swing.JTextField();
        btnNombreTorrent = new javax.swing.JButton();
        btnCrearTorrent = new javax.swing.JButton();
        pnlDescargaArchivo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtArchivoTorrent = new javax.swing.JTextField();
        btnSeleccionarArchivoTorrent = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtDestinoArchivo = new javax.swing.JTextField();
        btnDestinoArchivo = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pbDescarga = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        lblProcentaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel2.setText("BitTorrent Client");

        pnlGeneracionTorrent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        jLabel3.setText("Seleccionar archivo");

        txtArchivo.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N

        btnSeleccionarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/explorer.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        jLabel4.setText("Ingresar nombre .torrent");

        txtNombreTorrent.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N

        btnNombreTorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/explorer.png"))); // NOI18N

        btnCrearTorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/process.png"))); // NOI18N
        btnCrearTorrent.setToolTipText("Crear .torrent");

        javax.swing.GroupLayout pnlGeneracionTorrentLayout = new javax.swing.GroupLayout(pnlGeneracionTorrent);
        pnlGeneracionTorrent.setLayout(pnlGeneracionTorrentLayout);
        pnlGeneracionTorrentLayout.setHorizontalGroup(
            pnlGeneracionTorrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneracionTorrentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneracionTorrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneracionTorrentLayout.createSequentialGroup()
                        .addGroup(pnlGeneracionTorrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeneracionTorrentLayout.createSequentialGroup()
                        .addComponent(txtNombreTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNombreTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrearTorrent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeneracionTorrentLayout.setVerticalGroup(
            pnlGeneracionTorrentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneracionTorrentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearTorrent)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(pnlGeneracionTorrentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnSeleccionarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNombreTorrent)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlDescargaArchivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        jLabel5.setText("Seleccionar archivo .torrent");

        txtArchivoTorrent.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N

        btnSeleccionarArchivoTorrent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/explorer.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        jLabel6.setText("Seleccionar carpeta de destino");

        txtDestinoArchivo.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N

        btnDestinoArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/explorer.png"))); // NOI18N

        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/download.png"))); // NOI18N
        btnDescargar.setToolTipText("Descargar archivo");
        btnDescargar.setPreferredSize(new java.awt.Dimension(88, 84));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pbDescarga.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Raleway", 0, 13)); // NOI18N
        jLabel7.setText("Progreso de descarga:");

        lblProcentaje.setFont(new java.awt.Font("Raleway", 1, 13)); // NOI18N
        lblProcentaje.setText("0%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbDescarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lblProcentaje)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pbDescarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblProcentaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDescargaArchivoLayout = new javax.swing.GroupLayout(pnlDescargaArchivo);
        pnlDescargaArchivo.setLayout(pnlDescargaArchivoLayout);
        pnlDescargaArchivoLayout.setHorizontalGroup(
            pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                        .addGroup(pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtArchivoTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSeleccionarArchivoTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                        .addComponent(txtDestinoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDestinoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlDescargaArchivoLayout.setVerticalGroup(
            pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                .addGroup(pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSeleccionarArchivoTorrent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDestinoArchivo))
                    .addGroup(pnlDescargaArchivoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArchivoTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDestinoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlDescargaArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeneracionTorrent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDescargaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlGeneracionTorrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnlDescargaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TorrentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TorrentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TorrentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TorrentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TorrentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrearTorrent;
    public javax.swing.JButton btnDescargar;
    public javax.swing.JButton btnDestinoArchivo;
    public javax.swing.JButton btnNombreTorrent;
    public javax.swing.JButton btnSeleccionarArchivo;
    public javax.swing.JButton btnSeleccionarArchivoTorrent;
    private javax.swing.border.EtchedBorder etchedBorder1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblProcentaje;
    public javax.swing.JProgressBar pbDescarga;
    private javax.swing.JPanel pnlDescargaArchivo;
    private javax.swing.JPanel pnlGeneracionTorrent;
    public javax.swing.JTextField txtArchivo;
    public javax.swing.JTextField txtArchivoTorrent;
    public javax.swing.JTextField txtDestinoArchivo;
    public javax.swing.JTextField txtNombreTorrent;
    // End of variables declaration//GEN-END:variables
}
