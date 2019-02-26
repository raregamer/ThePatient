package main;

import java.util.Scanner;

public class MainStart {
	//test git
	//Global variables
	private static GameStory game;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Scanner
		Scanner s = new Scanner(System.in);
		//Variables
		String playersName;
		String playersSex;
		
		printLn("Date: 10/08/2008");
		printLn("This can't be happening again...please....");
		// make a choice to sleep 
		printLn("Date: 10/09/2008");
		printLn("Please sign in: ");
		printLn("Name: ");
		playersName = s.nextLine();
		printLn("Sex: M or F: ");
		playersSex = s.next();
		
	
		//Start new game story
		game = new GameStory(/*pass in male or female to change certain story strings*/);
		//load the first page of the game story.
		loadGame(0);
		
	
		
	}
	
	private static void loadGame(int page) {
		// make an instance of room page/scenario. 
		Room room = game.getRoomNumber(page);
		//get the choices
		Choice choice1 = room.getChoice1();
		Choice choice2 = room.getChoice2();
		//print scenario text.
		printLn(room.getTextScenario() + "\n" );
		//print choices.
		printLn("1. " + choice1.getChoiceText());
		printLn("2. " + choice2.getChoiceText());
		//Make a scanner to get choices and load newpage
		Scanner s = new Scanner(System.in);
		int choiceSelection = s.nextInt();
		switch(choiceSelection) {
			case 1:
				loadGame(choice1.getNextRoomPage());
				System.out.println(Score.getScore());

				break;
			case 2:
				loadGame(choice2.getNextRoomPage());
				System.out.println(Score.getScore());

				break;
		
		}
			
		
		
	}

	public static void printLn(String printOutput){
		System.out.println(printOutput);
	}
}
