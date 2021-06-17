/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateSG a = new MyDateSG();
		a.setDay(9);
		a.setMonth(6);
		a.setYear(2021);
		System.out.println("By Getter Date is:"+ a.getDay() + "/"+a.getMonth() + "/" + a.getYear());
		MyDateSG b = new MyDateSG(9,6,2021);
		System.out.println("By Getter Date is:"+ b.getDay() + "/"+ b.getMonth() + "/" + b.getYear());

	}

}
