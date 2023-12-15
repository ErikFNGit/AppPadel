package pyectopadelappVista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class cambiarPass extends javax.swing.JFrame {

    public cambiarPass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cambiarPassAtras = new javax.swing.JButton();
        cambiarPassUsu = new javax.swing.JButton();
        currentPass = new javax.swing.JPasswordField();
        newPass = new javax.swing.JPasswordField();
        errorCheckPass = new javax.swing.JLabel();
        newPassCheck = new javax.swing.JPasswordField();
        errorNewPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nueva contraseña:");

        jLabel1.setText("Contraseña actual:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Cambiar la contraseña");

        jLabel3.setText("Repita la contraseña:");

        cambiarPassAtras.setBackground(new java.awt.Color(0, 204, 255));
        cambiarPassAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cambiarPassAtras.setText("Atras");
        cambiarPassAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cambiarPassAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPassAtrasActionPerformed(evt);
            }
        });

        cambiarPassUsu.setBackground(new java.awt.Color(0, 204, 255));
        cambiarPassUsu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cambiarPassUsu.setText("Cambiar");
        cambiarPassUsu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cambiarPassUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPassUsuActionPerformed(evt);
            }
        });

        errorCheckPass.setForeground(new java.awt.Color(255, 0, 51));
        errorCheckPass.setText("La contraseña actual no coincide con la introducida");

        errorNewPass.setForeground(new java.awt.Color(255, 0, 51));
        errorNewPass.setText("Las contraseñas no coiniden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cambiarPassUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cambiarPassAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(errorCheckPass))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(currentPass)
                        .addComponent(newPass)
                        .addComponent(newPassCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(errorNewPass)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(errorCheckPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(errorNewPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambiarPassAtras)
                    .addComponent(cambiarPassUsu))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiarPassAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPassAtrasActionPerformed
        Controlador.atrasChangePass();
    }//GEN-LAST:event_cambiarPassAtrasActionPerformed

    private void cambiarPassUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPassUsuActionPerformed
        System.out.println("BOTON");
        try {
            Controlador.confirmarCambiarPass();
        } catch (SQLException ex) {
            Logger.getLogger(cambiarPass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cambiarPassUsuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiarPassAtras;
    public javax.swing.JButton cambiarPassUsu;
    public javax.swing.JPasswordField currentPass;
    public javax.swing.JLabel errorCheckPass;
    public javax.swing.JLabel errorNewPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JPasswordField newPass;
    public javax.swing.JPasswordField newPassCheck;
    // End of variables declaration//GEN-END:variables
}
