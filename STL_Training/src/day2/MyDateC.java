/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class MyDateC {
	private int day,month,year;
    public MyDateC(){
        day = 8;
        month = 6;
        year = 2021;
    }
    public void printDate(){
        System.out.println("Date is : "+ day + "/"+month + "/" + year);
    }

}
