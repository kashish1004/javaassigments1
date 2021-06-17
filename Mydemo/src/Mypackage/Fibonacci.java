package Mypackage;

public class Fibonacci {
	public static void fibo(int t) {
		int a = 0,b = 1,c;
		if (t > 1) {
		System.out.print(a + " "+ b +" ");
		for(int i = 0; i < t-2;i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
		}
		else {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(5);
	}

}
