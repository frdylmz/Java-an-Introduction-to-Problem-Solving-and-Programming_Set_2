package chapter5;

/*
	This program will keep track of a item,
	and give discount if product is larger than
	the bulk quantity.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 6.
	Last Changed: 11 June 2017.
 */

public class ItemSales {

	private int numberSold, bulkQuantity;
	private double totalDiscounts, bulkDiscountPercentage, totalSales, costPerItem;
	
	public void registeredSales(int n){
		numberSold = n;
		
		if(n > bulkQuantity){
			totalDiscounts = (n * costPerItem) * (bulkDiscountPercentage / 100);
			totalSales = (n * costPerItem) - totalDiscounts;
		}
	}
	
	public void displaySales(){
		System.out.println("Total number of item sold: " + numberSold);
		System.out.println("Total sales: $" + totalSales);
		System.out.println("Total discount: $" + totalDiscounts);
		
	}
	
	public double setCostPerItem(int itemCost){
		return costPerItem = itemCost;
	}
	public int setBulkQuantity(int bulk){
		return bulkQuantity = bulk;
	}
	public double setbulkDiscountPercentage(int bulkDiscount){
		return bulkDiscountPercentage = bulkDiscount;
	}
}
