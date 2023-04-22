/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tower_defense;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.applet.AudioClip;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author melan
 */
public class Interfaz_Grafica_Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    Cola_Tropas tropasJugador = new Cola_Tropas();
    Cola_Tropas tropasCPU = new Cola_Tropas();
    int numeroOleada = 1;
    Castillo castilloJugador = new Castillo(10);
    Castillo castilloCPU = new Castillo(10);
    int tropasAgregadas=0;
    int numOleada=1;
    int tropasDisponibles=numOleada+4;
    
    public Interfaz_Grafica_Juego() {
        initComponents();
        lbl_vidaJugador.setText(castilloJugador.getPuntosdeVida()+"");
        lbl_vidaCpu.setText(castilloCPU.getPuntosdeVida()+"");
        lbl_tropasDisponibles.setText(tropasDisponibles+"");
        lbl_tropasAgregadas.setText(tropasAgregadas+"");
        lbl_Oleada.setText(numOleada+"");

    }

    public void crearTropasCpu() {
        int c = 0;
        Cola_Tropas tropasCPU = new Cola_Tropas();
        Juego juego = new Juego();
        while (c < (numeroOleada + 3)) {
            tropasCPU.encolar(juego.generarTropasCpu());
            c++;
        }
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
        TorreJugador = new javax.swing.JLabel();
        TorreMaquina = new javax.swing.JLabel();
        LabelOleada = new javax.swing.JLabel();
        LBLqtyTropas = new javax.swing.JLabel();
        ImagenArquero = new javax.swing.JLabel();
        ImagenHechicero = new javax.swing.JLabel();
        LBLMagos1 = new javax.swing.JLabel();
        BntAgregarArquero = new java.awt.Button();
        ImagenCaballero = new javax.swing.JLabel();
        LBLCaballeros = new javax.swing.JLabel();
        LBLArqueros = new javax.swing.JLabel();
        BntAgregarMago = new java.awt.Button();
        BntAgregarCaballero = new java.awt.Button();
        LblOleada1 = new javax.swing.JLabel();
        BTNVolverMenu = new javax.swing.JButton();
        LBLVidaRestarteMaquina = new javax.swing.JLabel();
        LBLVidaRestarteJugador1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BNTIniciarOleada = new javax.swing.JButton();
        lbl_vidaJugador = new javax.swing.JLabel();
        lbl_vidaCpu = new javax.swing.JLabel();
        LblOleada2 = new javax.swing.JLabel();
        lbl_tropasDisponibles = new javax.swing.JLabel();
        lbl_tropasAgregadas = new javax.swing.JLabel();
        lbl_Oleada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        TorreJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Torre.png"))); // NOI18N

        TorreMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Torre.png"))); // NOI18N

        LabelOleada.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LabelOleada.setForeground(new java.awt.Color(255, 255, 255));
        LabelOleada.setText("Oleada:");

        LBLqtyTropas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLqtyTropas.setForeground(new java.awt.Color(255, 255, 255));
        LBLqtyTropas.setText("Seleccione la tropa que desea enviar:");

        ImagenArquero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arquero.png"))); // NOI18N

        ImagenHechicero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hechicero.png"))); // NOI18N
        ImagenHechicero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenHechiceroMouseClicked(evt);
            }
        });

        LBLMagos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLMagos1.setForeground(new java.awt.Color(255, 255, 255));
        LBLMagos1.setText("Magos");

        BntAgregarArquero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarArquero.setLabel("¡Agregar tropa!");
        BntAgregarArquero.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarArquero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BntAgregarArqueroMouseClicked(evt);
            }
        });
        BntAgregarArquero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarArqueroActionPerformed(evt);
            }
        });

        ImagenCaballero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Caballero.png"))); // NOI18N

        LBLCaballeros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLCaballeros.setForeground(new java.awt.Color(255, 255, 255));
        LBLCaballeros.setText("Caballeros");

        LBLArqueros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LBLArqueros.setForeground(new java.awt.Color(255, 255, 255));
        LBLArqueros.setText("Arqueros");

        BntAgregarMago.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarMago.setLabel("¡Agregar tropa!");
        BntAgregarMago.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BntAgregarMagoMouseClicked(evt);
            }
        });
        BntAgregarMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarMagoActionPerformed(evt);
            }
        });

        BntAgregarCaballero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BntAgregarCaballero.setLabel("¡Agregar tropa!");
        BntAgregarCaballero.setPreferredSize(new java.awt.Dimension(26, 32));
        BntAgregarCaballero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BntAgregarCaballeroMouseClicked(evt);
            }
        });
        BntAgregarCaballero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntAgregarCaballeroActionPerformed(evt);
            }
        });

        LblOleada1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LblOleada1.setForeground(new java.awt.Color(255, 255, 255));
        LblOleada1.setText("Tropas disponibles:");

        BTNVolverMenu.setBackground(new java.awt.Color(255, 0, 51));
        BTNVolverMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        BTNVolverMenu.setText("Regresar al menú principal");
        BTNVolverMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        BNTIniciarOleada.setBackground(new java.awt.Color(0, 153, 102));
        BNTIniciarOleada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BNTIniciarOleada.setForeground(new java.awt.Color(255, 255, 255));
        BNTIniciarOleada.setText("Iniciar Oleada");
        BNTIniciarOleada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BNTIniciarOleada.setEnabled(false);
        BNTIniciarOleada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTIniciarOleadaActionPerformed(evt);
            }
        });

        lbl_vidaJugador.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_vidaJugador.setForeground(new java.awt.Color(255, 255, 255));

        lbl_vidaCpu.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_vidaCpu.setForeground(new java.awt.Color(255, 255, 255));

        LblOleada2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        LblOleada2.setForeground(new java.awt.Color(255, 255, 255));
        LblOleada2.setText("Tropas añadidas:");

        lbl_tropasDisponibles.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_tropasDisponibles.setForeground(new java.awt.Color(255, 255, 255));

        lbl_tropasAgregadas.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_tropasAgregadas.setForeground(new java.awt.Color(255, 255, 255));

        lbl_Oleada.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        lbl_Oleada.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLqtyTropas)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNVolverMenu)
                        .addGap(46, 46, 46)
                        .addComponent(BNTIniciarOleada, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(TorreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(BntAgregarMago, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(LBLMagos1))
                                    .addComponent(ImagenHechicero, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(98, 98, 98)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ImagenCaballero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(LBLCaballeros))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BntAgregarCaballero, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(88, 88, 88))
                            .addComponent(LabelOleada)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLVidaRestarteJugador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_vidaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ImagenArquero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BntAgregarArquero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LBLArqueros)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Oleada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(262, 262, 262)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TorreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLVidaRestarteMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_vidaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblOleada2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_tropasAgregadas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LblOleada1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_tropasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelOleada)
                            .addComponent(lbl_Oleada))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TorreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLVidaRestarteJugador1)
                            .addComponent(lbl_vidaJugador)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TorreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLVidaRestarteMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_vidaCpu))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LBLqtyTropas)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ImagenHechicero, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ImagenCaballero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(LBLMagos1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(LBLCaballeros))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ImagenArquero, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LBLArqueros)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BntAgregarMago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BntAgregarCaballero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BntAgregarArquero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblOleada1)
                            .addComponent(lbl_tropasDisponibles))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblOleada2)
                            .addComponent(lbl_tropasAgregadas))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNTIniciarOleada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNVolverMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
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
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/Imagenes/ArqueroAtaque.png"));
        jLabel6.setIcon(icono);
        Arquero arquero=new Arquero(ABORT);
        tropasJugador.encolar(arquero);
        tropasAgregadas+=1;
        tropasDisponibles-=1;
        lbl_tropasAgregadas.setText(tropasAgregadas+"");
        lbl_tropasDisponibles.setText(tropasDisponibles+"");
        if(tropasDisponibles==0){
            BntAgregarMago.setEnabled(false);
            BntAgregarCaballero.setEnabled(false);
            BntAgregarArquero.setEnabled(false);
            BNTIniciarOleada.setEnabled(true);
        }
    }//GEN-LAST:event_BntAgregarArqueroActionPerformed

    private void BntAgregarMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgregarMagoActionPerformed
        //Icon imagen = new ImageIcon(new ImageIcon(getClass().getResource));
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/Imagenes/HechiceroAtaque.png"));
        jLabel6.setIcon(icono);
        Mago mago= new Mago(ABORT);
        tropasJugador.encolar(mago);
        tropasAgregadas+=1;
        tropasDisponibles-=1;
        lbl_tropasAgregadas.setText(tropasAgregadas+"");
        lbl_tropasDisponibles.setText(tropasDisponibles+"");
        if(tropasDisponibles==0){
            BntAgregarMago.setEnabled(false);
            BntAgregarCaballero.setEnabled(false);
            BntAgregarArquero.setEnabled(false);
            BNTIniciarOleada.setEnabled(true);
        }
    }//GEN-LAST:event_BntAgregarMagoActionPerformed

    private void BntAgregarCaballeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntAgregarCaballeroActionPerformed
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/Imagenes/CaballeroAtaque.png"));
        jLabel6.setIcon(icono);
        Caballero caballero=new Caballero(ABORT);
        tropasJugador.encolar(caballero);
        tropasAgregadas+=1;
        tropasDisponibles-=1;
        lbl_tropasAgregadas.setText(tropasAgregadas+"");
        lbl_tropasDisponibles.setText(tropasDisponibles+"");
        if(tropasDisponibles==0){
            BntAgregarMago.setEnabled(false);
            BntAgregarCaballero.setEnabled(false);
            BntAgregarArquero.setEnabled(false);
            BNTIniciarOleada.setEnabled(true);
        }
    }//GEN-LAST:event_BntAgregarCaballeroActionPerformed

    private void BTNVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVolverMenuActionPerformed
        Menu_Principal AbrirMePri = new Menu_Principal();
        AbrirMePri.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTNVolverMenuActionPerformed

    private void BntAgregarCaballeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BntAgregarCaballeroMouseClicked
        // TODO add your handling code here:
        AudioClip sonidoCaballero;
        sonidoCaballero = java.applet.Applet.newAudioClip(getClass().getResource("/proyecto_tower_defense/Caballero.wav"));
        sonidoCaballero.play();

    }//GEN-LAST:event_BntAgregarCaballeroMouseClicked

    private void ImagenHechiceroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenHechiceroMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ImagenHechiceroMouseClicked

    private void BntAgregarMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BntAgregarMagoMouseClicked
        // TODO add your handling code here:
        AudioClip sonidoMago;
        sonidoMago = java.applet.Applet.newAudioClip(getClass().getResource("/proyecto_tower_defense/Mago.wav"));
        sonidoMago.play();
    }//GEN-LAST:event_BntAgregarMagoMouseClicked

    private void BntAgregarArqueroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BntAgregarArqueroMouseClicked
        // TODO add your handling code here:
        AudioClip sonidoArquera;
        sonidoArquera = java.applet.Applet.newAudioClip(getClass().getResource("/proyecto_tower_defense/Arquera.wav"));
        sonidoArquera.play();
    }//GEN-LAST:event_BntAgregarArqueroMouseClicked

    private void BNTIniciarOleadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTIniciarOleadaActionPerformed
        // TODO add your handling code here:
        crearTropasCpu();
        JOptionPane.showMessageDialog(null,tropasJugador.getListaTropas().getPrimerNodo()+" V.S "+tropasCPU.getListaTropas().getPrimerNodo());
    }//GEN-LAST:event_BNTIniciarOleadaActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton BNTIniciarOleada;
    private javax.swing.JButton BTNVolverMenu;
    private java.awt.Button BntAgregarArquero;
    private java.awt.Button BntAgregarCaballero;
    private java.awt.Button BntAgregarMago;
    private javax.swing.JLabel ImagenArquero;
    private javax.swing.JLabel ImagenCaballero;
    private javax.swing.JLabel ImagenHechicero;
    private javax.swing.JLabel LBLArqueros;
    private javax.swing.JLabel LBLCaballeros;
    private javax.swing.JLabel LBLMagos1;
    private javax.swing.JLabel LBLVidaRestarteJugador1;
    private javax.swing.JLabel LBLVidaRestarteMaquina;
    private javax.swing.JLabel LBLqtyTropas;
    private javax.swing.JLabel LabelOleada;
    private javax.swing.JLabel LblOleada1;
    private javax.swing.JLabel LblOleada2;
    private javax.swing.JLabel TorreJugador;
    private javax.swing.JLabel TorreMaquina;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Oleada;
    private javax.swing.JLabel lbl_tropasAgregadas;
    private javax.swing.JLabel lbl_tropasDisponibles;
    private javax.swing.JLabel lbl_vidaCpu;
    private javax.swing.JLabel lbl_vidaJugador;
    // End of variables declaration//GEN-END:variables
}
