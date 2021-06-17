/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class MathEngine {
    public int multiply(int a,int b){
        System.out.println("Inside 2 int");
        return a*b;
    }
    public void multiply(int a,int b,int c){
        System.out.println("Inside void 3 ints: ");
        System.out.println(a*b*c);
    }
    public float multiply(float a,int b){
        System.out.println("Inside float int: ");
        return a*b;
    }
    public float multiply(int a,float b){
        System.out.println("Inside int float: ");
        return a*b;
    }
}
