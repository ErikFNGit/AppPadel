package pyectopadelappVista;

import java.lang.System.Logger;
import java.sql.SQLException;
import java.util.logging.Level;
import pyectopadelappControlador.Controlador;
import static pyectopadelappControlador.Controlador.calendarioAdmin;


public class CalendarioReservasAdmin extends javax.swing.JFrame {

    public CalendarioReservasAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSeleccion = new javax.swing.JButton();
        reservaAtras = new javax.swing.JButton();
        calendarioPistas = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonSeleccion.setText("Seleccionar");
        buttonSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSeleccionActionPerformed(evt);
            }
        });

        reservaAtras.setText("Atras");
        reservaAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservaAtrasActionPerformed(evt);
            }
        });

        calendarioPistas.setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Dia para consultar reservas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(calendarioPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(buttonSeleccion)
                        .addGap(69, 69, 69)
                        .addComponent(reservaAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendarioPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeleccion)
                    .addComponent(reservaAtras))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSeleccionActionPerformed
        try {
            Controlador.obtenerReservasDiaAdmin();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CalendarioReservasAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSeleccionActionPerformed

    private void reservaAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservaAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.calendarioAdmin);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reservaAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttonSeleccion;
    public com.toedter.calendar.JCalendar calendarioPistas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton reservaAtras;
    // End of variables declaration//GEN-END:variables
}
