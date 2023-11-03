/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;

public class EliminarReservaOk extends javax.swing.JFrame {

    public EliminarReservaOk() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        confirmarEliminacionBoton = new javax.swing.JButton();
        eliminacionAtrasBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Esta seguro que desea");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ELIMINAR");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("la reserva?");

        confirmarEliminacionBoton.setForeground(new java.awt.Color(255, 0, 0));
        confirmarEliminacionBoton.setText("Eliminar");
        confirmarEliminacionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarEliminacionBotonActionPerformed(evt);
            }
        });

        eliminacionAtrasBoton.setText("Atras");
        eliminacionAtrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminacionAtrasBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(confirmarEliminacionBoton)
                .addGap(68, 68, 68)
                .addComponent(eliminacionAtrasBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarEliminacionBoton)
                    .addComponent(eliminacionAtrasBoton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarEliminacionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarEliminacionBotonActionPerformed
        try {
            Controlador.confirmarCancelacion();
        } catch (SQLException ex) {
            Logger.getLogger(EliminarReservaOk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmarEliminacionBotonActionPerformed

    private void eliminacionAtrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminacionAtrasBotonActionPerformed
        try {
            Controlador.atrasEliminar();
        } catch (SQLException ex) {
            Logger.getLogger(EliminarReservaOk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminacionAtrasBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarEliminacionBoton;
    private javax.swing.JButton eliminacionAtrasBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
