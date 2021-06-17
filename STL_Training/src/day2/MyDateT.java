/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class MyDateT {
	private int day,month,year;
    public MyDateT(){
        this(9,6,2021);
        System.out.println("Default Constructor");
    }
    public MyDateT(int day,int month,int year){
        System.out.println("Parameterized Constructor");
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
    public void printDate(){
        System.out.println("Date is : "+ day + "/"+month + "/" + year);
    }
}
