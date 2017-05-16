package vista;

import controlador.MainClass;
import javax.swing.JOptionPane;

public class Ingresar extends javax.swing.JFrame {

    public Ingresar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_Ingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_CodEje = new javax.swing.JTextField();
        txt_LibroName = new javax.swing.JTextField();
        txt_AutorName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_codigo = new javax.swing.JRadioButton();
        jRadioButton_nombre = new javax.swing.JRadioButton();
        txt_CodLib = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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

        txt_LibroName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_LibroName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_LibroName.setText("Nombre del libro");
        txt_LibroName.setToolTipText("Nombre del Libro");
        txt_LibroName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_LibroNameMouseClicked(evt);
            }
        });

        txt_AutorName.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_AutorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_AutorName.setText("Nombre del autor");
        txt_AutorName.setToolTipText("Nombre del autor");
        txt_AutorName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_AutorNameMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        jLabel2.setText("Busqueda por:");

        buttonGroup1.add(jRadioButton_codigo);
        jRadioButton_codigo.setSelected(true);
        jRadioButton_codigo.setText("codigo");

        buttonGroup1.add(jRadioButton_nombre);
        jRadioButton_nombre.setText("nombre");

        txt_CodLib.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txt_CodLib.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_CodLib.setText("Codigo del libro");
        txt_CodLib.setToolTipText("Nombre del Libro");
        txt_CodLib.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_CodLibMouseClicked(evt);
            }
        });

        jLabel3.setText("Obligatorio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jRadioButton_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton_nombre)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_LibroName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CodLib, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_AutorName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_codigo)
                    .addComponent(jRadioButton_nombre))
                .addGap(18, 18, 18)
                .addComponent(txt_LibroName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_CodLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_AutorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_CodEje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

    private void txt_LibroNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_LibroNameMouseClicked
        txt_LibroName.setText("");
    }//GEN-LAST:event_txt_LibroNameMouseClicked

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        System.out.println(jRadioButton_codigo.isSelected());
        if (jRadioButton_codigo.isSelected()) {
            int codEjem = Integer.parseInt(txt_CodEje.getText());
            int codLibro = Integer.parseInt(txt_CodLib.getText());
            String autorName = txt_AutorName.getText().toLowerCase();
            JOptionPane.showMessageDialog(this, MainClass.agregarEjemplar(codLibro, codEjem, autorName));
        } else {
            int codEjem = Integer.parseInt(txt_CodEje.getText());
            String libroName = txt_LibroName.getText().toLowerCase();
            String autorName = txt_AutorName.getText().toLowerCase();
            MainClass.agregarEjemplar(libroName, codEjem, autorName);
            JOptionPane.showMessageDialog(this, MainClass.agregarEjemplar(libroName, codEjem, autorName));
        }


    }//GEN-LAST:event_btn_IngresarActionPerformed

    private void txt_AutorNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_AutorNameMouseClicked
        txt_AutorName.setText("");
    }//GEN-LAST:event_txt_AutorNameMouseClicked

    private void txt_CodLibMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_CodLibMouseClicked
        txt_CodLib.setText("");
    }//GEN-LAST:event_txt_CodLibMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_codigo;
    private javax.swing.JRadioButton jRadioButton_nombre;
    private javax.swing.JTextField txt_AutorName;
    private javax.swing.JTextField txt_CodEje;
    private javax.swing.JTextField txt_CodLib;
    private javax.swing.JTextField txt_LibroName;
    // End of variables declaration                   
}
