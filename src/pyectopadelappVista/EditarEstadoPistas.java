package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;


public class EditarEstadoPistas extends javax.swing.JFrame {

 
    public EditarEstadoPistas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDisponible = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        checkNoDisponible = new javax.swing.JCheckBox();
        checkDisponible = new javax.swing.JCheckBox();
        atrasEditarPistas = new javax.swing.JButton();
        guardarEdicion = new javax.swing.JButton();
        idPista = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        checkNoDisponible.setBackground(new java.awt.Color(0, 0, 204));
        checkNoDisponible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkNoDisponible.setForeground(new java.awt.Color(255, 255, 255));
        checkNoDisponible.setText("No disponible");

        checkDisponible.setBackground(new java.awt.Color(0, 0, 204));
        checkDisponible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkDisponible.setForeground(new java.awt.Color(255, 255, 255));
        checkDisponible.setText("Disponible");
        checkDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDisponibleActionPerformed(evt);
            }
        });

        atrasEditarPistas.setBackground(new java.awt.Color(0, 204, 255));
        atrasEditarPistas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        atrasEditarPistas.setText("Atras");
        atrasEditarPistas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atrasEditarPistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasEditarPistasActionPerformed(evt);
            }
        });

        guardarEdicion.setBackground(new java.awt.Color(0, 204, 255));
        guardarEdicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardarEdicion.setText("Guardar");
        guardarEdicion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEdicionActionPerformed(evt);
            }
        });

        idPista.setBackground(new java.awt.Color(0, 0, 204));
        idPista.setForeground(new java.awt.Color(255, 255, 255));
        idPista.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id de la pista:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar datos de la pista");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guardarEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idPista, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atrasEditarPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkNoDisponible)
                    .addComponent(checkDisponible))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(checkDisponible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkNoDisponible)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardarEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(atrasEditarPistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEdicionActionPerformed
        try {
            Controlador.guardarEdicionPista();
        } catch (SQLException ex) {
            Logger.getLogger(EditarEstadoPistas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarEdicionActionPerformed

    private void atrasEditarPistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasEditarPistasActionPerformed
        Controlador.backStatusFieldChange();
    }//GEN-LAST:event_atrasEditarPistasActionPerformed

    private void checkDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDisponibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasEditarPistas;
    public javax.swing.ButtonGroup buttonGroupDisponible;
    public javax.swing.JCheckBox checkDisponible;
    public javax.swing.JCheckBox checkNoDisponible;
    private javax.swing.JButton guardarEdicion;
    public javax.swing.JTextField idPista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
