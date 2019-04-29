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
	rooms[0][0] = new Room("The doctor will see you now",
	new Choice("Vist Dr. Office",1,0), //this is going to a new room [1][0]
	new Choice("Explore Outside", 2,0),
	new Choice ("Leave", 0,0));
	

	
	rooms[1][0] = new Room("Dr: Welcome " + player.getmName() + " please take a seat", 
			new Choice ("Sit", 1,1),
			new Choice ("How do you know my name?",1,2),
			new Choice ("Leave", 0,0));
	
	rooms[1][1] = new Room("Thank you, lets continue. "
			+ "\nWhat brings you in today?", 
			new Choice("Assement",new AnagramMiniGame(player.getmHealth())),
			new Choice("Last night I...",3,0),
			new Choice ("Go Back", 1,0));
	
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
			new Choice("I took her to my moms house",4,6,-100),
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
	
	rooms[4][6] = new Room("I am sorry you can't be helped",0);
	
	rooms[4][7] = new Room("I see, based on my assesment you lack basic empathy, "
			+ "\nI suggest my self help book to better yourself.\ncome visit again.",0);
	
	rooms[4][8] = new Room("People, don't have to do anything., "
			+ "\nI suggest my self help book to better yourself.\ncome visit again.",0);
	
	

	//Jumped out of the window scenario
	rooms[5][0] = new Room("Yet you live to speak another day.",
			new Choice("What was that?",5,1),
			new Choice("Laugh",5,2),
			new Choice("Leave",0,0));
	
	rooms[5][1] = new Room("Never mind that. tell me more about this incident",
			new Choice("As I stated, I jumped out the window",5,2,20),
			new Choice("No!, I heard you.",6,0),
			new Choice("Leave",0,0));
	
	rooms[5][2] = new Room("Okay tell me what triggered this episode",
			new Choice("I tried to save my cat",5,3,10),
			new Choice("I got paid ten dollars to do it",5,4,-10),
			new Choice("Leave",0,0));
	
	rooms[5][3] = new Room("You do know cats have Nine lives.",
			new Choice("I do now",5,5),
			new Choice("Yes, that was his ninth",5,6,-10),
			new Choice("Leave",0,0));
	rooms[5][4] = new Room("Thats too bad, because this session was $150.",0);
	
	rooms[5][5] = new Room("Glad to hear you learned a lesson. "
					+ "Why not take a copy of my book for the bravery you displayed.",0);
	rooms[5][6] = new Room("My condolences. "
			+ "Please take a copy of my book to help you in your grieving.",0);
	
	
	rooms[6][0] = new Room("My apologies, lets move on.",
			new Choice("Move on",5,2),
			new Choice("Move on...I'll move on",6,1),
			new Choice("Leave",0,0));
	
	rooms[6][1] = new Room("Please bring yourself, to the peace inside.",
			new Choice("Attack Doctor",6,2),
			new Choice("Jump out the window",6,3),
			new Choice("Maybe I am over reacting, lets gets back on track",5,2,50));
	
	rooms[6][2] = new Room("*SECURITY CALLED*.",0);
	
	rooms[6][3] = new Room("Wait you forgot my book...",0);
	
	
	//Room 1 scenarios end
	
	
	rooms[2][0] = new Room("Outside. "
			+ "\nWhat do you want to work on?", 
			new Choice("Pick Flowers",new FlowerGame(player.getmHealth())),
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


