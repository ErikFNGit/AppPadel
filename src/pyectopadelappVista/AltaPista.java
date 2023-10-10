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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDNuevaPista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NuevaPistaReady = new javax.swing.JCheckBox();
        NuevaPistaButton = new javax.swing.JButton();
        pistaCrAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Creacion de pista");

        jLabel1.setText("ID de pista:");

        IDNuevaPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNuevaPistaActionPerformed(evt);
            }
        });

        jLabel2.setText("Estado:");

        NuevaPistaReady.setText("Lista");
        NuevaPistaReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaReadyActionPerformed(evt);
            }
        });

        NuevaPistaButton.setText("Crear");
        NuevaPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaButtonActionPerformed(evt);
            }
        });

        pistaCrAtras.setText("Atras");
        pistaCrAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pistaCrAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NuevaPistaButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pistaCrAtras))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IDNuevaPista))
                    .addComponent(NuevaPistaReady))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDNuevaPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NuevaPistaReady))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaPistaButton)
                    .addComponent(pistaCrAtras))
                .addGap(19, 19, 19))
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
        // TODO add your handling code here:
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
    private javax.swing.JButton pistaCrAtras;
    // End of variables declaration//GEN-END:variables
}
