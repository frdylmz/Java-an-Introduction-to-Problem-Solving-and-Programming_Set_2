package chapter4;

/*
	This program will draw a bulls eye.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 19.
	Last Change: 28 May 2017.
 */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Project18 extends JApplet {

	public void paint(Graphics g){
		
		int ring = 250, color = 0, position = 0;
		
		for(int x = 1; x <= 6; x++){
			
			if(color % 2 == 0){
				g.setColor(Color.green);
			}else{
				g.setColor(Color.blue);
			}
			
			g.fillOval(5 + position, 5 + position, ring, ring);
			ring -= 30;
			color++;
			position += 15;
		}
	}
}
