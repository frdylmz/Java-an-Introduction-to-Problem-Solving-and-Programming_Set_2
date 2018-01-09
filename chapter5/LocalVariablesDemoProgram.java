package chapter5;

/*
	A toy program to illustrate how local variables behave.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.5.
	Last Changed: 30 May 2017.
 */

public class LocalVariablesDemoProgram {

	public static void main(String[] args){
		
		BankAccount myAccount = new BankAccount();
		myAccount.amount = 100.00;
		myAccount.rate = 5;
		
		double newAmount = 800;
		myAccount.showNewBalance();
		System.out.println("I wish my new amount were $" + newAmount);
	}
}
