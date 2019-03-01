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
	rooms = new Room[1][3];
	//Room 0 Game starts on this page. Kind of like a game lobby the central point.
	rooms[0][0] = new Room("The doctor will see you now[0][0]",
	new Choice("Vist Dr. Office",1), //this is going to a new room [1][0]
	new Choice("Explore Outside", 2));
	
	rooms[0][1] = new Room("Dr Office[0][1]",// internal choices should be a new action class that calls games and item.
			new Choice("playGame",new AnagramMiniGame(player.getmHealth())),
			new Choice("Go Back",0));
	
	//in first room. 
	rooms[0][2]= new Room("Outside[0][2]",// internal choices should be a new action class that calls games and item.
			new Choice("pickFlower",2),
			new Choice("Go Back",0));
	
	
	
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


