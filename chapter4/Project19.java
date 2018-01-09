package chapter4;

/*
	This program will loop a specific
	number of ovals, starting from big,
	moving on the x-coordinate, gradually
	reducing size.
	Author: Josias JJ Oberholster.
	Last Change: 28 May 2017.
*/

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Project19 extends JApplet{

	private static final int CIRCLE_NUMBER = 6;
	private static final int CIRCLE_RADIUS = 50;
	private static final int RADIUS_CHANGE = 5;
	private static final int X_COORDINATE = 5;
	
	public void paint(Graphics g){
		
		int radius = CIRCLE_RADIUS;
		int xCoordinate = X_COORDINATE;
		int color = 0;
		int yCoordinate = 0;
		
		for(int x = 1 ; x <= CIRCLE_NUMBER; x++){
			
			color++;
			radius -= RADIUS_CHANGE;
			yCoordinate += 5;
	
			switch(color){
				case 1:
					g.setColor(Color.red);
					break;
				case 2:
					g.setColor(Color.green);
					break;
				case 3:
					g.setColor(Color.blue);
					color = 0;
					break;
			}
			
			g.fillOval(xCoordinate, yCoordinate, radius, radius);
			
			xCoordinate += 50;
		}
	}
}
