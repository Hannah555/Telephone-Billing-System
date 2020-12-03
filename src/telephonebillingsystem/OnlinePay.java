
package telephonebillingsystem;

import java.util.Scanner;


public class OnlinePay extends Payment{

    protected String userId;
    protected String password;
    
    OnlinePay(double amount, String date){
        super(amount,date);
    }

    public OnlinePay(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public OnlinePay(String userId, String password, double amount, String date) {
        super(amount, date);
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    void cardInfo() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter user ID: ");
        userId = scan.next();
        
        System.out.println("Enter password: ");
        password = scan.next();
    }

}
