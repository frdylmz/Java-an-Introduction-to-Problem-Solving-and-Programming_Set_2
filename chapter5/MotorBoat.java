package chapter5;

/*
	This class will set a motor boat to see the speed and
	distance traveled. Currently it has no fail safe 
	when creating the boat.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 7.
	Last Changed: 12 June 2017
 */

import java.util.Scanner;

public class MotorBoat {

	Scanner keyScan = new Scanner(System.in);
	
	private int fuelTankTotal, fuelLeft, maxSpeed, currentSpeed, 
				motorEfficiency, time, totalDistance;
	
	/*Set to create boat*/
	public void setBoat(int setMaxSpeed, int setFuelTankTotal, int setMotorEfficiency){
		maxSpeed = setMaxSpeed;
		fuelTankTotal = setFuelTankTotal;
		motorEfficiency = setMotorEfficiency;
	}
	
	/*Sets current fuel amount in boat*/
	public int setFuel(int startFuel){
		fuelLeft = startFuel;
		return fuelLeft;
	}
	
	/*Sets the current speed of the boat. If speed is less than 0, boat
	 will be set to stand still, with speed at 0*/
	public int Speed(int s){
		currentSpeed = s;
		
		if(s < 0){
			currentSpeed = 0;
			System.out.println("Boat is currrently at a stand still");
		}
		return currentSpeed;
	}
	
	/*Sets the time that the boat is currently being used in minutes.*/
	public int UsageTime(int t){
		time = t;
		return time;
	}
	
	/*Allows refueling of the boat, if fuel is more than the tank capacity,
	then refuel will be set to max tank, else a total space left in tank will
	be given.*/
	public void Refuel(int fuel){
		fuelLeft += fuel;
		
		if(fuelLeft > fuelTankTotal){
			int returnFuel = fuelLeft - fuelTankTotal;
			fuelLeft = fuelTankTotal;
			System.out.println("Fuel tank is full");
			System.out.println(returnFuel + " liter(s) of fuel not used, and returned.");
		}else{
			int fuelSpaceLeft = fuelTankTotal - fuelLeft;
			System.out.println("The boat tank isn't full");
			System.out.println(fuelSpaceLeft + " liter(s) of fule can still be added.");
		}
	}
	
	/*Checks to see how far the boat will go, using current speed, time, efficiency and 
	time.*/
	public void boatDistance(){
		int fuelUsed = motorEfficiency * (currentSpeed * currentSpeed) * time;
		
		if(fuelUsed > fuelLeft){
			fuelUsed = fuelLeft;
			System.out.println("The boat used it's fuel max fuel amount.");
		}
		
		totalDistance = currentSpeed * time;
		
		System.out.println("At the current speed, and " + fuelUsed + " liter(s) of fuel being used,");
		System.out.println("the boat can travel for " + totalDistance + "km");
	}
	
	/*User input will be asked, to create the boat.*/
	public void create(){
		System.out.println("Let's create the boat."
					   + "\n[Only supply non-decimal values]");
		
		//Creating the boat.
		System.out.println("What is the boats' efficiency? [250 - 700 cc engine]");
		int engine = keyScan.nextInt();
		System.out.println("What is the boats' max speed? [in km]");
		int km = keyScan.nextInt();
		System.out.println("What is the boats' max fuel tank capacity? [in liters]");
		int fuelmax = keyScan.nextInt();
		setBoat(km, fuelmax, engine);
		System.out.println("Boat created.");

	}
	
	/*start method will begin the class*/
	public void start(){
		create();
		System.out.println("Fuel is currently at 0. How much would you like to add to the tank?");
		int fill = keyScan.nextInt();
		Refuel(fill);
		
		System.out.println("How long will you be using the boat? [set amount in minutes]");
		int use = keyScan.nextInt();
		UsageTime(use);
		
		System.out.println("At what speed, will you be using the boat? [set amount in km]");
		int sp = keyScan.nextInt();
		Speed(sp);
		
		boatDistance();
	}
}