
public class CustomerOptions extends javax.swing.JFrame {

    ManagerLogin ml; 
    public CustomerOptions() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerOptionsLabel = new javax.swing.JLabel();
        SearchCustomerButton = new javax.swing.JButton();
        AddCustomerButton = new javax.swing.JButton();
        GoBackButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DeleteCustomer = new javax.swing.JButton();
        UpdateCustomerButton = new javax.swing.JButton();
        OrderMenu = new javax.swing.JButton();
        OrderMenu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CustomerOptionsLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        CustomerOptionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerOptionsLabel.setText("Customer Options");

        SearchCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchCustomerButton.setText("Search Customer");
        SearchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCustomerButtonActionPerformed(evt);
            }
        });

        AddCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddCustomerButton.setText("Add Customer");
        AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerButtonActionPerformed(evt);
            }
        });

        GoBackButton.setText("<---Go back");
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

        DeleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeleteCustomer.setText("Delete Customer");
        DeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerActionPerformed(evt);
            }
        });

        UpdateCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UpdateCustomerButton.setText("Update Customer");
        UpdateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCustomerButtonActionPerformed(evt);
            }
        });

        OrderMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OrderMenu.setText("Order Option");
        OrderMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderMenuActionPerformed(evt);
            }
        });

        OrderMenu1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OrderMenu1.setText("Order History");
        OrderMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GoBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CustomerOptionsLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(SearchCustomerButton)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateCustomerButton)
                                    .addComponent(AddCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OrderMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OrderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoBackButton)
                    .addComponent(LogoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CustomerOptionsLabel)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCustomerButton)
                    .addComponent(AddCustomerButton))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteCustomer)
                    .addComponent(UpdateCustomerButton))
                .addGap(18, 18, 18)
                .addComponent(OrderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed

        if (ml.a==1)
        { this.dispose();
ManagerLogin a=new ManagerLogin();
a.setVisible(true);
        ml.a=ml.a-1;
        }
        else
        {
            this.dispose();
            CustomerEmployeeFunctions cef=new CustomerEmployeeFunctions();
            cef.setVisible(true);
        }
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void SearchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCustomerButtonActionPerformed

        this.dispose();
        SearchCustomer sc=new SearchCustomer();
        sc.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_SearchCustomerButtonActionPerformed

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed

        this.dispose();
        AddCustomer uc=new AddCustomer();
        uc.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerActionPerformed
       
        this.dispose();
        DeleteCustomer dc=new DeleteCustomer();
        dc.setVisible(true);
    
// TODO add your handling code here:
    }//GEN-LAST:event_DeleteCustomerActionPerformed

    private void UpdateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCustomerButtonActionPerformed
       
        this.dispose();
        UpdateCustomer dc=new UpdateCustomer();
        dc.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_UpdateCustomerButtonActionPerformed

    private void OrderMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderMenuActionPerformed
        this.dispose();
        OrderOption cr=new OrderOption();
        cr.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderMenuActionPerformed

    private void OrderMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderMenu1ActionPerformed
this.dispose();
OrderHistory a=new OrderHistory();
a.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_OrderMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JLabel CustomerOptionsLabel;
    private javax.swing.JButton DeleteCustomer;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OrderMenu;
    private javax.swing.JButton OrderMenu1;
    private javax.swing.JButton SearchCustomerButton;
    private javax.swing.JButton UpdateCustomerButton;
    // End of variables declaration//GEN-END:variables
}
