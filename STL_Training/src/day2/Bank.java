/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
package day2;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Interest Rate is: "+Account.getInterestRate());
        Account a = new Account();
        a.setAccountno(56789);
        a.setBalance(3456789.15);
        a.setOwnerName("Pqr");
        System.out.println("Account number is: "+a.getAccountno());
        System.out.println("Owner Name is: "+a.getOwnerName());
        System.out.println("Balance is: "+a.getBalance());
        Account b = new Account(15987,"Abcxy",879456.12,1.6f);
        b.printDetails();
        System.out.println("Number of accounts are: "+Account.getCount());

	}

}
