package chapter5;

/*
	This is a program the rate a movie, rating will be used
	from 1 to 5, where 1 is Terrible and 5 is the Great.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 12.
	Last Changed: 7 July 2017.
*/

public class Movie {

	private String name, movieMPAA;
	private int rateOne, rateTwo, rateThree, rateFour, rateFive, rate;
	
	/*Input will be Name of the movie and the MPAA rating.
	 *Will create the movie that is being rated.*/
	public void setMovie(String movieName, String movieRating){
		name = movieName;
		movieMPAA = movieRating;
	}
	
	/*No input required.
	 *Will return movie name.*/
	public String getMovieName(){
		return name;
	}
	
	/*No input required.
	 *Will return movie MPAA rating.*/
	public String getMovieMPAA(){
		return movieMPAA;
	}
	
	/*Input should only be between 1 and 5.
	 *A fail safe should be created when method is called.*/
	public void rateMovie(int rateScore){
		switch(rateScore){
			case 1:
				System.out.println(getMovieName() + " is rated as Terrible.");
				rateOne += 5;
				rate++;
				break;
			case 2:
				System.out.println(getMovieName() + " is rated as Bad.");
				rateTwo += 4;
				rate++;
				break;
			case 3:
				System.out.println(getMovieName() + " is rated as Ok.");
				rateThree =+ 3;
				rate++;
				break;
			case 4:
				System.out.println(getMovieName() + " is rated as Good.");
				rateFour += 2;
				rate++;
				break;
			case 5:
				System.out.println(getMovieName() + " is rated as Great.");
				rateFive += 1;
				rate++;
				break;
		}
	}
	
	/*No input required.
	 *Will return the final rating of the movie.*/
	public void writeRating(){
		double finalRate = rate / (rateOne + rateTwo + rateThree + rateFour + rateFive) * 100 ;
		System.out.println(finalRate);
		if(finalRate >= 80){
			System.out.println(getMovieMPAA() + " was rated by " + rate + " people");
			System.out.println(getMovieMPAA() + " is rate: 5");
			System.out.println(getMovieMPAA() + " is rated as Great.");
		}else if(finalRate >= 60){
			System.out.println(getMovieMPAA() + " was rated by " + rate + " people");
			System.out.println(getMovieMPAA() + " is rate: 4");
			System.out.println(getMovieMPAA() + " is rated as Good.");
		}else if(finalRate >= 40){
			System.out.println(getMovieMPAA() + " was rated by " + rate + " people");
			System.out.println(getMovieMPAA() + " is rate: 3");
			System.out.println(getMovieMPAA() + " is rated as OK.");
		}else if(finalRate >= 20){
			System.out.println(getMovieMPAA() + " was rated by " + rate + " people");
			System.out.println(getMovieMPAA() + " is rate: 2");
			System.out.println(getMovieMPAA() + " is rated as Bad.");
		}else{
			System.out.println(getMovieMPAA() + " was rated by " + rate + " people");
			System.out.println(getMovieMPAA() + " is rate: 1");
			System.out.println(getMovieMPAA() + " is rated as Terrible.");
		}
	}
}