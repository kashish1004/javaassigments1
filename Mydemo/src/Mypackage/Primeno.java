package Mypackage;

public class Primeno {
	public static String prime(int n) {
		int flag = 0;
		for(int i = 2;i<=Math.ceil(Math.sqrt(n));i++) {
			if (n%i == 0) {
				flag = 1;
				return "Not Prime";
			}
		}
		if (flag == 0) {
			return "Prime";
		}
		return "Not Prime";
	}
	public static void main(String[] args) {
		String s = prime(4);
		System.out.println(s);
	}

}
