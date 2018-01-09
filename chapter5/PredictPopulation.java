package chapter5;

import java.util.Scanner;

public class PredictPopulation {
	private static String name;
	private static String fName;
	private static String sName;
	private static int population;
	private static int fPopulation;
	private static int sPopulation;
	private static double growthRate;
	private static double fGrowthRate;
	private static double sGrowthRate;
	
	/*Reads user input, User single names for species*/
	public static void readInput(){
		Scanner keyboard = new Scanner(System.in);
		
		for(int x = 1; x <= 2; x++){
			switch(x){
				case 1:
					System.out.println("First Species:\n");
					
					System.out.println("What is the species' name?");
					name = keyboard.next();
					
					System.out.println("What is the population of the species?");
					population = keyboard.nextInt();
					
					System.out.println("Enter growth rate (% increase per year):");
					growthRate = keyboard.nextDouble();
					
					setSpecies1();
					break;
					
				case 2:
					System.out.println("\nSecond Species:\n");
					
					System.out.println("What is the species' name?");
					name = keyboard.next();
					
					System.out.println("What is the population of the species?");
					population = keyboard.nextInt();
					
					System.out.println("Enter growth rate (% increase per year):");
					growthRate = keyboard.nextDouble();
					
					setSpecies2();
					break;
			}
		}
		
	}
	
	/*Using user input, the first species will be stored in this method.
	  An error will appear when species is less than 1*/
	public static void setSpecies1(){
		
		fName = name;
		
		if(population >= 0){
			fPopulation = population;
		}else{
			System.out.println("ERROR: using a negative population.");
			System.exit(0);
		}
		fGrowthRate = growthRate;
		
		System.out.println("First Species:");
		System.out.println("Name: " + fName);
		System.out.println("Population: " + fPopulation);
		System.out.println("Growth rate: " + fGrowthRate + "%");
	}
	
	/*Using user input, the second species will be stored in this method.
	  An error will appear when species is less than 1*/
	public static void setSpecies2(){
		
		sName = name;
		
		if(population >= 0){
			sPopulation = population;
		}else{
			System.out.println("ERROR: using a negative population.");
			System.exit(0);
		}
		sGrowthRate = growthRate;
		
		System.out.println("First Species:");
		System.out.println("Name: " + sName);
		System.out.println("Population: " + sPopulation);
		System.out.println("Growth rate: " + sGrowthRate + "%");
	}
	
	/**
		Precondition: years is a nonnegative number.
		Will display which species will out populate the higher populated
		species, how many years it will take. If after 100 years the lowest
		species population doesn'n out-number the higher population species, 
		a message will appear to state it.
	 */
	public static void predictPopulation(){
		
		double populationAmount1 = fPopulation, populationAmount2 = sPopulation;
		double smGrowthRate = fGrowthRate, hGrowthRate = sGrowthRate;
		double lowestPopulation = fPopulation, highestPopulation = 0;
		String lowsetName = fName, highestName = sName;
		int years = 0;
		
		if(fPopulation > sPopulation){
			smGrowthRate = sGrowthRate;
			lowestPopulation = sPopulation;
			populationAmount1 = sPopulation;
			lowsetName = sName;
			
			hGrowthRate = fGrowthRate;
			highestPopulation = fPopulation;
			populationAmount2 = fPopulation;
			highestName = fName;
		}

		while((lowestPopulation < highestPopulation) && (years <= 100)){
			populationAmount1 = (populationAmount1 + (smGrowthRate / 100) * populationAmount1);
			lowestPopulation = populationAmount1;
			
			populationAmount2 = (populationAmount2 + (hGrowthRate / 100) * populationAmount2);
			highestPopulation = populationAmount2;
			
			years++;
		}
		
		if(years > 1000){
			System.out.println("");
			System.out.println(lowsetName + " will not exceed " + highestName 
						  + " within the next 100 years.");
		}else{
			System.out.println("");
			System.out.println(lowsetName + " will exceed " + highestName 
						  + " within the next " + years + " years.");
		}
	}
	
	public static void main(String[] args){
		
		readInput();
		predictPopulation();
	}
}
