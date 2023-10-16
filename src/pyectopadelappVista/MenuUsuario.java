package pyectopadelappVista;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;
public class MenuUsuario extends javax.swing.JFrame {


    public MenuUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuReservarPista = new javax.swing.JButton();
        menuPerfilUsu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenid@ a PadelApp");

        menuReservarPista.setText("Reservar");
        menuReservarPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservarPistaActionPerformed(evt);
            }
        });

        menuPerfilUsu.setText("Mi perfil");
        menuPerfilUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuReservarPista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuPerfilUsu))
                    .addComponent(jLabel1))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuReservarPista)
                    .addComponent(menuPerfilUsu))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuReservarPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservarPistaActionPerformed
        
    }//GEN-LAST:event_menuReservarPistaActionPerformed

    private void menuPerfilUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilUsuActionPerformed
        Controlador.cargarDatosPerfilUsuario();
    }//GEN-LAST:event_menuPerfilUsuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton menuPerfilUsu;
    private javax.swing.JButton menuReservarPista;
    // End of variables declaration//GEN-END:variables
}
