

public class Products {
    private int ProductID, ProductQuantity, ProductPrice;
    private String ProductName, ProductDescription;

    public Products(int id, String name, int quantity, int price, String description) {
    
        this.ProductID=id;
        this.ProductName=name;
        this.ProductQuantity=quantity;
        this.ProductPrice=price;
        this.ProductDescription=description;
        
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public int getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }

   
    
}
