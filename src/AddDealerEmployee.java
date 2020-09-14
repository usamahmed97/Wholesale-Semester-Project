
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
public class AddDealerEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddDealerEmployee
     */
    public AddDealerEmployee() {
        initComponents();
        showDealerEmployees();
    }
    
     public ArrayList<DEmployee> demployeeList(){
        
    ArrayList<DEmployee> demployeeList=new ArrayList<>();
    
    try{
    Class.forName("com.mysql.jdbc.Driver");        
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Wholesale", "root", "");
    String query="select * from dealeremployee";
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    DEmployee demployee;
    while(rs.next())
    {
        demployee=new DEmployee(rs.getString("Name"), rs.getString("UserName"), rs.getString("Phone"), rs.getString("Password"));
    demployeeList.add(demployee);
    
    }
    
    
    
    
    }catch(Exception ex)
    {
   JOptionPane.showMessageDialog(null, ex);
    }
    return demployeeList;
    }
    
    public void showDealerEmployees(){
        ArrayList<DEmployee> list=demployeeList();
        DefaultTableModel model=(DefaultTableModel)DEmployeeTable.getModel();
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

        GobackButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DeleteProductLabel = new javax.swing.JLabel();
        PasswordTextfield = new javax.swing.JTextField();
        PhoneNumberTextfield = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        NameTextfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserNameTextfield = new javax.swing.JTextField();
        CustomerEmployeeViewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DEmployeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GobackButton.setText("<--- Go back");
        GobackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GobackButtonActionPerformed(evt);
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
        DeleteProductLabel.setText("Add Dealer's Employee");

        PasswordTextfield.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PasswordTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextfieldActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Enter Name");

        ResetButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

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

        CustomerEmployeeViewButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CustomerEmployeeViewButton.setText("List of All the Employees Handling Suppliers (Dealers)");
        CustomerEmployeeViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerEmployeeViewButtonActionPerformed(evt);
            }
        });

        DEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DEmployeeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GobackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteProductLabel)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CustomerEmployeeViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(163, 163, 163))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GobackButton)
                    .addComponent(LogoutButton))
                .addGap(18, 18, 18)
                .addComponent(DeleteProductLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(UserNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(PasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(ResetButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(PhoneNumberTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(CustomerEmployeeViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GobackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GobackButtonActionPerformed

        this.dispose();
        DealerEmployee ml=new DealerEmployee();
        ml.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_GobackButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.dispose();
        MainPage mp=new MainPage();
        mp.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }

        PreparedStatement ps;
        String query="INSERT INTO `dealeremployee`(`Name`, `UserName`, `Phone`, `Password`) VALUES (?, ?, ?, ?)";
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
                JOptionPane.showMessageDialog(null, "New Employee (handling Dealers) added");
            }

            
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

    private void NameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextfieldActionPerformed

    private void UserNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTextfieldActionPerformed

    private void PasswordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextfieldActionPerformed

    private void CustomerEmployeeViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerEmployeeViewButtonActionPerformed

        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM dealeremployee";

        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)DEmployeeTable.getModel();
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
            java.util.logging.Logger.getLogger(AddDealerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDealerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDealerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDealerEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDealerEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton CustomerEmployeeViewButton;
    private javax.swing.JTable DEmployeeTable;
    private javax.swing.JLabel DeleteProductLabel;
    private javax.swing.JButton GobackButton;
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
