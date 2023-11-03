package pyectopadelappVista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;
public class PerfilUsuario extends javax.swing.JFrame {


    public PerfilUsuario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        editarReservarUsuBoton = new javax.swing.JButton();
        editarPerfilUsuBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        perilUsuarioName = new javax.swing.JTextField();
        perfilUsuarioSurname = new javax.swing.JTextField();
        perfilUsuarioDni = new javax.swing.JTextField();
        perfilUsuarioCorreo = new javax.swing.JTextField();
        editarPerfilUsuBoton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Mi perfil");

        editarReservarUsuBoton.setText("Mis Reservas");
        editarReservarUsuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarReservarUsuBotonActionPerformed(evt);
            }
        });

        editarPerfilUsuBoton.setText("Editar perfil");
        editarPerfilUsuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilUsuBotonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Correo:");

        perilUsuarioName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perilUsuarioNameActionPerformed(evt);
            }
        });

        perfilUsuarioSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioSurnameActionPerformed(evt);
            }
        });

        perfilUsuarioDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioDniActionPerformed(evt);
            }
        });

        perfilUsuarioCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioCorreoActionPerformed(evt);
            }
        });

        editarPerfilUsuBoton1.setText("Atras");
        editarPerfilUsuBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilUsuBoton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(perfilUsuarioCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(perfilUsuarioDni, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perfilUsuarioSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(perilUsuarioName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editarPerfilUsuBoton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editarPerfilUsuBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(editarReservarUsuBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(perilUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(perfilUsuarioSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(perfilUsuarioDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(perfilUsuarioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarReservarUsuBoton)
                    .addComponent(editarPerfilUsuBoton))
                .addGap(18, 18, 18)
                .addComponent(editarPerfilUsuBoton1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarPerfilUsuBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPerfilUsuBotonActionPerformed
        Controlador.abrirYCargarDatos();
    }//GEN-LAST:event_editarPerfilUsuBotonActionPerformed

    private void perfilUsuarioSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioSurnameActionPerformed
        perfilUsuarioSurname.setEditable(false);
    }//GEN-LAST:event_perfilUsuarioSurnameActionPerformed

    private void perfilUsuarioDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioDniActionPerformed
       perfilUsuarioDni.setEditable(false);
    }//GEN-LAST:event_perfilUsuarioDniActionPerformed

    private void perilUsuarioNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perilUsuarioNameActionPerformed
        perilUsuarioName.setEnabled(false);
    }//GEN-LAST:event_perilUsuarioNameActionPerformed

    private void perfilUsuarioCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilUsuarioCorreoActionPerformed
        perfilUsuarioCorreo.setEditable(false);
    }//GEN-LAST:event_perfilUsuarioCorreoActionPerformed

    private void editarPerfilUsuBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPerfilUsuBoton1ActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.profileUsu);
        } catch (SQLException ex) {
            Logger.getLogger(PerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarPerfilUsuBoton1ActionPerformed

    private void editarReservarUsuBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarReservarUsuBotonActionPerformed
        try {
            Controlador.listReservas();
        } catch (SQLException ex) {
            Logger.getLogger(PerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarReservarUsuBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarPerfilUsuBoton;
    private javax.swing.JButton editarPerfilUsuBoton1;
    private javax.swing.JButton editarReservarUsuBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField perfilUsuarioCorreo;
    public javax.swing.JTextField perfilUsuarioDni;
    public javax.swing.JTextField perfilUsuarioSurname;
    public javax.swing.JTextField perilUsuarioName;
    // End of variables declaration//GEN-END:variables
}
