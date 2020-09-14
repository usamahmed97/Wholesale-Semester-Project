
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CalculateRevenue extends javax.swing.JFrame {

    
    public CalculateRevenue() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RevenueLabel = new javax.swing.JLabel();
        FromLabel = new javax.swing.JLabel();
        ToLabel = new javax.swing.JLabel();
        FromTextBox = new javax.swing.JTextField();
        ToTextBox = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        GoBackButton1 = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RevenueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        FinalTotalRevenueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RevenueLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        RevenueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RevenueLabel.setText(" PP Revenue Calculator");

        FromLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FromLabel.setText("From :");

        ToLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ToLabel.setText("To :");

        FromTextBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        FromTextBox.setText("2019-04-20");
        FromTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FromTextBoxActionPerformed(evt);
            }
        });

        ToTextBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ToTextBox.setText("2019-04-28");
        ToTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToTextBoxActionPerformed(evt);
            }
        });

        CalculateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        GoBackButton1.setText("<----   Go back");
        GoBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoBackButton1ActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        RevenueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "OID", "Date", "CustomerID", "total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RevenueTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Final Total Revenue:");

        FinalTotalRevenueLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rule: Enter value in the yyyy-mm-dd format");

        Reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GoBackButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(RevenueLabel)
                            .addGap(55, 55, 55))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FinalTotalRevenueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FromLabel)
                        .addGap(6, 6, 6)
                        .addComponent(FromTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(ToLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ToTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton1)
                    .addComponent(LogoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RevenueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromLabel)
                    .addComponent(ToLabel)
                    .addComponent(ToTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CalculateButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FinalTotalRevenueLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FromTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FromTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FromTextBoxActionPerformed

    private void GoBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ManagerLogin c=new ManagerLogin();
        c.setVisible(true);
    }//GEN-LAST:event_GoBackButton1ActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage mp=new MainPage();
        mp.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ToTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToTextBoxActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed

        FromTextBox.setToolTipText("yyyy-mm-dd");
ToTextBox.setToolTipText("yyyy-mm-dd");
        String FirstDate=FromTextBox.getText();
        String fullFirstDate,  fullLastDate;
        
        
        String SecondDate=ToTextBox.getText();
        fullFirstDate=FirstDate+" ________";
        fullLastDate=SecondDate+" ________";
        if(FirstDate.equals("") || SecondDate.equals(""))
        {
             JOptionPane.showMessageDialog(null, "Please enter values in the missing field(s)");
             return;
        }
        
      if(FirstDate.length()>10 || FirstDate.length()<10 || SecondDate.length()<10 || SecondDate.length()>10)
       {
            JOptionPane.showMessageDialog(null, "Please enter values according to the correct format");
       return;
       }
       
      
       
       
       PreparedStatement ps;
       ResultSet rs;
        
       
        try {
            String query="SELECT * FROM `order` WHERE `Date` BETWEEN ? AND ? ";
            
            ps=MyConnection.getConnection().prepareStatement(query);
             ps.setString(1,fullFirstDate );
             ps.setString(2, fullLastDate);
           // ps.setString(1, CustomerID);
            rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)RevenueTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                Object o[]={rs.getInt("OID"), rs.getTimestamp("Date"), rs.getInt("CustomerID"),rs.getInt("total")};
                tm.addRow(o);
                
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
          int z=0;
  for(int y=0; y<RevenueTable.getRowCount(); y++)
  {
      z+=Integer.parseInt(RevenueTable.getValueAt(y, 3).toString());
      
  }
  jLabel2.setText(z+".00");

        
        




    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
RevenueTable.setModel(new DefaultTableModel (null, new String[]{"OID", "Date", "CustomerID", "ProductPrice", "Total"}));
jLabel2.setText("");// TODO add your handling code here:
FromTextBox.setText("0000-00-00");
ToTextBox.setText("0000-00-00");
jLabel2.setText("0.00");
    }//GEN-LAST:event_ResetActionPerformed

    
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
            java.util.logging.Logger.getLogger(CalculateRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateRevenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateRevenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateButton;
    private javax.swing.JLabel FinalTotalRevenueLabel;
    private javax.swing.JLabel FromLabel;
    private javax.swing.JTextField FromTextBox;
    private javax.swing.JButton GoBackButton1;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel RevenueLabel;
    private javax.swing.JTable RevenueTable;
    private javax.swing.JLabel ToLabel;
    private javax.swing.JTextField ToTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
