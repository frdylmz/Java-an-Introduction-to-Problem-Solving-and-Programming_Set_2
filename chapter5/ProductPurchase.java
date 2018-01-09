package chapter5;

/*
	Class for the purchase of multiple items,
	such as 3 oranges. Prices are set supermarket
	style, such as 5 for $1.25.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 6.
	Last Changed: 27 June 2017.
*/

public class ProductPurchase {

	public static void main(String[] args){
		
		Purchase p1 = new Purchase();
		Purchase p2 = new Purchase();
		Purchase p3 = new Purchase();
		Purchase p4 = new Purchase();
		Purchase p5 = new Purchase();
		
		p1.readInput();
		p2.readInput();
		p3.readInput();
		p4.readInput();
		p5.readInput();
		
		System.out.println("\nYou bought: ");
		p1.writeOutput();
		p2.writeOutput();
		p3.writeOutput();
		p4.writeOutput();
		p5.writeOutput();
		
		double calc = p1.getTotalCost() + p2.getTotalCost() + p3.getTotalCost() + p4.getTotalCost() + p5.getTotalCost();
		System.out.println("Your bill will be:");
		System.out.println("$" + calc);
	}
}
