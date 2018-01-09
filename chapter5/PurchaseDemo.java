package chapter5;

/*
	This program will test the Purchase class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.14.
	Last Changed: 31 May 2017.
 */

public class PurchaseDemo {

	public static void main(String[] args){
		Purchase oneSale = new Purchase();
		oneSale.readInput();
		oneSale.writeOutput();
		System.out.println("Cost each $" + oneSale.getUnitCost());
		System.out.println("Total cost $" + oneSale.getTotalCost());
	}
}
