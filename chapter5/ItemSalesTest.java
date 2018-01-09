package chapter5;

/*
	This class will test the ItemSales class.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 6.
	Last Changed: 11 June 2017.
 */

public class ItemSalesTest {

	public static void main(String[] args){
		
		ItemSales is = new ItemSales();
		
		is.setbulkDiscountPercentage(7);
		is.setBulkQuantity(10);
		is.setCostPerItem(15);
		
		is.registeredSales(22);
		is.displaySales();
	}
}
