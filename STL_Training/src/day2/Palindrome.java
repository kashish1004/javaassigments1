/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class Palindrome {
	public static boolean checkPalindrome(String s) {
		int i = 0,j = s.length()-1,flag = 0;
		while(i<j) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}
			else {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = checkPalindrome("abcdcba");
		if(a == true) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
