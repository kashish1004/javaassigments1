/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class Account {
	//private data members
	private int accNo;
    private String ownerName;
    private double balance;
    private float durationYears;
    //static data members
    private static float interestRate;
    private static int count;
    //static init block
    static{
        interestRate = 0.05f;
    }
    public Account(){
        System.out.println("Default Constructor");
        accNo = 12345;
        ownerName = "xyz";
        balance = 2000689.90;
        durationYears = 1.5f;
        count++;
    }
    public Account(int accNo,String ownerName,double balance, float durationYears){
        this.accNo = accNo;
        this.ownerName = ownerName;
        this.balance = balance;
        this.durationYears = durationYears;
        System.out.println("Parameterized Constructor");
        count++;
    }
    //Setter Methods
    public void setAccountno(int accNO){
        this.accNo = accNO;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    //Getter Methods
    public int getAccountno(){
        return accNo;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }
    public static void setInterestRate(float interestRate){
        Account.interestRate = interestRate;
    }
    public static float getInterestRate(){
        return interestRate;
    }
    public static int getCount(){
        return count;
    }
    public void calculateInterest(){
        double interest = balance*interestRate*durationYears;
        System.out.println("Interest is: "+interest);
    }
    public void printDetails(){
        System.out.println("Account Details:");
        System.out.println("Account Number is: "+accNo+", Owner Name is: "+ownerName+", Balance is: "+balance);
    }
}
