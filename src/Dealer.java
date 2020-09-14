
public class Dealer {
    
    String DealerName, DealerTimeOfSelling;
    int DealerID, DealerPhoneNumber;

    public Dealer(int DealerID, String DealerName, String DealerTimeOfSelling, int DealerPhoneNumber) {
        this.DealerName = DealerName;
        this.DealerTimeOfSelling = DealerTimeOfSelling;
        this.DealerID = DealerID;
        this.DealerPhoneNumber = DealerPhoneNumber;
    }

    public int getDealerID() {
        return DealerID;
    }

    public String getDealerName() {
        return DealerName;
    }

    public int getDealerPhoneNumber() {
        return DealerPhoneNumber;
    }

    public String getDealerTimeOfSelling() {
        return DealerTimeOfSelling;
    }
    
    
    
    
    
}
