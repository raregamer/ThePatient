package main;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in); 
	public static GameStory game;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
		

	}
	
	//Menu the first thing shown when the game is launched. 
	public static void menu() {
		//options to start a new game and load game. 
		System.out.println("The Patient\n");
		System.out.println("Main Menu");
		System.out.println("1. New Game");
		System.out.println("2. Load Game");
		
		//get user input of what they want to do. 
		int menuChoice = input.nextInt();
		clearScannerLine();
		
		switch(menuChoice) {
		case 1:
			newGame();
		case 2: 
			loadGame();
		}
		
	}

//start a new game method. 
	private static void newGame() {
		// Create a new game game starts with text. 
		printLn("Date: 10/08/2008");
		printLn("This can't be happening again...please....");
		// make a choice to sleep or go to sleep then wake up new day
		printLn("Date: 10/09/2008");
		printLn("Please sign in: ");
		printLn("Name: ");
		//Get name from user 
		String playersName = input.nextLine();
		printLn("Sex: M or F ");
		//get sex
		char playersSex = input.next().charAt(0);
		clearScannerLine();
		//Create new Player for user pass in his name and sex
		Player player = new Player(playersName,playersSex);
		
		/*next step is to load game with player and set game world with rooms*/
		//initialize the game and then load the first room they start the game in. 
		game = new GameStory(player);
		loadLobby(player, 0);
		
	}
	
	public static void printLn(String printOutput){
		System.out.println(printOutput);
	}
	
	
	public static void clearScannerLine() {
		input.nextLine();

	}
	
	//Go to room only allows to move to a room NO ACTIONS HAPPEN JUST MOVEMENT FROM ONE ROOM TO ANOTHER.
	private static void loadLobby(Player player, int currentRoom) {
	 
		Player player1 = player;
		
		// make an instance of the room page/scenario. 
		Room room1 = game.getRoomNumber(currentRoom,0);
		//get the choices applicable for that room. 
		Choice choice1 = room1.getChoice1();
		Choice choice2 = room1.getChoice2();
		
		//print player stats
		statPrinter(player1);

		
		//print room scenario text.
		printLn(room1.getTextScenario() + "\n" );
		
		//then print choices for that scenario in that room.
		printLn("1. " + choice1.getChoiceText());
		printLn("2. " + choice2.getChoiceText());
		
		//Make a scanner to get user inputed choices and load new scenario/room/action based on that choice. 
		Scanner s = new Scanner(System.in);
		int choiceSelection = s.nextInt();
		switch(choiceSelection) {
		
		//Case 1 only loads new rooms (i.e. [0][0],[1,0],[2,0]. 
			case 1: 
				loadActionsInRoom(player1,currentRoom, choice1.getNextRoomPage());
				break;
			
			case 2:
				loadActionsInRoom(player1,currentRoom, choice2.getNextRoomPage());
				break;
				
	
		
		}
			
		
		
	}
	//actions in room. currently player chose a room and now is in it and can interact with objects.
	
	private static void loadActionsInRoom(Player player, int currentRoom,int choice) {
		 
		Player player1 = player;
		statPrinter(player1);
		// make an instance of the room page/scenario. 
		Room room = game.getRoomNumber(currentRoom,choice);
		//get the choices applicable for that room. 
		Choice choice1 = room.getChoice1();
		Choice choice2 = room.getChoice2();
		//print room scenario text.
		printLn(room.getTextScenario() + "\n" );
		//then print choices for that scenario in that room.
		printLn("1. " + choice1.getChoiceText());
		printLn("2. " + choice2.getChoiceText());
		
		//Make a scanner to get user inputed choices and load new scenario/room/action based on that choice. 
		Scanner s = new Scanner(System.in);
		int choiceSelection = s.nextInt();
		switch(choiceSelection) {
			case 1:
				//call action
				Games game1 = choice1.getGame();
				player1.setmHealth(game1.startGame(player1.getmHealth()));
				//come back to current room. pass in same arguments. 
				loadActionsInRoom(player1, currentRoom, choice);
				break;
			case 2:
				loadLobby(player1, currentRoom);

				break;
		
		}
			
		
		
	}
	
	private static void loadGame() {
		// TODO Auto-generated method stub
		
	}
	
	private static void statPrinter(Player player) {
		System.out.println("\nPatient Name: " + player.getmName() + "\nCurrent Health: " + player.getmHealth()+"\n");

	}
	
	

}
