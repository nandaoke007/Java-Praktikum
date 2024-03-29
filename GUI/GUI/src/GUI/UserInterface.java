package GUI;

import javax.swing.JOptionPane;


public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        awalCB = new javax.swing.JComboBox<>();
        akhirCB = new javax.swing.JComboBox<>();
        awalTF = new javax.swing.JTextField();
        akhirTF = new javax.swing.JTextField();
        convertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Temp. Converter");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Temperature Converter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        awalCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        getContentPane().add(awalCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 112, 92, 30));

        akhirCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        getContentPane().add(akhirCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 233, 92, 30));

        awalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                awalTFActionPerformed(evt);
            }
        });
        getContentPane().add(awalTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 112, 190, 30));

        akhirTF.setEditable(false);
        akhirTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akhirTFActionPerformed(evt);
            }
        });
        getContentPane().add(akhirTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 233, 190, 30));

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        getContentPane().add(convertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 178, -1, -1));

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 178, 69, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 281, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void awalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_awalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_awalTFActionPerformed

    // method untuk exception (inputan harus angka)
    public void ConvertSuhu() throws InputHarusAngkaException{
        double suhuDouble;
        String inputan = awalTF.getText();
        inputan = inputan.trim(); 
        
        try
        {
            suhuDouble = Double.parseDouble(inputan);
        }
        catch(NumberFormatException e)
        {
            throw new InputHarusAngkaException();
        }
    }
    
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
       
        // memanggil try catch untuk menampilkan jOptionPane
        try {
            this.ConvertSuhu();
        } catch (InputHarusAngkaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        // OPERASI PERHITUNGAN KONVERSI
        String box1 = (String)awalCB.getSelectedItem();
        String box2 = (String)akhirCB.getSelectedItem();
        
        // dari celcius
        if(box1.equals("Celcius") && box2.equals("Fahrenheit")){
            double c = Double.parseDouble(awalTF.getText());
            
            double k = (double)(c * 1.8 + 32);
            
            akhirTF.setText(String.valueOf(k));
        }
        
        if(box1.equals("Celcius") && box2.equals("Kelvin")){
            double c = Double.parseDouble(awalTF.getText());
            
            double f = (double)(c + 273);
            
            akhirTF.setText(String.valueOf(f));
        }
        
        if(box1.equals("Celcius") && box2.equals("Reamur")){
            double c = Double.parseDouble(awalTF.getText());
            
            double r = (double)(0.8 * c);
            
            akhirTF.setText(String.valueOf(r));
        }
       
        if(box1.equals("Celcius") && box2.equals("Celcius")){
            double c = Double.parseDouble(awalTF.getText());
            
            akhirTF.setText(String.valueOf(c));
        }
        
        // dari fahrenheit
        if(box1.equals("Fahrenheit") && box2.equals("Celcius")){
            double f = Double.parseDouble(awalTF.getText());
            
            double c = (double)((f - 32)* 0.56);
            
            akhirTF.setText(String.valueOf(c));
        }
        
        if(box1.equals("Fahrenheit") && box2.equals("Kelvin")){
            double f = Double.parseDouble(awalTF.getText());
            
            double k = (double)((f - 32)* 0.56 + 273);
            
            akhirTF.setText(String.valueOf(k));
        }
        
        if(box1.equals("Fahrenheit") && box2.equals("Reamur")){
            double f = Double.parseDouble(awalTF.getText());
            
            double r = (double)((f - 32) * (0.44));
            
            akhirTF.setText(String.valueOf(r));
        }
        
        if(box1.equals("Fahrenheit") && box2.equals("Fahrenheit")){
            double f = Double.parseDouble(awalTF.getText());
            
            akhirTF.setText(String.valueOf(f));
        }
        
        // dari kelvin 
        if(box1.equals("Kelvin") && box2.equals("Celcius")){
            double k = Double.parseDouble(awalTF.getText());
            
            double c = (double)(k - 273);
            
            akhirTF.setText(String.valueOf(c));
        }
        
        if(box1.equals("Kelvin") && box2.equals("Fahrenheit")){
            double k = Double.parseDouble(awalTF.getText());
            
            double f = (double)((k - 273) * 1.8 +32);
            
            akhirTF.setText(String.valueOf(f));
        }
        
        if(box1.equals("Kelvin") && box2.equals("Reamur")){
            double k = Double.parseDouble(awalTF.getText());
            
            double r = (double)((k - 273) * (0.8));
            
            akhirTF.setText(String.valueOf(r));
        }
        
        if(box1.equals("Kelvin") && box2.equals("Kelvin")){
            double k = Double.parseDouble(awalTF.getText());
            
            akhirTF.setText(String.valueOf(k));
        }

        // dari reamur 
        if(box1.equals("Reamur") && box2.equals("Celcius")){
            double r = Double.parseDouble(awalTF.getText());
            
            double c = (double)(r * (1.2));
            
            akhirTF.setText(String.valueOf(c));
        }
        
        if(box1.equals("Reamur") && box2.equals("Fahrenheit")){
            double r = Double.parseDouble(awalTF.getText());
            
            double f = (double)( (r * (1.8)) +32);
            
            akhirTF.setText(String.valueOf(f));
        }
        
        if(box1.equals("Reamur") && box2.equals("Kelvin")){
            double r = Double.parseDouble(awalTF.getText());
            
            double k = (double)((1.2 * r) + 273);
            
            akhirTF.setText(String.valueOf(k));
        }
        
        if(box1.equals("Reamur") && box2.equals("Reamur")){
            double r= Double.parseDouble(awalTF.getText());
            
            akhirTF.setText(String.valueOf(r));
        }
        
    }//GEN-LAST:event_convertButtonActionPerformed

    private void akhirTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akhirTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_akhirTFActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        awalTF.setText("");
        akhirTF.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> akhirCB;
    private javax.swing.JTextField akhirTF;
    private javax.swing.JComboBox<String> awalCB;
    private javax.swing.JTextField awalTF;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton convertButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
