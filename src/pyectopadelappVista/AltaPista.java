package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class AltaPista extends javax.swing.JFrame {
    public AltaPista() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pistaCrAtras = new javax.swing.JButton();
        NuevaPistaButton = new javax.swing.JButton();
        NuevaPistaReady = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        IDNuevaPista = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        pistaCrAtras.setBackground(new java.awt.Color(0, 204, 255));
        pistaCrAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pistaCrAtras.setText("Atras");
        pistaCrAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pistaCrAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaCrAtrasActionPerformed(evt);
            }
        });

        NuevaPistaButton.setBackground(new java.awt.Color(0, 204, 255));
        NuevaPistaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NuevaPistaButton.setText("Crear");
        NuevaPistaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NuevaPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaButtonActionPerformed(evt);
            }
        });

        NuevaPistaReady.setBackground(new java.awt.Color(0, 0, 204));
        NuevaPistaReady.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NuevaPistaReady.setForeground(new java.awt.Color(255, 255, 255));
        NuevaPistaReady.setText("Lista");
        NuevaPistaReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaReadyActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado:");

        IDNuevaPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNuevaPistaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID de pista:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Creacion de pista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDNuevaPista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(NuevaPistaReady)
                                        .addGap(75, 75, 75))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NuevaPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(pistaCrAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IDNuevaPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(NuevaPistaReady))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pistaCrAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPistaReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaReadyActionPerformed

    }//GEN-LAST:event_NuevaPistaReadyActionPerformed

    private void NuevaPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaButtonActionPerformed
        try {
            Controlador.createField();
        } catch (SQLException ex) {
            Logger.getLogger(AltaPista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevaPistaButtonActionPerformed

    private void IDNuevaPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNuevaPistaActionPerformed
        try {
            Controlador.createField();
        } catch (SQLException ex) {
            Logger.getLogger(AltaPista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IDNuevaPistaActionPerformed

    private void pistaCrAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pistaCrAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.newField);
        } catch (SQLException ex) {
            Logger.getLogger(AltaPista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pistaCrAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IDNuevaPista;
    private javax.swing.JButton NuevaPistaButton;
    public javax.swing.JCheckBox NuevaPistaReady;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pistaCrAtras;
    // End of variables declaration//GEN-END:variables
}
