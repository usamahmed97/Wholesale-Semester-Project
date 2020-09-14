
public class DEmployee {
    String Name, UserName, Phone, Password;

    public DEmployee(String Name, String UserName, String Phone, String Password) {
        this.Name = Name;
        this.UserName = UserName;
        this.Phone = Phone;
        this.Password = Password;
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
