/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class MyDateSG {
	private int day,month,year;
    public MyDateSG(){
        day = 9;
        month = 6;
        year = 2021;
        System.out.println("Default Constructor");
    }
    public MyDateSG(int day,int month,int year){
        System.out.println("Parameterized Constructor");
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
    public void setDay(int day) {
    	this.day = day;
    }
    public void setMonth(int month) {
    	this.month = month;
    }
    public void setYear(int year) {
    	this.year = year;
    }
    public int getDay() {
    	return day;
    }
    public int getMonth() {
    	return month;
    }
    public int getYear() {
    	return year;
    }
    public void printDate(){
        System.out.println("Date is : "+ day + "/"+month + "/" + year);
    }
}
