package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class EditPista extends javax.swing.JFrame {

    public EditPista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IDNuevaPista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NuevaPistaReady = new javax.swing.JCheckBox();
        NuevaPistaNotReady = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        altaPistaAtras = new javax.swing.JButton();
        NuevaPistaButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID de pista:");

        jLabel2.setText("Estado:");

        NuevaPistaReady.setText("Lista");
        NuevaPistaReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaReadyActionPerformed(evt);
            }
        });

        NuevaPistaNotReady.setText("En mantenimiento");
        NuevaPistaNotReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaNotReadyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Editar datos de la pista");

        altaPistaAtras.setText("Atras");
        altaPistaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPistaAtrasActionPerformed(evt);
            }
        });

        NuevaPistaButton1.setText("Crear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(altaPistaAtras)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(IDNuevaPista, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NuevaPistaNotReady)
                                            .addComponent(NuevaPistaReady))))))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(NuevaPistaButton1)
                    .addContainerGap(147, Short.MAX_VALUE)))
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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NuevaPistaReady))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevaPistaNotReady)
                .addGap(26, 26, 26)
                .addComponent(altaPistaAtras)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(NuevaPistaButton1)
                    .addGap(28, 28, 28)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPistaReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaReadyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevaPistaReadyActionPerformed

    private void NuevaPistaNotReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaNotReadyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevaPistaNotReadyActionPerformed

    private void altaPistaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPistaAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.editField);
        }catch (SQLException ex) {
            Logger.getLogger(EditPista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altaPistaAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IDNuevaPista;
    private javax.swing.JButton NuevaPistaButton1;
    private javax.swing.JCheckBox NuevaPistaNotReady;
    private javax.swing.JCheckBox NuevaPistaReady;
    private javax.swing.JButton altaPistaAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
