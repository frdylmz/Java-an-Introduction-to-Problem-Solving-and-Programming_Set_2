package chapter4;

/*
	This program will compute the cost
	of a cylindrical container that holds 
	a specified volume.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 14.
	Last Changed: 09 May 2017.
 */

import javax.swing.JOptionPane;

public class ContainerCost extends JOptionPane{

	public static final double PIE = 3.147;
	
	public static void main(String[] args){
		
		boolean run;
		
		int start = JOptionPane.showConfirmDialog(null, "Start program", "Cyclinder Cost", JOptionPane.YES_NO_OPTION);
		
		if(start == YES_OPTION){
			run = true;
		}else{
			run = false;
			System.exit(0);
		}
		
		while(run){
			double h;
			double c;
			
			String volume = JOptionPane.showInputDialog("Enter volume of cylinder");
			double v = Double.parseDouble(volume);
			
			String radius = JOptionPane.showInputDialog("Enter radius of cylinder");
			double r = Double.parseDouble(radius);
			
			h = v / (PIE / (r * r));
			c = 2 * PIE * r * (r + h);
			
			JOptionPane.showMessageDialog(null, "Total height of cylinder"
											  + "\n" + h
											  + "\nTotal cost of cylinder"
											  + "\n" + c);
			
			int rerun = JOptionPane.showConfirmDialog(null, "Rerun Program?", "Cyclinder Cost", JOptionPane.YES_NO_OPTION);
			
			if(rerun == YES_OPTION){
				run = true;
			}else{
				run = false;
				System.exit(0);
			}
		}
		
		System.exit(0);
	}
}
