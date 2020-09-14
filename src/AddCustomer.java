
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
        showCustomers();
    }
    
     public ArrayList<Customer> customerList(){
        
    ArrayList<Customer> customerList=new ArrayList<>();
    
    try{
    Class.forName("com.mysql.jdbc.Driver");        
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Wholesale", "root", "");
    String query="select * from customer";
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    Customer customer;
    while(rs.next())
    {
        customer=new Customer(rs.getInt("CustomerID"), rs.getString("CustomerName"), rs.getString("CustomerTimeOfVisit"), rs.getInt("CustomerPhoneNumber"));
    customerList.add(customer);
    
    }
    
    
    
    
    }catch(Exception ex)
    {
   JOptionPane.showMessageDialog(null, ex);
    }
    return customerList;
    }
    
    public void showCustomers(){
        ArrayList<Customer> list=customerList();
        DefaultTableModel model=(DefaultTableModel)CustomerTable.getModel();
        Object[] row=new Object[4];
        for(int i=0; i<list.size(); i++)
        {
            row[0]=list.get(i).getCustomerID();
            row[1]=list.get(i).getCustomerName();
            row[2]=list.get(i).getCustomerTimeOfVisit();
            row[3]=list.get(i).getPhoneNumber();
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GoBackButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        AddCustomerLabel = new javax.swing.JLabel();
        NameTextbox = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        PhoneNumberTextbox = new javax.swing.JTextField();
        ViewCustomerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        AddCustomerLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        AddCustomerLabel.setText("Add Customer");

        NameTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextboxActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameLabel.setText("Phone Number:");

        NameLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameLabel1.setText("Name:");

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        PhoneNumberTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PhoneNumberTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextboxActionPerformed(evt);
            }
        });

        ViewCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ViewCustomerButton.setText("View All Customers");
        ViewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewCustomerButtonActionPerformed(evt);
            }
        });

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "CustomerName", "CustomerTimeOfVisit", "CustomerPhoneNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(GoBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 873, Short.MAX_VALUE)
                .addComponent(LogoutButton))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddCustomerLabel)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel1)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResetButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneNumberTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(ViewCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(LogoutButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(AddCustomerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ViewCustomerButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel1)
                            .addComponent(NameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(ResetButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButtonActionPerformed

        this.dispose();
        CustomerOptions ml=new CustomerOptions();
        ml.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_GoBackButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void NameTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextboxActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

     String name, phoneNumber;
     
     name=NameTextbox.getText();
     phoneNumber=PhoneNumberTextbox.getText();
     
     if(name.equals("") || phoneNumber.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Please enter values in the missing field(s)");
            return;
       }
     
       try {
     Integer.parseInt(phoneNumber);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter valid phone Number");
     PhoneNumberTextbox.setText("");
   return;
}
 
      if (phoneNumber.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Phone Number");
   return;
       }
     
     
     PreparedStatement ps;
       String query="INSERT INTO `Customer`(`CustomerName`, `CustomerPhoneNumber`) VALUES (?, ?)";
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phoneNumber);
           
            
            if(ps.executeUpdate()>0)
            {
                NameTextbox.setText("");
                PhoneNumberTextbox.setText("");
                JOptionPane.showMessageDialog(null, "Customer Added");
            }
            
 
            
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     
     
    
     
     








    }//GEN-LAST:event_AddButtonActionPerformed

    private void PhoneNumberTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextboxActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
                NameTextbox.setText("");
                PhoneNumberTextbox.setText("");
        

// TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ViewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewCustomerButtonActionPerformed
//Customer dikao
         PreparedStatement ps;
       ResultSet rs;
       String query="SELECT * FROM customer"; 
       
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)CustomerTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                Object o[]={rs.getInt("CustomerID"), rs.getString("CustomerName"), rs.getString("CustomerTimeOfVisit"), rs.getInt("CustomerPhoneNumber") };
                tm.addRow(o);
                
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }//GEN-LAST:event_ViewCustomerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddCustomerLabel;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JTextField NameTextbox;
    private javax.swing.JTextField PhoneNumberTextbox;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ViewCustomerButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}