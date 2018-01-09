package chapter5;

import java.util.Scanner;

/*
	This class will predict how long it will take 
	for a species population density to exceed 1 
	per square mile.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 7.
	Last Changed: 3 June 2017.
*/

public class SpeciesArea {
	
	private String name;
	private int population, years;
	private double growthRate, sqaureMile, area;
	private boolean active;
	
	/*Input will be strict to String and integers only.
	 *After all input has been given, the species will be created.*/
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();
		
		do{
			active = true;
			System.out.println("What is the population of the species?");
			population = keyboard.nextInt();
			
			if(population <= 0){
				System.out.println("ERROR: Population can't be less than 1");
			}else{
				active = false;
			}
		}while(active);
		
		do{
			active = true;
			System.out.println("Enter growth rate (% increase per year):");
			growthRate = keyboard.nextDouble();
			
			if(growthRate <= 0){
				System.out.println("ERROR: Growth Rate can't be less than 1");
			}else{
				active = false;
			}
		}while(active);
		
		do{
			active = true;
			System.out.println("Enter the sqaure mile area the specie lives in:");
			sqaureMile = keyboard.nextDouble();
			
			if(sqaureMile <= 0){
				System.out.println("ERROR: Sqaure mile can't be less than 1");
			}else{
				active = false;
			}
		}while(active);
		
	}
	
	/*Double digits will be used to create the area.
	 *Method will return a double value.*/
	public double getDensity(){
		return area = population / sqaureMile;
	}
	
	/*Returns the projected population of the receiving object
	 *after the specified number of years.
	 */
	public int predictPopulation(){
		
		double populationAmount = population;
		
		do{
			populationAmount = (population + (growthRate / 100) * population) * area;
			System.out.println(populationAmount);
			years++;
		}while(populationAmount < 1);
		
		return years;
	}
	
	/*Return the information needed for this specific class.*/
	public void writeoutput(){
		
		System.out.println("");
		System.out.println("Name = " + this.name);
		System.out.println("Populaiton = " + this.population);
		System.out.println("Growth rate = " + this.growthRate + "%");
		System.out.println("\nIt will take approximately " + years + " years for"
					   	 + "\n" + name + " to exceed 1 per sqaure mile.");
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
}
