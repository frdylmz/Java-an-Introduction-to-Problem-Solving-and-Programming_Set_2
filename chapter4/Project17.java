package chapter4;

/*
	This program will simulate a bounce 
	of a ball.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 17.
	Last Changed: 28 May 2017.
 */

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class Project17 extends JApplet{

	public static final double VELOCITY = 100;
	private double height = 0, bounce = 1;
	private boolean move = true;
	
	public void paint(Graphics g){
		
		double speed = VELOCITY;
				
		do{
			g.setColor(Color.black);
			g.fillOval(5, (int) (15 + height), 50, 50);
			
			height += speed;
			speed -= 32;

			if(height <= 0){
				
				height *= -0.5;
				speed *= -0.5;
				bounce++;
			}
			
			try {
				Thread.sleep(100);
				g.setColor(Color.white);
				g.fillRect(0, 0, 500, 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(bounce == 6){
				break;
			}
		}while(move);
	}
}