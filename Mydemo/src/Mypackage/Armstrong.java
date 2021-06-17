package Mypackage;

public class Armstrong {
	public static void armstrong(int n) {
		int temp = n,sum=0,rem;
		int l = String.valueOf(n).length();
		while(temp%10 != 0) {
			rem = temp % 10;
			temp = temp/10;
			sum += Math.pow(rem,l);
		}
		if(sum == n) {
			System.out.println("Number " + n + " is Armstrong");
		}
		else {
			System.out.println("Number "+ n +" is not Armstrong");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);
	}

}
