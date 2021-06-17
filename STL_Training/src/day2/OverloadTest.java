/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine a = new MathEngine();
        System.out.println(a.multiply(5, 3));
        a.multiply(5, 6, 3);
        System.out.println(a.multiply(3.2f, 5));
        System.out.print(a.multiply(5, 1.4f));

	}

}
