package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class AltaUsu extends javax.swing.JFrame {

    public AltaUsu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorAltaUser1 = new javax.swing.JLabel();
        AltaUsuMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        errorAltaUser = new javax.swing.JLabel();
        AltaUsuDNI = new javax.swing.JTextField();
        errorDniNie = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        errorCorreo = new javax.swing.JLabel();
        AltaButton = new javax.swing.JButton();
        AltaUsuSurname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AltaUsuName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        altraAtras = new javax.swing.JButton();

        errorAltaUser1.setForeground(new java.awt.Color(255, 0, 0));
        errorAltaUser1.setText("Error, ya existe un usuario con ese DNI o mail");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Registro de usuarios");

        jLabel1.setText("DNI/NIE:");

        errorAltaUser.setForeground(new java.awt.Color(255, 0, 0));
        errorAltaUser.setText("Error, ya existe un usuario con ese DNI o mail");

        AltaUsuDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaUsuDNIActionPerformed(evt);
            }
        });

        errorDniNie.setForeground(new java.awt.Color(255, 0, 51));
        errorDniNie.setText("Error, DNI o NIE incorrecto");

        jLabel4.setText("Correo:");

        errorCorreo.setForeground(new java.awt.Color(255, 0, 51));
        errorCorreo.setText("Error, correo no valido");

        AltaButton.setBackground(new java.awt.Color(0, 204, 255));
        AltaButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AltaButton.setText("Dar de Alta");
        AltaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AltaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        AltaUsuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaUsuNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido:");

        altraAtras.setBackground(new java.awt.Color(0, 204, 255));
        altraAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        altraAtras.setText("Atras");
        altraAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        altraAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altraAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AltaUsuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AltaUsuMail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AltaUsuSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AltaUsuName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorDniNie)
                                    .addComponent(errorCorreo)
                                    .addComponent(errorAltaUser)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(AltaButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(altraAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaUsuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaUsuSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorCorreo)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AltaUsuMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AltaUsuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorAltaUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorDniNie)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaButton)
                    .addComponent(altraAtras))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltaUsuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaUsuNameActionPerformed

    }//GEN-LAST:event_AltaUsuNameActionPerformed

    private void AltaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaButtonActionPerformed
        try {
            Controlador.createUser();
        } catch (SQLException ex) {
            Logger.getLogger(AltaUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AltaButtonActionPerformed

    private void AltaUsuDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaUsuDNIActionPerformed
        
    }//GEN-LAST:event_AltaUsuDNIActionPerformed

    private void altraAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altraAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.newUsu);
        } catch (SQLException ex) {
            Logger.getLogger(AltaUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altraAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltaButton;
    public javax.swing.JTextField AltaUsuDNI;
    public javax.swing.JTextField AltaUsuMail;
    public javax.swing.JTextField AltaUsuName;
    public javax.swing.JTextField AltaUsuSurname;
    private javax.swing.JButton altraAtras;
    public javax.swing.JLabel errorAltaUser;
    public javax.swing.JLabel errorAltaUser1;
    public javax.swing.JLabel errorCorreo;
    public javax.swing.JLabel errorDniNie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
