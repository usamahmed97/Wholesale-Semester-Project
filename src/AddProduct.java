
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
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
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
        DefaultTableModel model=(DefaultTableModel)ProductsTable.getModel();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GoBackButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        AddProductLabel = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        PriceLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        NameTextbox = new javax.swing.JTextField();
        QuantityTextbox = new javax.swing.JTextField();
        PriceTextbox = new javax.swing.JTextField();
        DesriptionTextbox = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ViewProductsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        BoughtFromDealerTextbox = new javax.swing.JTextField();
        PriceLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        AddProductLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AddProductLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddProductLabel.setText("Add Product");

        Reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceLabel.setText("Price:");

        DescriptionLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DescriptionLabel.setText("Description:");

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
        DesriptionTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesriptionTextboxActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NameLabel.setText("Name:");

        QuantityLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        QuantityLabel.setText("Quantity:");

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ViewProductsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ViewProductsButton.setText("View Products");
        ViewProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsButtonActionPerformed(evt);
            }
        });

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ProductsTable);

        BoughtFromDealerTextbox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BoughtFromDealerTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoughtFromDealerTextboxActionPerformed(evt);
            }
        });

        PriceLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PriceLabel1.setText("Bought From Dealer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GoBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PriceLabel)
                                    .addComponent(NameLabel))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(PriceTextbox))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PriceLabel1)
                                    .addComponent(QuantityLabel))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QuantityTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BoughtFromDealerTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DesriptionTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(AddProductLabel)))
                        .addGap(0, 370, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ViewProductsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(436, 436, 436)
                                .addComponent(AddButton)
                                .addGap(18, 18, 18)
                                .addComponent(Reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GoBackButton)
                    .addComponent(jButton4))
                .addGap(44, 44, 44)
                .addComponent(AddProductLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PriceLabel)
                            .addComponent(PriceLabel1)
                            .addComponent(BoughtFromDealerTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(QuantityTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionLabel)
                    .addComponent(DesriptionTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset)
                    .addComponent(AddButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewProductsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
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

    private void QuantityTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityTextboxActionPerformed

    private void PriceTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextboxActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        String id, name, quantity, price, description, BoughtFromDealer;
        
        name=NameTextbox.getText();
        quantity=QuantityTextbox.getText();
        price=PriceTextbox.getText();
        description=DesriptionTextbox.getText();
        BoughtFromDealer=BoughtFromDealerTextbox.getText();
        if( name.equals("") ||quantity.equals("")|| price.equals("") || description.equals("")||BoughtFromDealer.equals(""))
       {
            JOptionPane.showMessageDialog(null, "Please enter values in the missing fields");
            return;
       }
        
        
        
        
          try {
     Integer.parseInt(quantity);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for quantity");
    QuantityTextbox.setText("");
   
   return;
}
          
          try {
     Integer.parseInt(BoughtFromDealer);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please Enter valid value of Dealer ID");
    BoughtFromDealerTextbox.setText("");
   
   return;
}
        
           try {
     Integer.parseInt(price);
        }
catch (NumberFormatException e)
{
   JOptionPane.showMessageDialog(null, "Please enter numeric value for price");
     PriceTextbox.setText("");
   return;
}
            if (price.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
             if (quantity.startsWith("-"))
       {
             JOptionPane.showMessageDialog(null, "Please enter a right numeric value in Price");
   return;
       }
           PreparedStatement ps1;
      ResultSet rs1; 
        try {
            String query1="SELECT * FROM `dealer` WHERE `DealerID`=?";
            ps1=MyConnection.getConnection().prepareStatement(query1);
            ps1.setString(1, BoughtFromDealer);
            
             rs1=ps1.executeQuery();
            
           
            
            if(rs1.next())
            {
                
                   
        PreparedStatement ps;
       String query="INSERT INTO `Products`( `ProductName`, `ProductQuantity`, `ProductPrice`, `ProductDescription`, `BoughtFromDealer`) VALUES (?, ?, ?, ?, ?)";
       
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            
            ps.setString(1, name);
            ps.setString(2, quantity);
            ps.setString(3, price);
            ps.setString(4, description);
             ps.setString(5, BoughtFromDealer);
            
            if(ps.executeUpdate()>0)
            {
                
                NameTextbox.setText("");
                QuantityTextbox.setText("");
                PriceTextbox.setText("");
                DesriptionTextbox.setText("");
                 BoughtFromDealerTextbox.setText("");
                
                JOptionPane.showMessageDialog(null, "Product added");
            }
            
  

        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No such Dealer ID in the records");
            }
        }
           
         catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DesriptionTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesriptionTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesriptionTextboxActionPerformed

    private void ViewProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsButtonActionPerformed

       PreparedStatement ps;
       ResultSet rs;
       String query="SELECT * FROM products"; 
       
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)ProductsTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next())
            {
                Object o[]={rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("ProductQuantity"), rs.getInt("ProductPrice"), rs.getString("ProductDescription"), rs.getInt("BoughtFromDealer") };
                tm.addRow(o);
                
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ViewProductsButtonActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        
                NameTextbox.setText("");
                QuantityTextbox.setText("");
                PriceTextbox.setText("");
                DesriptionTextbox.setText("");
                BoughtFromDealerTextbox.setText("");

    }//GEN-LAST:event_ResetActionPerformed

    private void BoughtFromDealerTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoughtFromDealerTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoughtFromDealerTextboxActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddProductLabel;
    private javax.swing.JTextField BoughtFromDealerTextbox;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField DesriptionTextbox;
    private javax.swing.JButton GoBackButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextbox;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel PriceLabel1;
    private javax.swing.JTextField PriceTextbox;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JTextField QuantityTextbox;
    private javax.swing.JButton Reset;
    private javax.swing.JButton ViewProductsButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
