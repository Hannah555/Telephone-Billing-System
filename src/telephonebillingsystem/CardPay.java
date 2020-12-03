
package telephonebillingsystem;

import java.util.Scanner;

public class CardPay extends Payment{
    
    protected String type;
    protected String name;
    protected String cardNum;
    protected int cvv;
    protected int expYear;
    protected int expMonth;
    
    CardPay(){
        
    }
    
    CardPay(double amount, String date){
        super(amount, date);
    }

    public CardPay(String type, String name, String cardNum, int cvv, int expYear, int expMonth) {
        this.type = type;
        this.name = name;
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expYear = expYear;
        this.expMonth = expMonth;
    }

    public CardPay(String type, String name, String cardNum, int cvv, int expYear, int expMonth, double amount, String date) {
        super(amount, date);
        this.type = type;
        this.name = name;
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.expYear = expYear;
        this.expMonth = expMonth;
    }
    
    @Override
    void cardInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Card: Type: ");
        type = scan.next();
        
        System.out.println("Card name: ");
        name = scan.next();
        
        System.out.println("CVV: ");
        cvv = scan.nextInt();
        
        System.out.println("Card Number: ");
        cardNum = scan.next();
        
        System.out.println("Exp. Month: ");
        expMonth = scan.nextInt();
        
        System.out.println("Exp. Year: ");
        expYear = scan.nextInt();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public int getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }
    
}
