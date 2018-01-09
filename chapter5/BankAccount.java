package chapter5;

/*
	This class is used in the program LocalVariablesDemoPropgram.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.5.
	Last Changed: 30 May 2017.
 */

public class BankAccount {

	public double amount;
	public double rate;
	
	public void showNewBalance(){
		
		double newAmount = amount + (rate / 100.0) * amount;
		
		System.out.println("With interest added, the new amount is $" + newAmount);
	}
}
