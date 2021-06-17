package Mypackage;

public class Factorial {
	public static int fact(int num) {
		if (num < 0) {
			System.out.println("Factorial is not  possible");
			return -1;
		}
		else if(num == 0 || num == 1) {return 1;}
		return num*fact(num-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = fact(5);
		if(x != -1) {
			System.out.println("factorial is "+ x);
		}
	}

}
