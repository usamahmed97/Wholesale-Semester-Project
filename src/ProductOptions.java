
public class ProductOptions extends javax.swing.JFrame {

    ManagerLogin ml;
    
    public ProductOptions() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductOptionsLabel = new javax.swing.JLabel();
        SeachProductButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        DeleteProductButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        AddProductButton1 = new javax.swing.JButton();
        ShortProductsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductOptionsLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ProductOptionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProductOptionsLabel.setText("Product Options");

        SeachProductButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SeachProductButton.setText("Search Product");
        SeachProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachProductButtonActionPerformed(evt);
            }
        });

        GoBackButton.setText("<--- Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Log out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        DeleteProductButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeleteProductButton.setText("Delete Product");
        DeleteProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductButtonActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("Update Product");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        AddProductButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddProductButton1.setText("Add Product");
        AddProductButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButton1ActionPerformed(evt);
            }
        });

        ShortProductsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ShortProductsButton.setText("View Short Products");
        ShortProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShortProductsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GoBackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(ProductOptionsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AddProductButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SeachProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShortProductsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoBackButton)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(ProductOptionsLabel)
                .addGap(11, 11, 11)
                .addComponent(SeachProductButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteProductButton)
                .addGap(11, 11, 11)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(AddProductButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ShortProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
       
        if (ml.a==1)               //               1 for going back to manager
        { this.dispose();        //                 0 for going back to customers
SupplierOptions a=new SupplierOptions();
a.setVisible(true);
        ml.a=ml.a-1;
        }
        else
        {
            this.dispose();
            DealerEmployeeFunctions cef=new DealerEmployeeFunctions();
            cef.setVisible(true);
        }
//        this.dispose();
//        ManagerLogin ml=new ManagerLogin();
//        ml.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void SeachProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachProductButtonActionPerformed
    
        this.dispose();
        SearchProduct sp=new SearchProduct();
        sp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_SeachProductButtonActionPerformed

    private void DeleteProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductButtonActionPerformed
this.dispose();
DeleteProduct dp=new DeleteProduct();
dp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_DeleteProductButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        this.dispose();
UpdateProduct dp=new UpdateProduct();
dp.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddProductButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButton1ActionPerformed
       
        this.dispose();
        AddProduct c=new AddProduct();
        c.setVisible(true); 

// TODO add your handling code here:
    }//GEN-LAST:event_AddProductButton1ActionPerformed

    private void ShortProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShortProductsButtonActionPerformed
this.dispose();
ViewShortProducts a =new ViewShortProducts();
a.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_ShortProductsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductButton1;
    private javax.swing.JButton DeleteProductButton;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel ProductOptionsLabel;
    private javax.swing.JButton SeachProductButton;
    private javax.swing.JButton ShortProductsButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
