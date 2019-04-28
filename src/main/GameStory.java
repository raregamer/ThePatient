package main;

public class GameStory {
	//holds the story in an array to go through
//	private Room [][] rooms;
	private Room [][] rooms;
	//Current player 
	private Player player; 

//constructor of story text and choices. 


//Constructor with get player instance
public GameStory(Player player) {	
	
	this.player = player;
	rooms = new Room[10][10];
	//Room 0 Game starts on this page. Kind of like a game lobby the central point.
	rooms[0][0] = new Room("The doctor will see you now[0][0]",
	new Choice("Vist Dr. Office",1,0), //this is going to a new room [1][0]
	new Choice("Explore Outside", 2,0),
	new Choice ("Leave", 0,0));
	
//	rooms[0][1] = new Room("Welcome please take a seat.[0][1]",// internal choices should be a new action class that calls games and item.
//			new Choice("playGame",new AnagramMiniGame(player.getmHealth())),
//			new Choice("Go Back",0,0),
//			new Choice ("Go Back", 0,0));
//	
//	rooms[0][2]= new Room("Outside[0][2]",// internal choices should be a new action class that calls games and item.
//			new Choice("pickFlower",2,0),
//			new Choice("Go Back",0,1),
//			new Choice ("Leave", 0,0));
	
	rooms[1][0] = new Room("[1][0]Dr: Welcome " + player.getmName() + " please take a seat", 
			new Choice ("sit", 1,1),
			new Choice ("How do you know my name?",1,2),
			new Choice ("Leave", 0,0));
	
	rooms[1][1] = new Room("Thank you, lets continue. "
			+ "\nWhat brings you in today?", 
			new Choice("What are you thinking(Anagram Game)",new AnagramMiniGame(player.getmHealth())),
			new Choice("Last night I...",3,0),
			new Choice ("Leave", 0,0));
	
	/*Room 1 scenario */
	
	//Room 1 scenario  1
	rooms[1][2] = new Room("It was passed along to me, when you signed in. \nLets continue.", 
			new Choice("Continue", 1,1), 
			new Choice("Does that information always get \"passed to you?\"",1,3),
			new Choice ("Leave", 0,0)); 
	
	rooms[1][3] = new Room("Yes, that is shared information.", 
			new Choice("Got it", 1,1), 
			new Choice("I thought that was all confidential information.",1,4),
			new Choice ("Leave", 0,0)); 
	
	rooms[1][4] = new Room("All your information is private in our current session. "
			+ "Although your name is public information we share with our office assistants.", 
			new Choice("Thank You, for clarifying.", 1,1), 
			new Choice("So it's not private, is it, is it, is it...",1,5),
			new Choice ("Leave", 0,0)); 
	
	rooms[1][5] = new Room("It seems you are having some paranoia tendicies.\nI perscribed some medication "
			+ "to help out with that. Please see me again.",0);
	
	//Room 1 scenario setups
	rooms[3][0] = new Room("Yes...",
			new Choice("Ended my relationship",4,0),
			new Choice("Jumped out the window",5,0),
			new Choice("Leave",0,0));
	
	//Ended Relationship scenario.
	rooms[4][0] = new Room("Start from the beginning",
			new Choice("We started the night with ice cream",4,1,5),
			new Choice("I took her to my moms house",4,6,-10),
			new Choice("Leave",0,0));
	
	rooms[4][1] = new Room("Yum...my favorite flavor is pistachio",
			new Choice("Right..., as we are eating, she asks to share.",4,2),
			new Choice("Moving on.., she trips.",4,3),
			new Choice("Leave",0,0));
	
	rooms[4][2] = new Room("Sharing is caring",
			new Choice("I don't share.",4,4, -10),
			new Choice("I share",4,4,10),
			new Choice("Leave",0,0));
	
	rooms[4][3] = new Room("Was she okay",
			new Choice("Who cares",4,4, -20),
			new Choice("Of course!, I help her up",4,4,20),
			new Choice("Leave",0,0));
	
	rooms[4][4] = new Room("Hmm...How does she react?",
			new Choice("Angry",4,5),
			new Choice("Happy",4,6),
			new Choice("Leave",0,0));
	
	rooms[4][5] = new Room("Rightfully so, wouldn't you say.",
			new Choice("No, so I broke up with her.",4,7),
			new Choice("She didn't have to break up with me.",4,8),
			new Choice("Leave",0,0));
	
	rooms[4][7] = new Room("I see, based on my assesment you lack basic empathy, "
			+ "I suggest my self help book to better yourself.",0);
	
	rooms[4][8] = new Room("People, don't have to do anything., "
			+ "I suggest my self help book to better yourself.",0);
	
	

	
	
	
	//Room 1 scenarios end
	
	
	rooms[2][0] = new Room("[2][0]Outside. "
			+ "\nWhat do you want to work on?", 
			new Choice("Pick Flowers",new AnagramMiniGame(player.getmHealth())),
			new Choice("Go Back",0,0),
			new Choice ("Leave", 0,0));
	
	}

//Getter and setter of player.
public Player getPlayer() {
	return player;
}

public void setPlayer(Player player) {
	this.player = player;
}


//function that returns the room 
public Room getRoomNumber(int room,int subRoom) {
	return rooms[room][subRoom];
}

	

	
}


