package chapter5;

/*
	This will test the toy class DemoSpecies.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.22.
	Last Changed: 5 June 2017.
 */

public class ParametersDemo {

	public static void main(String[] args){
		
		DemoSpecies s1 = new DemoSpecies();
		DemoSpecies s2 = new DemoSpecies();
		
		s1.setSpecies("Klingon ox", 10, 15);
		int aPopulation = 42;
		System.out.println("aPopulation BEFORE calling tryChange: " + aPopulation);
		s1.tryToChange(aPopulation);
		System.out.println("\naPopulation AFTER calling tryToChange: " + aPopulation);
		
		s2.setSpecies("Ferengie Fur Ball", 90, 56);
		System.out.println("\ns2 BEFORE calling tryToReplace:");
		s2.writeoutput();
		s1.tryToReplace(s2);
		System.out.println("\ns2 AFTER calling tryToReplace:");
		s2.writeoutput();
		s1.change(s2);
		System.out.println("\ns2 AFTER calling change:");
		s2.writeoutput();
	}
}