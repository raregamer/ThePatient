package main;
/*This class allows to create a room page, and make a scenario with player choices.
 * */

public class Room {
	//textScenario will take a string to write out the scenario(I.E. "You enter the lobby 
	//and hear a noise.")
	private String textScenario; 
	//Choice (I.E. "Check it out" or "Ignore")
	private Choice choice1;
	private Choice choice2;

	

//Constructor to set object. 
public Room(String scenario, Choice choice1, Choice choice2) {
	
	this.setTextScenario(scenario);
	this.setChoice1(choice1);
	this.setChoice2(choice2);
	
	
}

//trying to figure out how to structure mini games and call them in a constructor. 
//Constructor to set object. 
public Room(String scenario,AnagramMiniGame game) {
	this.setTextScenario(scenario);
	//game happening
	;
	//start game
	game.startAnagramGame();
	
	
}

public void loadMiniGame(MiniGame game) {
	game.getAnigramGame();
}



//Create getters and setters. 
public String getTextScenario() {
	return textScenario;
}


public void setTextScenario(String textScenario) {
	this.textScenario = textScenario;
}


public Choice getChoice1() {
	return choice1;
}


public void setChoice1(Choice choice1) {
	this.choice1 = choice1;
}


public Choice getChoice2() {
	return choice2;
}


public void setChoice2(Choice choice2) {
	this.choice2 = choice2;
}	



}
