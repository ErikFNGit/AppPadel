package pyectopadelappVista;

public class AltaPista extends javax.swing.JFrame {


    public AltaPista() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDNuevaPista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NuevaPistaReady = new javax.swing.JCheckBox();
        NuevaPistaNotReady = new javax.swing.JCheckBox();
        NuevaPistaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Creacion de pista");

        jLabel1.setText("ID de pista:");

        jLabel2.setText("Estado:");

        NuevaPistaReady.setText("Lista");
        NuevaPistaReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaReadyActionPerformed(evt);
            }
        });

        NuevaPistaNotReady.setText("En mantenimiento");
        NuevaPistaNotReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaNotReadyActionPerformed(evt);
            }
        });

        NuevaPistaButton.setText("Crear");
        NuevaPistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPistaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevaPistaNotReady)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IDNuevaPista))
                    .addComponent(NuevaPistaReady))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NuevaPistaButton)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDNuevaPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NuevaPistaReady))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevaPistaNotReady)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(NuevaPistaButton)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPistaReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaReadyActionPerformed

    }//GEN-LAST:event_NuevaPistaReadyActionPerformed

    private void NuevaPistaNotReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaNotReadyActionPerformed

    }//GEN-LAST:event_NuevaPistaNotReadyActionPerformed

    private void NuevaPistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPistaButtonActionPerformed

    }//GEN-LAST:event_NuevaPistaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDNuevaPista;
    private javax.swing.JButton NuevaPistaButton;
    private javax.swing.JCheckBox NuevaPistaNotReady;
    private javax.swing.JCheckBox NuevaPistaReady;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
