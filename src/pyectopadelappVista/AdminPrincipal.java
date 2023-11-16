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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EditUsuButton = new javax.swing.JButton();
        AltaUsuButton = new javax.swing.JButton();
        AltaPistaButton = new javax.swing.JButton();
        EditPistaButton = new javax.swing.JButton();
        AltaPistaButton1 = new javax.swing.JButton();
        EditPistaButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(394, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Centro de control de Administrador");

        EditUsuButton.setBackground(new java.awt.Color(0, 204, 255));
        EditUsuButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditUsuButton.setText("Editar Usuarios");
        EditUsuButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditUsuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuButtonActionPerformed(evt);
            }
        });

        AltaUsuButton.setBackground(new java.awt.Color(0, 204, 255));
        AltaUsuButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AltaUsuButton.setText("Alta Usuario");
        AltaUsuButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AltaUsuButton.setMaximumSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.setMinimumSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.setPreferredSize(new java.awt.Dimension(108, 23));
        AltaUsuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaUsuButtonActionPerformed(evt);
            }
        });

        AltaPistaButton.setBackground(new java.awt.Color(0, 204, 255));
        AltaPistaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AltaPistaButton.setText("Alta Pista");
        AltaPistaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AltaPistaButton.setMaximumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.setMinimumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.setPreferredSize(new java.awt.Dimension(108, 23));
        AltaPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaPistaButtonActionPerformed(evt);
            }
        });

        EditPistaButton.setBackground(new java.awt.Color(0, 204, 255));
        EditPistaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditPistaButton.setText("Editar Pistas");
        EditPistaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditPistaButton.setMaximumSize(new java.awt.Dimension(108, 23));
        EditPistaButton.setMinimumSize(new java.awt.Dimension(108, 23));
        EditPistaButton.setPreferredSize(new java.awt.Dimension(108, 23));
        EditPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPistaButtonActionPerformed(evt);
            }
        });

        AltaPistaButton1.setBackground(new java.awt.Color(0, 204, 255));
        AltaPistaButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AltaPistaButton1.setText("Crear Reserva");
        AltaPistaButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AltaPistaButton1.setMaximumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton1.setMinimumSize(new java.awt.Dimension(108, 23));
        AltaPistaButton1.setPreferredSize(new java.awt.Dimension(108, 23));
        AltaPistaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaPistaButton1ActionPerformed(evt);
            }
        });

        EditPistaButton1.setBackground(new java.awt.Color(0, 204, 255));
        EditPistaButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditPistaButton1.setText("Editar Reservas");
        EditPistaButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditPistaButton1.setMaximumSize(new java.awt.Dimension(108, 23));
        EditPistaButton1.setMinimumSize(new java.awt.Dimension(108, 23));
        EditPistaButton1.setPreferredSize(new java.awt.Dimension(108, 23));
        EditPistaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPistaButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AltaPistaButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AltaUsuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AltaPistaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EditPistaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(EditUsuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditPistaButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AltaPistaButton, EditPistaButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EditUsuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AltaUsuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AltaPistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AltaPistaButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(EditPistaButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AltaPistaButton, EditPistaButton});

        AltaPistaButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditUsuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuButtonActionPerformed
        try {
            Controlador.listUsers();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditUsuButtonActionPerformed

    private void AltaUsuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaUsuButtonActionPerformed
        Controlador.addUsu();
    }//GEN-LAST:event_AltaUsuButtonActionPerformed

    private void AltaPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaPistaButtonActionPerformed
        Controlador.addField();
    }//GEN-LAST:event_AltaPistaButtonActionPerformed

    private void EditPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPistaButtonActionPerformed
        try {
            Controlador.listPistas();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditPistaButtonActionPerformed

    private void AltaPistaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaPistaButton1ActionPerformed
        Controlador.abrirReserva();
    }//GEN-LAST:event_AltaPistaButton1ActionPerformed

    private void EditPistaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPistaButton1ActionPerformed
        Controlador.abrirCalendarioAdmin();
    }//GEN-LAST:event_EditPistaButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaPistaButton;
    private javax.swing.JButton AltaPistaButton1;
    private javax.swing.JButton AltaUsuButton;
    private javax.swing.JButton EditPistaButton;
    private javax.swing.JButton EditPistaButton1;
    private javax.swing.JButton EditUsuButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
