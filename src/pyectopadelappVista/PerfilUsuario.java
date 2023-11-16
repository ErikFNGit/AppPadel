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

        jPanel1 = new javax.swing.JPanel();
        perilUsuarioName = new javax.swing.JTextField();
        perfilUsuarioSurname = new javax.swing.JTextField();
        perfilUsuarioCorreo = new javax.swing.JTextField();
        editarPerfilUsuBoton1 = new javax.swing.JButton();
        perfilUsuarioDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editarPerfilUsuBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editarReservarUsuBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

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

        perfilUsuarioCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioCorreoActionPerformed(evt);
            }
        });

        editarPerfilUsuBoton1.setBackground(new java.awt.Color(0, 204, 255));
        editarPerfilUsuBoton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarPerfilUsuBoton1.setText("Atras");
        editarPerfilUsuBoton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarPerfilUsuBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilUsuBoton1ActionPerformed(evt);
            }
        });

        perfilUsuarioDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilUsuarioDniActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DNI:");

        editarPerfilUsuBoton.setBackground(new java.awt.Color(0, 204, 255));
        editarPerfilUsuBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarPerfilUsuBoton.setText("Editar perfil");
        editarPerfilUsuBoton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarPerfilUsuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPerfilUsuBotonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        editarReservarUsuBoton.setBackground(new java.awt.Color(0, 204, 255));
        editarReservarUsuBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarReservarUsuBoton.setText("Mis Reservas");
        editarReservarUsuBoton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editarReservarUsuBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarReservarUsuBotonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mi perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(perfilUsuarioCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(perfilUsuarioDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(perfilUsuarioSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(perilUsuarioName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(editarPerfilUsuBoton1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(editarPerfilUsuBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(editarReservarUsuBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(perilUsuarioName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perfilUsuarioSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(perfilUsuarioDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(perfilUsuarioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarReservarUsuBoton)
                    .addComponent(editarPerfilUsuBoton))
                .addGap(18, 18, 18)
                .addComponent(editarPerfilUsuBoton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField perfilUsuarioCorreo;
    public javax.swing.JTextField perfilUsuarioDni;
    public javax.swing.JTextField perfilUsuarioSurname;
    public javax.swing.JTextField perilUsuarioName;
    // End of variables declaration//GEN-END:variables
}
