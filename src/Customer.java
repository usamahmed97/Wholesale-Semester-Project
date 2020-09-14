
public class Customer {
    int CustomerID, PhoneNumber;
    String CustomerName, CustomerTimeOfVisit;

    public Customer(int CustomerID, String CustomerName, String CustomerTimeOfVisit, int CustomerPhoneNumber) {
    
        this.CustomerID=CustomerID;
        this.CustomerName=CustomerName;
        this.CustomerTimeOfVisit=CustomerTimeOfVisit;
        this.PhoneNumber=CustomerPhoneNumber;
        
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getCustomerTimeOfVisit() {
        return CustomerTimeOfVisit;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }
    
    
           
    
}
