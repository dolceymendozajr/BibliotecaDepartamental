package vista;

public class Entregar extends javax.swing.JFrame {

    public Entregar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Entregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_CodEje = new javax.swing.JTextField();
        txt_CodUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Entregar.setBackground(new java.awt.Color(250, 250, 250));
        btn_Entregar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btn_Entregar.setText("Entregar ejemplar");
        btn_Entregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_Entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTREGAR EJEMPLAR");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        txt_CodEje.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_CodEje.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CodEje.setText("Codigo de Ejemplar");
        txt_CodEje.setToolTipText("Codigo de Ejemplar");
        txt_CodEje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CodEjeMouseClicked(evt);
            }
        });

        txt_CodUser.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_CodUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CodUser.setText("Codigo de Usuario");
        txt_CodUser.setToolTipText("Codigo de Usuario");
        txt_CodUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CodUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_CodUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_Entregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntregarActionPerformed
        String cod_user=txt_CodUser.getText();
        String cod_ejem=txt_CodEje.getText();
        /*Se agrega a la lista de Ejemplares*/
    }//GEN-LAST:event_btn_EntregarActionPerformed

    private void txt_CodEjeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CodEjeMouseClicked
        txt_CodEje.setText("");
    }//GEN-LAST:event_txt_CodEjeMouseClicked

    private void txt_CodUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CodUserMouseClicked
        txt_CodUser.setText("");
    }//GEN-LAST:event_txt_CodUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Entregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_CodEje;
    private javax.swing.JTextField txt_CodUser;
    // End of variables declaration//GEN-END:variables
}
