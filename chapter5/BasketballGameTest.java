package chapter5;

/*
	This class will test the BasketballGame class.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 10.
	Last Changed: 6 July 2017.
*/

import java.util.Scanner;

public class BasketballGameTest {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		BasketballGame bbg = new BasketballGame();
		boolean active = true, error = true;
		int length, getScore;
		String name, points;
		
		System.out.println("Welcome to a game of Basketball");
		System.out.println("Score is allocated by 1, 2 and 3");
		
		System.out.println("Please insert name of team one:");
		String teamOneName = sc.nextLine();
		bbg.setTeamOneName(teamOneName);
		
		System.out.println("Please insert name of team two:");
		String teamTwoName = sc.nextLine();
		bbg.setTeamTwoName(teamTwoName);
		
		System.out.println("Score will be alucated by "
				   + "\"a\" for team one and"
				   + "\"b\" for team two.");
		System.out.println("Insert score made by team.");
		System.out.println("[Example: a 3 -> team one scored 3 points]");
	
		do{
			do{
				System.out.println("Enter a score");
				String score = sc.nextLine();
				
				length = score.length();
				name = score.substring(0, 1);
				points = score.substring(length-1, length);
				getScore = Integer.parseInt(points);
				
				if(getScore > 3 || getScore < 0){
					System.out.println("Score is allocated by 1, 2 and 3");
				}else if(!(name.equalsIgnoreCase("a") || name.equalsIgnoreCase("b"))){
					System.out.println("Score will be alucated by "
							   		 + "\"a\" for team one and "
							   		 + "\"b\" for team two.");
				}else{
					active = true; 
					error = false;
				}
			}while(error);
			
			if(name.equalsIgnoreCase("a")){
				switch (getScore){
					case 1:
						bbg.setTeamOneScore(bbg.OneScore());
						break;
					case 2:
						bbg.setTeamOneScore(bbg.TwoScore());
						break;
					case 3:
						bbg.setTeamOneScore(bbg.ThreeScore());
						break;
				}					
			}else{
				switch (getScore){
					case 1:
						bbg.setTeamTwoScore(bbg.OneScore());
						break;
					case 2:
						bbg.setTeamTwoScore(bbg.TwoScore());
						break;
					case 3:
						bbg.setTeamTwoScore(bbg.ThreeScore());
						break;
				}
			}
			
			bbg.Active(true);
			bbg.Winning();
			
			if(bbg.getTeamOneScore() >= 10 || bbg.getTeamTwoScore() >= 10){
				bbg.Win();
				bbg.Active(false);
			}
			
		}while(active);
	}
}