package chapter5;

/*
	This program is used to rate a movie.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 9.
	Last Changed: 13 June 2017.
 */

public class RatingScore {

	private String movieName, mDescription;
	public int maxRate;
	private int rating;
	private static final int MAXRATING = 5;
	
	/*Give movie name..*/
	public String setMovieName(String movie){
		movieName = movie;
		return movieName;
	}
	
	/*Give short description of the movie*/
	public void MovieDescription(String md){
		mDescription = md;
	}
	
	/*Shows message of the max rating*/
	public void MaxRating(){
		maxRate = MAXRATING;
		System.out.println("The max rating for a movie is " + maxRate);
	}
	
	/*Set movie rating*/
	public int setRating(int r){
		rating = r;
		return rating;
	}
	
	/*Will return the results of the rating class*/
	public void ReturnResult(){
		System.out.println("Movie name: \n" + movieName);
		System.out.println("Movie Description: \n" + mDescription);
		System.out.println("Movie rating: \n" + rating);
	}
}
