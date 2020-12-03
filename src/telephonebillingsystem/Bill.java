/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonebillingsystem;


import java.util.*;


public class Bill {
    private String billId;
    private double billTotal;
    private String billDate;
    private String billStatus;
    private double smsCharge;
    private double callCharge;
    private double videoCall;
    private double Intpackage;
    private int count;
    private String item;
    private Payment pay;
    
    
   
    Bill(){
        this.smsCharge = 0.0;
        this.videoCall = 0.0;
        this.callCharge = 0.0;
    }
    
    Bill(Payment pay, String billId, String billDate){
        this.pay = pay;
        this.billId = billId;
        this.billDate = billDate;
    }

    Bill(String billId, String billDate) {
        
    }

    Bill(String billId, String billDate, double billTotal, String billStatus) {
        this.billId = billId;
        this.billDate = billDate;
        this.billTotal = billTotal;
        this.billStatus = billStatus;
    }
   
    public void billGenerate(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter bill ID: ");
        billId = scan.next();
        
        System.out.println("Enter bill's date: ");
        billDate = scan.next();
        
    }
    
    public double calcSMS(){
        Scanner sc = new Scanner(System.in);
        double quantity = sc.nextInt();
        
        smsCharge = 0.1 * quantity;
        return smsCharge;
    }
    
    public double calcVideoCall(){
        Scanner sc = new Scanner(System.in);
        double minute = sc.nextInt();
        
        for(int i=0; i<minute; i++){
            videoCall += 0.36;
        }
        
        return videoCall;
        
    }
    
    public double calcCall(){
        Scanner sc = new Scanner(System.in);
        double minute = sc.nextInt();
        
        for(int i=0; i<minute; i++){
            callCharge += 0.36;
        }
        
        return callCharge;
    }
    
    public double calcTotal(){
        billTotal = calcSMS() + calcVideoCall() + calcCall();
        return billTotal;
    }
    
    public double calcIntPackage(){
        
        displayPackage();
        Scanner sc = new Scanner(System.in);
        item = sc.next();
        
        switch (item) {
            case "P1":
                Intpackage = 65.0;
                break;
            case "P2":
                Intpackage = 45.0;
                break;
            case "P3":
                Intpackage = 30.0;
                break;
            case "P4":
                Intpackage = 15.0;
                break;
            case "P5":
                Intpackage = 10.0;
                break;
            case "P6":
                Intpackage = 5.0;
                break;
            case "P7":
                Intpackage = 3.0;
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
        return Intpackage;
    }

    public void displayPackage(){
        System.out.println("P1 - Monthly Package(10GB)");
        System.out.println("P2 - Monthly Package(5GB)");
        System.out.println("P3 - Monthly Package(2GB)");
        System.out.println("P4 - Weekly Package(10GB)");
        System.out.println("P5 - Weekly Package(5GB)");
        System.out.println("P6 - Daily Package(5GB)");
        System.out.println("P7 - Daily Package(2GB)");
    }
    
    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getBillTotal() {
        return billTotal;
    }

    public void setBillTotal(double billTotal) {
        this.billTotal = billTotal;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public double getSmsCharge() {
        return smsCharge;
    }

    public void setSmsCharge(double smsCharge) {
        this.smsCharge = smsCharge;
    }

    public double getCallCharge() {
        return callCharge;
    }

    public void setCallCharge(double callCharge) {
        this.callCharge = callCharge;
    }

    public double getVideoCall() {
        return videoCall;
    }

    public void setVideoCall(double videoCall) {
        this.videoCall = videoCall;
    }

    public double getIntpackage() {
        return Intpackage;
    }

    public void setIntpackage(double Intpackage) {
        this.Intpackage = Intpackage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }
    
    public String toString(){
        String y = pay.getDate();
        String result = y;
        return result;
    }
    
}
