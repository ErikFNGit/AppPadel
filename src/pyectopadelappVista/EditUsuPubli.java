package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class EditUsuPubli extends javax.swing.JFrame {


    public EditUsuPubli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEditar = new javax.swing.ButtonGroup();
        EditButton = new javax.swing.JButton();
        editAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        changePassUsuPubli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EditUsuDNI = new javax.swing.JTextField();
        EditUsuName = new javax.swing.JTextField();
        EditUsuSurname = new javax.swing.JTextField();
        EditUsuMail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        EditButton.setBackground(new java.awt.Color(0, 204, 255));
        EditButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditButton.setText("Editar");
        EditButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        editAtras.setBackground(new java.awt.Color(0, 204, 255));
        editAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editAtras.setText("Atras");
        editAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAtrasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Editar datos de Usuario");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Correo:");

        changePassUsuPubli.setBackground(new java.awt.Color(51, 255, 255));
        changePassUsuPubli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        changePassUsuPubli.setText("Cambiar Contraseña");
        changePassUsuPubli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        changePassUsuPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassUsuPubliActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel1.setText("DNI:");

        EditUsuDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuDNIActionPerformed(evt);
            }
        });

        EditUsuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuNameActionPerformed(evt);
            }
        });

        EditUsuSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuSurnameActionPerformed(evt);
            }
        });

        EditUsuMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUsuMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditUsuName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditUsuMail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditUsuSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditUsuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePassUsuPubli))
                        .addGap(18, 18, 18)
                        .addComponent(editAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EditUsuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditUsuSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EditUsuMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EditUsuDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(changePassUsuPubli)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton)
                    .addComponent(editAtras))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditUsuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuNameActionPerformed

    }//GEN-LAST:event_EditUsuNameActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
       Controlador.guardarEdicionUsuPubli();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void editAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.edUsuPubli);
        } catch (SQLException ex) {
            Logger.getLogger(EditUsuPubli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editAtrasActionPerformed

    private void EditUsuDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuDNIActionPerformed

    }//GEN-LAST:event_EditUsuDNIActionPerformed

    private void EditUsuSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuSurnameActionPerformed

    }//GEN-LAST:event_EditUsuSurnameActionPerformed

    private void EditUsuMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUsuMailActionPerformed
 
    }//GEN-LAST:event_EditUsuMailActionPerformed

    private void changePassUsuPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassUsuPubliActionPerformed
        Controlador.openChangePass();
    }//GEN-LAST:event_changePassUsuPubliActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    public javax.swing.JTextField EditUsuDNI;
    public javax.swing.JTextField EditUsuMail;
    public javax.swing.JTextField EditUsuName;
    public javax.swing.JTextField EditUsuSurname;
    public javax.swing.ButtonGroup buttonGroupEditar;
    private javax.swing.JButton changePassUsuPubli;
    private javax.swing.JButton editAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
