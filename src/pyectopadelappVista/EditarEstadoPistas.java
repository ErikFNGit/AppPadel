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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        checkNoDisponible = new javax.swing.JCheckBox();
        checkDisponible = new javax.swing.JCheckBox();
        idPista = new javax.swing.JTextField();
        guardarEdicion = new javax.swing.JButton();
        atrasEditarPistas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Editar datos de la pista");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Id de la pista:");

        checkNoDisponible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkNoDisponible.setText("No disponible");

        checkDisponible.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        checkDisponible.setText("Disponible");
        checkDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDisponibleActionPerformed(evt);
            }
        });

        idPista.setForeground(new java.awt.Color(255, 255, 255));
        idPista.setBorder(null);

        guardarEdicion.setBackground(new java.awt.Color(0, 204, 255));
        guardarEdicion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardarEdicion.setText("Guardar");
        guardarEdicion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        guardarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEdicionActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(guardarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idPista, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(atrasEditarPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5)
                            .addGap(23, 23, 23)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkNoDisponible)
                            .addComponent(checkDisponible))
                        .addGap(42, 42, 42)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(checkDisponible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkNoDisponible)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardarEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atrasEditarPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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
    // End of variables declaration//GEN-END:variables
}
