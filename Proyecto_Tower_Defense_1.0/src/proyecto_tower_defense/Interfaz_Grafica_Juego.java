/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tower_defense;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author melan
 */
public class Interfaz_Grafica_Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Interfaz_Grafica_Juego() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelOleada = new javax.swing.JLabel();
        TXTOleada = new java.awt.TextField();
        LBLqtyTropas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LBLMagos1 = new javax.swing.JLabel();
        BntAgregarArquero = new java.awt.Button();
        jLabel3 = new javax.swing.JLabel();
        LBLCaballeros = new javax.swing.JLabel();
        LBLArqueros = new javax.swing.JLabel();
        BntAgregarMago = new java.awt.Button();
        BntAgregarCaballero = new java.awt.Button();
        LblOleada1 = new javax.swing.JLabel();
        TXTTropasDisponibles = new java.awt.TextField();
        BTNVolverMenu = new javax.swing.JButton();
        LBLVidaRestarteMaquina = new javax.swing.JLabel();
        LBLVidaRestarteJugador1 = new javax.swing.JLabel();
        TXTVidaJugador = new java.awt.TextField();
        TXTVidaMaquina = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\melan\\Downloads\\tower..png")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\melan\\Downloads\\tower..png")); // NOI18N

        LabelOleada.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LabelOleada.setForeground(new java.awt.Color(255, 255, 255));
        LabelOleada.setText("Oleada:");

        TXTOleada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTOleada.setEditable(false);

        LBLqtyTropas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLqtyTropas.setForeground(new java.awt.Color(255, 255, 255));
        LBLqtyTropas.setText("Seleccione la tropa que desea enviar:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\melan\\Downloads\\Archer...png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\melan\\Downloads\\Wizard...png")); // NOI18N

        LBLMagos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLMagos1.setForeground(new java.awt.Color(255, 255, 255));
        LBLMagos1.setText("Magos");

        BntAgregarArquero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarArquero.setLabel("¡Agregar tropa!");
        BntAgregarArquero.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarArquero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarArqueroActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\melan\\Downloads\\Knight2...png")); // NOI18N

        LBLCaballeros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLCaballeros.setForeground(new java.awt.Color(255, 255, 255));
        LBLCaballeros.setText("Caballeros");

        LBLArqueros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLArqueros.setForeground(new java.awt.Color(255, 255, 255));
        LBLArqueros.setText("Arqueros");

        BntAgregarMago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarMago.setLabel("¡Agregar tropa!");
        BntAgregarMago.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarMagoActionPerformed(evt);
            }
        });

        BntAgregarCaballero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarCaballero.setLabel("¡Agregar tropa!");
        BntAgregarCaballero.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarCaballero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarCaballeroActionPerformed(evt);
            }
        });

        LblOleada1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LblOleada1.setForeground(new java.awt.Color(255, 255, 255));
        LblOleada1.setText("Tropas disponibles:");

        TXTTropasDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTTropasDisponibles.setEditable(false);

        BTNVolverMenu.setBackground(new java.awt.Color(255, 0, 51));
        BTNVolverMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        BTNVolverMenu.setText("Regresar al menú principal");
        BTNVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVolverMenuActionPerformed(evt);
            }
        });

        LBLVidaRestarteMaquina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLVidaRestarteMaquina.setForeground(new java.awt.Color(255, 255, 255));
        LBLVidaRestarteMaquina.setText("Vida Restante: ");

        LBLVidaRestarteJugador1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLVidaRestarteJugador1.setForeground(new java.awt.Color(255, 255, 255));
        LBLVidaRestarteJugador1.setText("Vida Restante: ");

        TXTVidaJugador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTVidaJugador.setEditable(false);
        TXTVidaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTVidaJugadorActionPerformed(evt);
            }
        });

        TXTVidaMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTVidaMaquina.setEditable(false);
        TXTVidaMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTVidaMaquinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLVidaRestarteJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTVidaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(450, 450, 450))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LBLqtyTropas)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(16, 16, 16)
                                                            .addComponent(BntAgregarMago, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(38, 38, 38)
                                                            .addComponent(LBLMagos1))
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(98, 98, 98)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                    .addGap(1, 1, 1)
                                                                    .addComponent(LBLCaballeros))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(BntAgregarCaballero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(99, 99, 99))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(LabelOleada)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(LBLArqueros))
                                                .addComponent(BntAgregarArquero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TXTOleada, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblOleada1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTTropasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LBLVidaRestarteMaquina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXTVidaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNVolverMenu)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTOleada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelOleada))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLVidaRestarteJugador1)
                            .addComponent(TXTVidaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTVidaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLVidaRestarteMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LBLqtyTropas)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(LBLMagos1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLCaballeros))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LBLArqueros)))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BntAgregarMago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BntAgregarCaballero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BntAgregarArquero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTTropasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblOleada1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(BTNVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BntAgregarArqueroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgregarArqueroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BntAgregarArqueroActionPerformed

    private void BntAgregarMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgregarMagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BntAgregarMagoActionPerformed

    private void BntAgregarCaballeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgregarCaballeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BntAgregarCaballeroActionPerformed

    private void BTNVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVolverMenuActionPerformed
        Menu_Principal AbrirMePri = new Menu_Principal();
        AbrirMePri.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTNVolverMenuActionPerformed

    private void TXTVidaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTVidaJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTVidaJugadorActionPerformed

    private void TXTVidaMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTVidaMaquinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTVidaMaquinaActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Grafica_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafica_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Grafica_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNVolverMenu;
    private java.awt.Button BntAgregarArquero;
    private java.awt.Button BntAgregarCaballero;
    private java.awt.Button BntAgregarMago;
    private javax.swing.JLabel LBLArqueros;
    private javax.swing.JLabel LBLCaballeros;
    private javax.swing.JLabel LBLMagos1;
    private javax.swing.JLabel LBLVidaRestarteJugador1;
    private javax.swing.JLabel LBLVidaRestarteMaquina;
    private javax.swing.JLabel LBLqtyTropas;
    private javax.swing.JLabel LabelOleada;
    private javax.swing.JLabel LblOleada1;
    private java.awt.TextField TXTOleada;
    private java.awt.TextField TXTTropasDisponibles;
    private java.awt.TextField TXTVidaJugador;
    private java.awt.TextField TXTVidaMaquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}