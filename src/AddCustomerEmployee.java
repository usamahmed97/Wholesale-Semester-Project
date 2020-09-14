
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
public class AddCustomerEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomerEmployee
     */
    public AddCustomerEmployee() {
        initComponents();
         showCustomerEmployees();
    }
    
   public ArrayList<CEmployee> cemployeeList(){
        
    ArrayList<CEmployee> cemployeeList=new ArrayList<>();
    
    try{
    Class.forName("com.mysql.jdbc.Driver");        
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Wholesale", "root", "");
    String query="select * from customeremployee";
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    CEmployee cemployee;
    while(rs.next())
    {
        cemployee=new CEmployee(rs.getString("Name"), rs.getString("UserName"), rs.getString("Phone"), rs.getString("Password"));
    cemployeeList.add(cemployee);
    
    }
    
    
    
    
    }catch(Exception ex)
    {
   JOptionPane.showMessageDialog(null, ex);
    }
    return cemployeeList;
    }
    
    public void showCustomerEmployees(){
        ArrayList<CEmployee> list=cemployeeList();
        DefaultTableModel model=(DefaultTableModel)CEmployeeTable.getModel();
        Object[] row=new Object[4];
        for(int i=0; i<list.size(); i++)
        {
            row[0]=list.get(i).getName();
            row[1]=list.get(i).getUserName();
            row[2]=list.get(i).getPhone();
            row[3]=list.get(i).getPassword();
            
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

        GoBackButton1 = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DeleteProductLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameTextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserNameTextfield = new javax.swing.JTextField();
        PasswordTextfield = new javax.swing.JTextField();
        PhoneNumberTextfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        CustomerEmployeeViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        DeleteProductLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        DeleteProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteProductLabel.setText("Add Customer's Employee");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Name");

        NameTextfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextfieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Enter UserName");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Enter Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Enter Phone Number");

        UserNameTextfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        UserNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextfieldActionPerformed(evt);
            }
        });

        PasswordTextfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        PhoneNumberTextfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PhoneNumberTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTextfieldActionPerformed(evt);
            }
        });

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

        CustomerEmployeeViewButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerEmployeeViewButton.setText("List of All the Employees Dealing with customers");
        CustomerEmployeeViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerEmployeeViewButtonActionPerformed(evt);
            }
        });

        CEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "UserName", "Phone", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CEmployeeTable);

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
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)
                                .addComponent(PasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomerEmployeeViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(DeleteProductLabel)))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton1)
                    .addComponent(LogoutButton))
                .addGap(35, 35, 35)
                .addComponent(DeleteProductLabel)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(UserNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(PhoneNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(ResetButton))
                .addGap(42, 42, 42)
                .addComponent(CustomerEmployeeViewButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoBackButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CustomerEmployee c=new CustomerEmployee();
        c.setVisible(true);
    }//GEN-LAST:event_GoBackButton1ActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void NameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextfieldActionPerformed

    private void UserNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTextfieldActionPerformed

    private void PhoneNumberTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTextfieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        
        String name, username, password, phoneNumber;
       name=NameTextfield.getText();
       username=UserNameTextfield.getText();
       phoneNumber=PhoneNumberTextfield.getText();
       password= PasswordTextfield.getText();  
       if(name.equals("") || username.equals("") ||phoneNumber.equals("")|| password.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Please enter values in the missing fields");
            return;
       }
      
       try{
        Integer.parseInt(phoneNumber);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter valid phone Number");
     PhoneNumberTextfield.setText("");
    
   return;
}
        if (phoneNumber.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Phone Number");
   return;
       }
        
       
  
       
       
       PreparedStatement ps;
       String query="INSERT INTO `customeremployee`(`Name`, `UserName`, `Phone`, `Password`) VALUES (?, ?, ?, ?)";
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, phoneNumber);
            ps.setString(4,password );
            
            if(ps.executeUpdate()>0)
            {
                NameTextfield.setText("");
                UserNameTextfield.setText("");
                PhoneNumberTextfield.setText("");
                PasswordTextfield.setText("");
                JOptionPane.showMessageDialog(null, "New Employee (dealing with customers) added");
            }
            
 
            
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
       NameTextfield.setText("");
                UserNameTextfield.setText("");
                PhoneNumberTextfield.setText("");
                PasswordTextfield.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void CustomerEmployeeViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerEmployeeViewButtonActionPerformed
       
       PreparedStatement ps;
       ResultSet rs;
       String query="SELECT * FROM customeremployee"; 
       
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)CEmployeeTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                Object o[]={rs.getString("Name"), rs.getString("UserName"), rs.getInt("Phone"), rs.getString("Password") };
                tm.addRow(o);
                
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_CustomerEmployeeViewButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddCustomerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTable CEmployeeTable;
    private javax.swing.JButton CustomerEmployeeViewButton;
    private javax.swing.JLabel DeleteProductLabel;
    private javax.swing.JButton GoBackButton1;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NameTextfield;
    private javax.swing.JTextField PasswordTextfield;
    private javax.swing.JTextField PhoneNumberTextfield;
    private javax.swing.JButton ResetButton;
    private javax.swing.JTextField UserNameTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}