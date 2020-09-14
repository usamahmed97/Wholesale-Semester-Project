
public class CEmployee {
    String Name, UserName, Password, Phone;

    public CEmployee(String Name, String UserName,String Phone, String Password ) {
        this.Name = Name;
        this.UserName = UserName;
        this.Password = Password;
        this.Phone = Phone;
    }

   

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }

    public String getUserName() {
        return UserName;
    }
    
    
    
    
    
}
