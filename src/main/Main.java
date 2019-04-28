package main;

import java.util.Scanner;

//Updated 4.16.18

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
		loadRoom(player, 0,0);
		
	}
	

	
	//Go to room only allows to move to a room NO ACTIONS HAPPEN JUST MOVEMENT FROM ONE ROOM TO ANOTHER.
	private static void loadRoom(Player player, int goToRoom, int subRoom) {
		try
		{
			System.out.println("Thinking...");
		    Thread.sleep(400);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		//Players current information
		Player player1 = player;
		//The room numbers that is currently loaded and we are in (i.e. "0").
//		int currentRoomNumber = goToRoom;
		
		if(player1.mHealth < 20) {
			System.out.println("Game Over");
			menu();
			
		} 
		
		if(player1.mHealth >= 100) {
			System.out.println("You have had a full recovery");
			menu();
		}

		
		// make an instance of the room page/scenario. 
		Room currentRoom = game.getRoomNumber(goToRoom,subRoom);
		
		if(currentRoom.isTextScenarioOnly()) {
			System.out.println(currentRoom.getTextScenario());
			loadRoom(player1, 1, 0);
		}
		
		//print player stats
		statPrinter(player1);

		
		//print room scenario text.
		printLn(currentRoom.getTextScenario() + "\n" );
		
		//get the choices applicable for that room. 
		Choice choice1 = currentRoom.getChoice1();
		Choice choice2 = currentRoom.getChoice2();
		Choice choice3 = currentRoom.getChoice3();
		
		
		//then print choices for that scenario in that room.
		printLn("1. " + choice1.getChoiceText());
		printLn("2. " + choice2.getChoiceText());
		printLn("3. " + choice3.getChoiceText());

		
		//Make a scanner to get user inputed choices and load new scenario/room/action based on that choice. 
		Scanner s = new Scanner(System.in);
		int choiceSelection = s.nextInt();
		switch(choiceSelection) {
		
		//Case 1 only loads new rooms (i.e. [0][0],[1,0],[2,0]. 
			case 1: 
				//if choice is a mini game load choice to get game. 
				if(choice1.isAction()) {
					//Create the game
					Games game1 = choice1.getGame();
					//Pass your player information to game then start the game. 
					player1.setmHealth(game1.startGame(player1.getmHealth()));
					//When game is over enter the room we were currently in.
					loadRoom(player1,goToRoom,subRoom);
				}
				
				if(choice1.getHasPoints()) {
					player1.setmHealth(player1.getmHealth() + choice1.getPoints());
					System.out.println("in here");
				}
				
				loadRoom(player1,choice1.getNextRoomPage(), choice1.getSubRoomPage());
				 
				break;
				
			case 2:
				if(choice2.isAction()) {
					Games game1 = choice2.getGame();
					player1.setmHealth(game1.startGame(player1.getmHealth()));
					//this will enter the room we are currently in.
					loadRoom(player1,goToRoom,subRoom);
				}
				if(choice1.getHasPoints()) {
					player1.setmHealth(player1.getmHealth() + choice1.getPoints());
					System.out.println("in here");
				}
				loadRoom(player1,choice2.getNextRoomPage(), choice2.getSubRoomPage());
				 
				break;
				
			case 3:
				if(choice3.isAction()) {
					Games game1 = choice3.getGame();
					player1.setmHealth(game1.startGame(player1.getmHealth()));
					//this will enter the room we are currently in.
					loadRoom(player1,goToRoom,subRoom);
				}
				if(choice1.getHasPoints()) {
					player1.setmHealth(player1.getmHealth() + choice1.getPoints());
					System.out.println("in here");
				}
				loadRoom(player1,choice3.getNextRoomPage(), choice3.getSubRoomPage());
				 
				break;
	
		
		}
		
	}
	
	public static void printLn(String printOutput){
		System.out.println(printOutput);
	}
	
	
	public static void clearScannerLine() {
		input.nextLine();

	}
	
	private static void loadGame() {
		// TODO Auto-generated method stub
		
	}
	
	private static void statPrinter(Player player) {
		System.out.println("\nPatient Name: " + player.getmName() + "\nCurrent Health: " + player.getmHealth()+"\n");

	}
	
	

}
