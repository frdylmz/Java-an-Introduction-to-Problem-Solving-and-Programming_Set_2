package chapter5;

/*
	This class will test the ScienceFairProjectRating class.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 10.
	Last Changed: 15 June 2017.
 */

import java.util.Scanner;

public class ScienceFairProjectRatingTest {

	public static void main(String[] args){
		
		ScienceFairProjectRating sfpr = new ScienceFairProjectRating();
		Scanner keyScan = new Scanner(System.in);
		boolean active = true;
		
		System.out.println("Welcome to the Science Fair Project Rating program");
		
		System.out.print("\nInsert creator of project name: ");
		String creator = keyScan.nextLine();
		sfpr.getPersonName(creator);
		
		System.out.print("Insert project name: ");
		String project = keyScan.nextLine();
		sfpr.getProjectName(project);
		
		System.out.print("Insert project description: ");
		String description = keyScan.nextLine();
		sfpr.getDescription(description);
		
		System.out.print("Insert the amount of judges: ");
		int judges = keyScan.nextInt();
		sfpr.setJudges(judges);
		
		System.out.println("\nNow for judges rating");
		
		for(int x = 1; x <= judges; x++){
			
			//Rate Creative Ability
			do{
				System.out.println("");
				System.out.println("Judge " + x + ", rate Creative Ability");
				System.out.println("Max Creative Ability rating is " + sfpr.maxCR);
				int rate = keyScan.nextInt();
				if(rate > sfpr.maxCR){
					System.out.println("Rating must be lower than " + sfpr.maxCR);
				}else{
					sfpr.crativeAbility += rate;
					active = false;
				}
			}while(active);
			
			//Rate Science Thought
			do{
				System.out.println("");
				System.out.println("Judge " + x + ", rate Science Thought");
				System.out.println("Max Science Thought rating is " + sfpr.maxST);
				int rate = keyScan.nextInt();
				if(rate > sfpr.maxST){
					System.out.println("Rating must be lower than " + sfpr.maxST);
					active = true;
				}else{
					sfpr.scienceThought += rate;
					active = false;
				}
			}while(active);
			
			//Rate Thoroughness
			do{
				System.out.println("");
				System.out.println("Judge " + x + ", rate Thoroughness");
				System.out.println("Max Thoroughness rating is " + sfpr.maxT);
				int rate = keyScan.nextInt();
				if(rate > sfpr.maxT){
					System.out.println("Rating must be lower than " + sfpr.maxT);
					active = true;
				}else{
					sfpr.thoroughness += rate;
					active = false;
				}
			}while(active);
			
			//Rate Technical Skill
			do{
				System.out.println("");
				System.out.println("Judge " + x + ", rate Technical Skill");
				System.out.println("Max Technical Skill rating is " + sfpr.maxTS);
				int rate = keyScan.nextInt();
				if(rate > sfpr.maxTS){
					System.out.println("Rating must be lower than " + sfpr.maxTS);
					active = true;
				}else{
					sfpr.technicalSkill += rate;
					active = false;
				}
			}while(active);
			
			//Rate Clarity
			do{
				System.out.println("");
				System.out.println("Judge " + x + ", rate Clarityl");
				System.out.println("Max Clarity rating is " + sfpr.maxC);
				int rate = keyScan.nextInt();
				if(rate > sfpr.maxC){
					System.out.println("Rating must be lower than " + sfpr.maxC);
					active = true;
				}else{
					sfpr.clarity += rate;
					active = false;
				}
			}while(active);
		}
		sfpr.finalRating();
	}
}