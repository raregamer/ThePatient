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
	private Choice choice3;

	

//Constructor to set room variables.
	
	//2 choices constructor 
	public Room(String scenario, Choice choice1, Choice choice2) {
		
		this.setTextScenario(scenario);
		this.setChoice1(choice1);
		this.setChoice2(choice2);
	}
	
	//3 choices constructor
public Room(String scenario, Choice choice1, Choice choice2,Choice choice3) {
	
	this.setTextScenario(scenario);
	this.setChoice1(choice1);
	this.setChoice2(choice2);
	this.setChoice3(choice3);
	
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




public Choice getChoice3() {
	return choice3;
}




public void setChoice3(Choice choice3) {
	this.choice3 = choice3;
}	



}
