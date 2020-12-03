
package telephonebillingsystem;


public class Account {
    
    private String phoneNumber;
    private String password;
    private Bill bills;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public Bill getBills() {
        return bills;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    Account(){
        this.phoneNumber = "014-567890";
        this.password = "1234";
    }
    
    public boolean verifyLogin(Account account){
        return (this.phoneNumber== account.phoneNumber && this.password==account.password);
    }
    
    public String toString(){
        return bills.toString();
    }
    
}
