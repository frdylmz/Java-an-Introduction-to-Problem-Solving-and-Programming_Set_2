package chapter5;

/*
	This is a class that represents a basketball game.
	This class will keep information on the team names,
	the score of the teams as well as if the game is
	ongoing or finished.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 9.
	Last Changed: 6 July 2017.
*/

public class BasketballGame {

	private String teamOneName, teamTwoName;
	private int teamOneScore, teamTwoScore, score;
	private boolean gameActive;
	
	//Score Setting
	//****************************************************************
	/*No Input required. Method is final.
	 *Return integer 1 for one score.*/
	public final int OneScore(){
		return score = 1;
	}
	
	/*No Input required. Method is final.
	 *Return integer 2 for two score.*/
	public final int TwoScore(){
		return score = 2;
	}
	
	/*No Input required. Method is final.
	 *Return integer 3 for three score.*/
	public final int ThreeScore(){
		return score = 3;
	}
	
	/*No input required.
	 *Will add score to current team score and return the result.*/
	public int setTeamOneScore(int givescore){
		return teamOneScore += givescore;
	}
	
	/*No input required.
	 *Returns current score of team one.*/
	public int getTeamOneScore(){
		return teamOneScore;
	}
	
	/*No input required.
	 *Will add score to current team score and return the result.*/
	public int setTeamTwoScore(int givescore){
		return teamTwoScore += givescore;
	}
	
	/*No input required.
	 *Returns current score of team two.*/
	public int getTeamTwoScore(){
		return teamTwoScore;
	}
	//****************************************************************
	
	//Team Setting
	//****************************************************************
	/*String is required for parameter.
	 *Return name of team one.*/
	public String setTeamOneName(String teamName){
		return teamOneName = teamName;
	}
	
	/*No input required.
	 *Return name of teamOne*/
	public String getTeamNameOne(){
		return teamOneName;
	}
	
	/*String is required for parameter.
	 *Return name of team two.*/
	public String setTeamTwoName(String teamName){
		return teamTwoName = teamName;
	}
	
	/*No input required.
	 *Return name of team two*/
	public String getTeamNameTwo(){
		return teamTwoName;
	}
	//****************************************************************
	
	
	//Result of current game
	//****************************************************************
	/*No input required.
	 *Shows results of team that is currently winning.*/
	public void Winning(){
		if(teamOneScore > teamTwoScore){
			System.out.println(teamOneName + " is currently winning.");
		}else if(teamTwoScore > teamOneScore){
			System.out.println(teamTwoName + " is currently winning.");
		}else{
			System.out.println("Game is currently a draw.");
		}
	}
	
	/*No input required.
	 *Shows results of team that wins.*/
	public void Win(){
		if(teamOneScore > teamTwoScore){
			System.out.println(teamOneName + " wins.");
		}else if(teamTwoScore > teamOneScore){
			System.out.println(teamTwoName + "  wins.");
		}else{
			System.out.println("Game is a draw.");
		}
	}
	
	/*Input require a true or false.
	 *If true, the game is still in progress and 
	 *team score will be returned.
	 *If false, the game is finished and final
	 *score will be returned.*/
	public void Active(boolean active){
		gameActive = active;
		
		if(gameActive == true){
			System.out.println("Game is still in progress");
			System.out.println("Current score is:\n");
			System.out.println(teamOneName + ": " + teamOneScore);
			System.out.println(teamTwoName + ": " + teamTwoScore);
		}else{
			System.out.println("Game has finished.");
			System.out.println("Final score is:\n");
			System.out.println(teamOneName + ": " + teamOneScore);
			System.out.println(teamTwoName + ": " + teamTwoScore);
			System.exit(0);
		}
	}
}