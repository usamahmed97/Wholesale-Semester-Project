
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


public class SearchProduct extends javax.swing.JFrame {

    
    public SearchProduct() {
        initComponents();
         showProducts();
    }
    
    public ArrayList<Products> productList(){
        
    ArrayList<Products> productList=new ArrayList<>();
    
    try{
    Class.forName("com.mysql.jdbc.Driver");        
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/Wholesale", "root", "");
    String query="select * from products";
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery(query);
    Products products;
    while(rs.next())
    {
        products=new Products(rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("ProductQuantity"), rs.getInt("ProductPrice"), rs.getString("ProductDescription"));
    productList.add(products);
    
    }
    
    
    
    
    }catch(Exception ex)
    {
   JOptionPane.showMessageDialog(null, ex);
    }
    return productList;
    }
    
    public void showProducts(){
        ArrayList<Products> list=productList();
        DefaultTableModel model=(DefaultTableModel)SearchProductTable.getModel();
        Object[] row=new Object[5];
        for(int i=0; i<list.size(); i++)
        {
            row[0]=list.get(i).getProductID();
            row[1]=list.get(i).getProductName();
            row[2]=list.get(i).getProductQuantity();
            row[3]=list.get(i).getProductPrice();
            row[4]=list.get(i).getProductDescription();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchProductLabel = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        SearchIDTextbox = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchProductTable = new javax.swing.JTable();
        GoBackButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        invalid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchProductLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        SearchProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchProductLabel.setText("Search Product");

        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchIDTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SearchIDTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDTextboxActionPerformed(evt);
            }
        });

        IDLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IDLabel.setText("ID:");

        SearchProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "ProductQuantity", "ProductPrice", "ProductDescription", "BoughtFromDealer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SearchProductTable);

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

        invalid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        invalid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(GoBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 216, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invalid, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchProductLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDLabel)
                        .addGap(18, 18, 18)
                        .addComponent(SearchIDTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(SearchButton)))
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(jButton4))
                .addGap(51, 51, 51)
                .addComponent(SearchProductLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchButton)
                        .addComponent(SearchIDTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(invalid)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        MainPage c=new MainPage();
        c.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchIDTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchIDTextboxActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
//Product search bhai jaan
        String SearchedID=SearchIDTextbox.getText();
       if(SearchedID.equals("") )
       {
            JOptionPane.showMessageDialog(null, "Please enter values in the missing field");
            return;
       }
     PreparedStatement ps;
      ResultSet rs; 
        try {
            String query="SELECT * FROM `products` WHERE `ProductID` =?";
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, SearchedID);
            
             rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)SearchProductTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                Object o[]={rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("ProductQuantity"), rs.getInt("ProductPrice"), rs.getString("ProductDescription"), rs.getInt("BoughtFromDealer")};
                tm.addRow(o);
                
            }
           
           
            
           
            
 
       

    
          
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        






    }//GEN-LAST:event_SearchButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchIDTextbox;
    private javax.swing.JLabel SearchProductLabel;
    private javax.swing.JTable SearchProductTable;
    private javax.swing.JLabel invalid;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
