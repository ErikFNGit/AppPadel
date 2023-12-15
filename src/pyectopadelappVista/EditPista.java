package pyectopadelappVista;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyectopadelappControlador.Controlador;
import static pyectopadelappControlador.Controlador.editField;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;

public class EditPista extends javax.swing.JFrame {

    public EditPista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        NuevaPistaButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPistas = new javax.swing.JList<>();
        listaPistasAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Editar datos de la pista");

        NuevaPistaButton1.setBackground(new java.awt.Color(0, 204, 255));
        NuevaPistaButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NuevaPistaButton1.setText("Editar");
        NuevaPistaButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NuevaPistaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaButton1ActionPerformed(evt);
            }
        });

        listaPistas.setBackground(new java.awt.Color(204, 204, 255));
        listaPistas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPistas);

        listaPistasAtras.setBackground(new java.awt.Color(0, 204, 255));
        listaPistasAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listaPistasAtras.setText("Atras");
        listaPistasAtras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listaPistasAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPistasAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NuevaPistaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaPistasAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevaPistaButton1)
                    .addComponent(listaPistasAtras))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPistaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaButton1ActionPerformed
        try {
            Controlador.cargarDatosPistaEditar();
        } catch (SQLException ex) {
            Logger.getLogger(EditPista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NuevaPistaButton1ActionPerformed

    private void listaPistasAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPistasAtrasActionPerformed
        try {
            Controlador.volverYLimpiarButton(Controlador.editField);
        } catch (SQLException ex) {
            Logger.getLogger(EditUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listaPistasAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NuevaPistaButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JList<String> listaPistas;
    public javax.swing.JButton listaPistasAtras;
    // End of variables declaration//GEN-END:variables
}
