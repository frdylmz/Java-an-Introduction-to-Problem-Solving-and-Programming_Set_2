package chapter5;

import java.util.Scanner;

/*
	This version of the class Species is only a toy example designed
	to demonstrate the difference between parameters of a class type
	and parameter of a primitive type.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.12.
	Last Changed: 5 June 2017.
 */

public class DemoSpecies {

	private String name;
	private int population;
	private double growthRate;
	
	/*
		Tries to set intVariable equal to the population of this
		object. But arguments of a primitive type cannot be 
		changed.
	 */
	public void tryToChange(int intVariable){
		intVariable = this.population;
	}
	
	/*
		Tries to make otherObject reference this object.
		But argument of a class type cannot be replaced.
	 */
	public void tryToReplace(DemoSpecies otherObject){
		otherObject = this;
	}
	
	/*
		Change the data in otherObject to the data in this object,
		which is unchanged.
	 */
	public void change(DemoSpecies otherObject){
		otherObject.name = this.name;
		otherObject.population = this.population;
		otherObject.growthRate = this.growthRate;
	}
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();
		
		System.out.println("What is the population of the species?");
		population = keyboard.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = keyboard.nextDouble();
	}
	
	public void writeoutput(){
		
		System.out.println("");
		System.out.println("Name = " + this.name);
		System.out.println("Populaiton = " + this.population);
		System.out.println("Growth rate = " + this.growthRate + "%");
	}
	
	/**
		Precondition: years is a nonnegative number.
		returns the projected population of the receiving object
		after the specified number of years.
	 */
	public int predictPopulation(int years){
		
		int result = 0;
		double populationAmount = population;
		int count = years;
		
		while((count > 0) && (population > 0)){
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);
			count--;
		}
		if(populationAmount > 0){
			result = (int) populationAmount;
		}
		return result;
	}
	
	public void setSpecies(String newName, int newPopulation, double newGrowthRate){
		
		name = newName;
		
		if(population >= 0){
			population = newPopulation;
		}else{
			System.out.println("ERROR: using a negative population.");
			System.exit(0);
		}
		growthRate = newGrowthRate;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public double getGrowthRate(){
		return growthRate;
	}
	
	public boolean equals(DemoSpecies otherObject){
		return (name.equalsIgnoreCase(otherObject.name)) &&
			   (population == otherObject.population) &&
			   (growthRate == otherObject.growthRate);
	}
}
