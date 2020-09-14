
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UpdateProduct extends javax.swing.JFrame {

    
    public UpdateProduct() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateProductLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        IDTextbox = new javax.swing.JTextField();
        NameTextbox = new javax.swing.JTextField();
        QuantityTextbox = new javax.swing.JTextField();
        PriceTextbox = new javax.swing.JTextField();
        DesriptionTextbox = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        NameLabel1 = new javax.swing.JLabel();
        DealerIDbox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UpdateProductLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        UpdateProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateProductLabel.setText("Update Product");

        IDLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IDLabel.setText("Enter Product ID to update:");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameLabel.setText("Name:");

        QuantityLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QuantityLabel.setText("Quantity:");

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceLabel.setText("Price:");

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DescriptionLabel.setText("Description:");

        IDTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        NameTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        QuantityTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QuantityTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityTextboxActionPerformed(evt);
            }
        });

        PriceTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextboxActionPerformed(evt);
            }
        });

        DesriptionTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        GoBackButton.setText("<--- Go Back");
        GoBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Log out");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        NameLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameLabel1.setText("Dealer ID:");

        DealerIDbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(UpdateButton)
                        .addGap(18, 18, 18)
                        .addComponent(ResetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GoBackButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DesriptionTextbox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(IDTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DealerIDbox, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(PriceTextbox)
                                                    .addComponent(QuantityTextbox)
                                                    .addComponent(NameTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))))
                                        .addGap(0, 153, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addComponent(UpdateProductLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(IDLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(LogoutButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UpdateProductLabel)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IDLabel)
                        .addComponent(IDTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DealerIDbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameTextbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescriptionLabel)
                    .addComponent(DesriptionTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(ResetButton))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed
        this.dispose();
        ProductOptions a=new ProductOptions();
        a.setVisible(true);
        //        this.dispose();
        //        ManagerLogin ml=new ManagerLogin();
        //        ml.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void QuantityTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityTextboxActionPerformed

    private void PriceTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextboxActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        //update karlo bhai
        
        String  ProductName, ProductDescription;
        String  ProductID, ProductQuantity, ProductPrice, DealerID;
        
        ProductID=IDTextbox.getText();
        ProductName= NameTextbox.getText();
        ProductQuantity=QuantityTextbox.getText();
        ProductPrice=PriceTextbox.getText();
        ProductDescription= DesriptionTextbox.getText();
        DealerID=DealerIDbox.getText();
            
     
         if( ProductName.equals("") ||ProductQuantity.equals("")|| ProductPrice.equals("") || ProductDescription.equals("") ||DealerID.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Please enter values in the missing fields");
            return;
       }
         if(ProductID.equals(""))
         {
               JOptionPane.showMessageDialog(null, "Please enter Product ID");
               return;
         }
               try {
     Integer.parseInt(ProductID);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for Product ID");
   return;
}
        
         try {
     Integer.parseInt(DealerID);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for  Dealer ID");
   return;
}
        
        
        
          try {
     Integer.parseInt(ProductQuantity);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for quantity");
   return;
}
        
           try {
     Integer.parseInt(ProductPrice);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for price");
   return;
}
   
            if ( ProductID.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
             if ( ProductName.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
              if ( ProductQuantity.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
              
                 if ( ProductPrice.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
                 
                    if ( DealerID.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
              
         PreparedStatement ps;
      ResultSet rs; 
       
        try {
            String query="UPDATE `products` SET `ProductName`=?,`ProductQuantity`=?,`ProductPrice`=?,`ProductDescription`=?,`BoughtFromDealer`=? WHERE `ProductID`=?";
            ps=MyConnection.getConnection().prepareStatement(query);
            
           
            ps.setString(1, ProductName);
            ps.setString(2, ProductQuantity);
            ps.setString(3, ProductPrice);
            ps.setString(4, ProductDescription);
             ps.setString(5, ProductID);
             ps.setString(6, DealerID);
            
            if(ps.executeUpdate()>0)
            {
                IDTextbox.setText("");
                NameTextbox.setText("");
                QuantityTextbox.setText("");
                PriceTextbox.setText("");
                DesriptionTextbox.setText("");
                DealerIDbox.setText("");
                
                JOptionPane.showMessageDialog(null, "Product Updated succesfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "No such product exist");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        





    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed

        
 IDTextbox.setText("");
                NameTextbox.setText("");
                QuantityTextbox.setText("");
                PriceTextbox.setText("");
                DesriptionTextbox.setText("");
                DealerIDbox.setText("");


// TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DealerIDbox;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DesriptionTextbox;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextbox;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JTextField NameTextbox;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTextbox;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField QuantityTextbox;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UpdateProductLabel;
    // End of variables declaration//GEN-END:variables
}
