/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123
 */
public class DealerEmployeeFunctions extends javax.swing.JFrame {

    
    static int a=0;
    /**
     * Creates new form DealerEmployeeFunctions
     */
    public DealerEmployeeFunctions() {
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
        GoBackButton1 = new javax.swing.JButton();
        LogoutButton1 = new javax.swing.JButton();
        ProductOptionsButton = new javax.swing.JButton();
        SupplierOptionsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Kunstler Script", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dealer'sEmployee Menu ");

        GoBackButton1.setText("<----   Go back");
        GoBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButton1ActionPerformed(evt);
            }
        });

        LogoutButton1.setText("Logout");
        LogoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButton1ActionPerformed(evt);
            }
        });

        ProductOptionsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ProductOptionsButton.setText("Product Options");
        ProductOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductOptionsButtonActionPerformed(evt);
            }
        });

        SupplierOptionsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SupplierOptionsButton.setText("Supplier Options");
        SupplierOptionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierOptionsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(GoBackButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductOptionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SupplierOptionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton1)
                    .addComponent(GoBackButton1))
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(ProductOptionsButton)
                .addGap(23, 23, 23)
                .addComponent(SupplierOptionsButton)
                .addGap(206, 206, 206))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButton1ActionPerformed
        // TODO add your handling code here:

        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);

    }//GEN-LAST:event_GoBackButton1ActionPerformed

    private void LogoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButton1ActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButton1ActionPerformed

    private void ProductOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductOptionsButtonActionPerformed
        a=a+1;
        this.dispose();
        ProductOptions  po=new ProductOptions();
        po.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ProductOptionsButtonActionPerformed

    private void SupplierOptionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierOptionsButtonActionPerformed
        this.dispose();
        SupplierOptions so=new SupplierOptions();
        so.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SupplierOptionsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DealerEmployeeFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealerEmployeeFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealerEmployeeFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealerEmployeeFunctions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealerEmployeeFunctions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GoBackButton1;
    private javax.swing.JButton LogoutButton1;
    private javax.swing.JButton ProductOptionsButton;
    private javax.swing.JButton SupplierOptionsButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}