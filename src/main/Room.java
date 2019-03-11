package main;

import java.util.ArrayList;

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
	//A possible way to make choices in a ArrayList to have it be more dynamic.
	private ArrayList<Choice> choices = new ArrayList<Choice>();
	private boolean isTextScenarioOnly = false;
	private int roomHomeNumber;
	private int howManyChoices;
	

//Constructor to set room variables.
	//Constructor to just have a scenario NO choices.
	public Room(String scenario, int roomNumberToGoBackTo) {
		this.setTextScenario(scenario);
		setTextScenarioOnly(true);
		this.setRoomHomeNumber(roomNumberToGoBackTo);
	}

	//Constructor that allows for 2 choices. 
	//Not working yet.
	public Room(String scenario, Choice choice1, Choice choice2) {
		
		this.setTextScenario(scenario);
		this.setChoice1(choice1);
		this.setChoice2(choice2);
		this.setHowManyChoices(2);
	}
	
	
	//Constructor that allows for 3 choices.
	public Room(String scenario, Choice choice1, Choice choice2,Choice choice3) {
	
		this.setTextScenario(scenario);
		this.setChoice1(choice1);
		this.setChoice2(choice2);
		this.setChoice3(choice3);
		this.setHowManyChoices(3);
	
}




//Create getters and setters. 



public int getHowManyChoices() {
	return howManyChoices;
}

public void setHowManyChoices(int howManyChoices) {
	this.howManyChoices = howManyChoices;
}

public int getRoomHomeNumber() {
	return roomHomeNumber;
}

public void setRoomHomeNumber(int roomHomeNumber) {
	this.roomHomeNumber = roomHomeNumber;
}

public boolean isTextScenarioOnly() {
	return isTextScenarioOnly;
}

public void setTextScenarioOnly(boolean isTextScenarioOnly) {
	this.isTextScenarioOnly = isTextScenarioOnly;
}


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
