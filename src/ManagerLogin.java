/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123
 */
public class ManagerLogin extends javax.swing.JFrame {
ManagerLogin ma;
    
    static int a=0;
    /**
     * Creates new form ManagerLogin
     */
    public ManagerLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        EmployeeMenuButton = new javax.swing.JButton();
        SupplierOptionsButton = new javax.swing.JButton();
        CustomerOptionsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        GoBackButton1 = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();
        CalculateRevenueButton1 = new javax.swing.JButton();
        CalculateRevenueButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(522, 390));
        setPreferredSize(new java.awt.Dimension(1380, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manager Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 40, 458, -1));

        EmployeeMenuButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EmployeeMenuButton.setText("Employee menu");
        EmployeeMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmployeeMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 127, 247, 100));

        SupplierOptionsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SupplierOptionsButton.setText("Supplier Options");
        SupplierOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierOptionsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SupplierOptionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, -1));

        CustomerOptionsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerOptionsButton.setText("Customer Options");
        CustomerOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerOptionsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerOptionsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        GoBackButton1.setText("<----   Go back");
        GoBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(GoBackButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        LogoutButton1.setText("Logout");
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        CalculateRevenueButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CalculateRevenueButton1.setText("Calculate Purchased Products Revenue");
        CalculateRevenueButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateRevenueButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(CalculateRevenueButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 540, 50));

        CalculateRevenueButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CalculateRevenueButton2.setText("Calculate Sold Products Revenue");
        CalculateRevenueButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateRevenueButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(CalculateRevenueButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 540, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmployeeMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeMenuButtonActionPerformed
this.dispose();
EmployeeMenu em=new EmployeeMenu();
em.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_EmployeeMenuButtonActionPerformed

    private void CustomerOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerOptionsButtonActionPerformed

        a=a+1;
        this.dispose();
         CustomerOptions co=new CustomerOptions();
         co.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_CustomerOptionsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void GoBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);
    }//GEN-LAST:event_GoBackButton1ActionPerformed

    private void SupplierOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierOptionsButtonActionPerformed

        a=a+1;
        this.dispose();
        SupplierOptions so=new SupplierOptions();
        so.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_SupplierOptionsButtonActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void CalculateRevenueButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateRevenueButton1ActionPerformed


// TODO add your handling code here:
        this.dispose();
        CalculateRevenue1 c=new CalculateRevenue1();
        c.setVisible(true);
       


    

    
// TODO add your handling code here:
    }//GEN-LAST:event_CalculateRevenueButton1ActionPerformed

    private void CalculateRevenueButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateRevenueButton2ActionPerformed

 this.dispose();
 CalculateRevenue a=new CalculateRevenue();
 a.setVisible(true);
            


// TODO add your handling code here:
    }//GEN-LAST:event_CalculateRevenueButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateRevenueButton1;
    private javax.swing.JButton CalculateRevenueButton2;
    private javax.swing.JButton CustomerOptionsButton;
    private javax.swing.JButton EmployeeMenuButton;
    private javax.swing.JButton GoBackButton1;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JButton SupplierOptionsButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
