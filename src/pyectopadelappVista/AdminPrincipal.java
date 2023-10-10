package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;


public class AdminPrincipal extends javax.swing.JFrame {

    public AdminPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EditUsuButton = new javax.swing.JButton();
        AltaUsuButton = new javax.swing.JButton();
        AltaPistaButton = new javax.swing.JButton();
        EditPistaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Centro de control de Administrador");

        EditUsuButton.setText("Editar Usuarios");
        EditUsuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuButtonActionPerformed(evt);
            }
        });

        AltaUsuButton.setText("Alta Usuario");
        AltaUsuButton.setMaximumSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.setMinimumSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.setPreferredSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaUsuButtonActionPerformed(evt);
            }
        });

        AltaPistaButton.setText("Alta Pista");
        AltaPistaButton.setMaximumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.setMinimumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.setPreferredSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaPistaButtonActionPerformed(evt);
            }
        });

        EditPistaButton.setText("Editar Pistas");
        EditPistaButton.setMaximumSize(new java.awt.Dimension(108, 23));
        EditPistaButton.setMinimumSize(new java.awt.Dimension(108, 23));
        EditPistaButton.setPreferredSize(new java.awt.Dimension(108, 23));
        EditPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPistaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AltaUsuButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditUsuButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AltaPistaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditPistaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AltaUsuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditUsuButton)
                .addGap(18, 18, 18)
                .addComponent(AltaPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditUsuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuButtonActionPerformed
        Controlador.addUsu();
    }//GEN-LAST:event_EditUsuButtonActionPerformed

    private void AltaUsuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaUsuButtonActionPerformed
        Controlador.editarUsu();
    }//GEN-LAST:event_AltaUsuButtonActionPerformed

    private void AltaPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaPistaButtonActionPerformed
        Controlador.addField();
    }//GEN-LAST:event_AltaPistaButtonActionPerformed

    private void EditPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPistaButtonActionPerformed
        Controlador.editarField();
    }//GEN-LAST:event_EditPistaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaPistaButton;
    private javax.swing.JButton AltaUsuButton;
    private javax.swing.JButton EditPistaButton;
    private javax.swing.JButton EditUsuButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
