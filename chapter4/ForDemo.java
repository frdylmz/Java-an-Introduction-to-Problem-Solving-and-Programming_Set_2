package chapter4;

/*
	This program is simply made to show a do-while loop.
	Author: Josias JJ Oberholster.
	Chapter 4 Listing 4.5.
	Last Changed: 26 April 2017.
*/

public class ForDemo {

	public static void main(String[] args){
		
		int countDown;
		
		for(countDown = 3; countDown >= 0; countDown--){
			if(countDown == 0){
				System.out.println("Blast off!");
			}else{
				System.out.println(countDown);
				System.out.println("and counting\n");
			}
		}	
	}
}
