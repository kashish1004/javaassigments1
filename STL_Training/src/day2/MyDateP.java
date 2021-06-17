/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class MyDateP {
	private int day,month,year;
    public MyDateP(){
        System.out.println("Default Constructor");
        day = 8;
        month = 6;
        year = 2021;
    }
    public MyDateP(int d,int m,int y){
        System.out.println("Parameterized Constructor");
        day = d;
        month = m;
        year = y;
        
    }
    public void printDate(){
        System.out.println("Date is : "+ day + "/"+month + "/" + year);
    }
    

}
