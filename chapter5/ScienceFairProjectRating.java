package chapter5;

/*
	This class will be used to help judge a science fair project.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 10.
	Last Changed: 15 June 2017.
 */

public class ScienceFairProjectRating {

	private String projectName, description, personName;
	private int rate, judges;
	private static final int CREATIVE_ABILITY_MAX = 30;
	private static final int SCIENCE_THOUGHT_MAX = 15;
	private static final int THOROUGHNESS_MAX = 15;
	private static final int TECHNICAL_SKILL_MAX = 15;
	private static final int CLARITY_MAX = 10;
	public int maxCR = CREATIVE_ABILITY_MAX;
	public int maxST = SCIENCE_THOUGHT_MAX;
	public int maxT = THOROUGHNESS_MAX;
	public int maxTS = TECHNICAL_SKILL_MAX;
	public int maxC = CLARITY_MAX;
	public int crativeAbility, scienceThought, thoroughness, technicalSkill, clarity;
	
	/*Get project name as String and return it*/
	public String getProjectName(String pn){
		return projectName = pn;
	}
	
	/*Get project description*/
	public void getDescription(String d){
		description = d;
	}
	
	/*Get project owner/creator name and return it*/
	public String getPersonName(String pn){
		return personName = pn;
	}
	
	/*Set project rating score, and return it*/
	public int setRate(int r){
		return rate = r;
	}
	
	/*Set the amount of judges, and return it*/
	public int setJudges(int j){
		return judges = j;
	}
	
	/*Run this method to get the final result*/
	public void finalRating(){
		double totalCR = crativeAbility / judges;
		double totalST = scienceThought / judges;
		double totalT = thoroughness / judges;
		double totalTS = technicalSkill / judges;
		double totalC = clarity / judges;
		
		System.out.println("Total score for project.");
		System.out.println("\nCreator of project: " + personName);
		System.out.println("Project name: " + projectName);
		System.out.println("Project description: " + description);
		System.out.println("\nRating of project");
		System.out.println("Creative ability: " + totalCR + " out of " + CREATIVE_ABILITY_MAX);
		System.out.println("Science thought: " + totalST + " out of " + SCIENCE_THOUGHT_MAX);
		System.out.println("Thoroughness: " + totalT + " out of " + THOROUGHNESS_MAX);
		System.out.println("Technical skill: " + totalTS + " out of " + TECHNICAL_SKILL_MAX);
		System.out.println("Clarity: " + totalC + " out of " + CLARITY_MAX);
	}
}