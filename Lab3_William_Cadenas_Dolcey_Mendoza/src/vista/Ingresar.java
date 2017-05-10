package vista;

public class Ingresar extends javax.swing.JFrame {

    public Ingresar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_CodEje = new javax.swing.JTextField();
        txt_AutorName = new javax.swing.JTextField();
        txt_EjemName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Ingresar.setBackground(new java.awt.Color(250, 250, 250));
        btn_Ingresar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btn_Ingresar.setText("Ingresar ejemplar");
        btn_Ingresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR EJEMPLAR");
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

        txt_AutorName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_AutorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AutorName.setText("Nombre de Autor");
        txt_AutorName.setToolTipText("Nombre de Autor");
        txt_AutorName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_AutorNameMouseClicked(evt);
            }
        });

        txt_EjemName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_EjemName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EjemName.setText("Nombre de Ejemplar");
        txt_EjemName.setToolTipText("Nombre de Ejemplar");
        txt_EjemName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_EjemNameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_AutorName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txt_EjemName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_EjemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_AutorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btn_Ingresar)
                .addContainerGap())
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
    }// </editor-fold>                        

    private void txt_CodEjeMouseClicked(java.awt.event.MouseEvent evt) {                                        
        txt_CodEje.setText("");
    }                                       

    private void txt_AutorNameMouseClicked(java.awt.event.MouseEvent evt) {                                           
        txt_AutorName.setText("");
    }                                          

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String cod=txt_CodEje.getText();
        String name=txt_EjemName.getText();
        String autor=txt_AutorName.getText();
    }                                            

    private void txt_EjemNameMouseClicked(java.awt.event.MouseEvent evt) {                                          
        txt_EjemName.setText("");
    }                                         

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_AutorName;
    private javax.swing.JTextField txt_CodEje;
    private javax.swing.JTextField txt_EjemName;
    // End of variables declaration                   
}
