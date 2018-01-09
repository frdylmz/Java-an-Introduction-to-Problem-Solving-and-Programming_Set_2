package chapter4;

/*
	This program will convert Celsius to Fahrenheit 
	or Fahrenheit to Celsius.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 4.
	Last Changed: 14 May 2017.
 */

import javax.swing.JOptionPane;

public class Project4  extends JOptionPane{

	public static void main(String[] args){
		
		int Degrees_C, Degrees_F, tempInt, quit = 0;
		boolean active = true;
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program will convert Celsius to Fahrenheit  or Fahrenheit to Celsius."
															 + "\nProceed?", "Temperature Converter", JOptionPane.YES_NO_OPTION);			
		do{
				if(startProgram == YES_OPTION){
					String temp = JOptionPane.showInputDialog(null, "Enter the amount to convert."
							  + "\n\nSpecify what temp to convert by ending"
							  + "\nthe amount chosen with either "
							  + "\n\"C\" for Celsius or"
							  + "\n\"F\" for Fahrenheit.");
					
					int tempLength = temp.length();
					String whatTemp = temp.substring(tempLength-1);
					String tempAmount = temp.substring(0, tempLength-1);
					
					if(whatTemp.equalsIgnoreCase("C")){
						tempInt = Integer.parseInt(tempAmount);
						Degrees_C = tempInt;
						Degrees_F = (9 * (Degrees_C) / 5 + 32);
						
						quit = JOptionPane.showConfirmDialog(null, tempInt + "C is equal to " + Degrees_F + "F\n"
								 						 + "\nRun program again?"
														 , "Result",JOptionPane.YES_NO_OPTION);
						
					}else if(whatTemp.equalsIgnoreCase("F")){
						tempInt = Integer.parseInt(tempAmount);
						Degrees_F = tempInt;
						Degrees_C = 5 * (Degrees_F - 32) / 9;
						
						quit = JOptionPane.showConfirmDialog(null, tempInt + "F is equal to " + Degrees_C + "C\n" 
														 + "\nRun program again?"
													 	 , "Result",JOptionPane.YES_NO_OPTION);
					}else{
						JOptionPane.showMessageDialog(null, "Re-enter a valid selection");
					}
					
					if(quit == NO_OPTION){
						System.exit(0);
					}
				}else if(startProgram == NO_OPTION){
					active = false;
					System.exit(0);
				}else{
					System.out.println("Program was force closed");
					active = false;
					System.exit(0);
				}
			}while(active);
		
		System.exit(0);
	}
}