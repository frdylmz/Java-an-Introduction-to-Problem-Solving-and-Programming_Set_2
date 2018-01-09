package chapter5;

/*
	An applet that uses a label to display text.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.24.
	Last Changed: 5 June 2017.
 */

import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

public class LabelDemo extends JApplet{

	public void init(){
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		
		//Create labels
		JLabel label1 = new JLabel("Hello ");
		JLabel label2 = new JLabel("out there");
		
		//add labels
		contentPane.setLayout(new FlowLayout());
		contentPane.add(label1);
		contentPane.add(label2);
	}
}
