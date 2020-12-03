package telephonebillingsystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;


public abstract class Payment {
    
    private double amount;
    private String date;
    
    abstract void cardInfo();
    
    Payment(){
        this.amount = 0;
    }
    
    Payment(double amount, String date){
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date){
        Date d = Calendar.getInstance().getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        date = df.format(d);
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
