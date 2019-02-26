package main;

public class GameStory {
	//holds the story in an array to go through
	private Room [] rooms;

//constructor of story text and choices. 
public GameStory() {
	
	rooms = new Room[4];
	
	rooms[0] = new Room("Which room should I go into",
			new Choice("Room 1",1),
			new Choice("Room 2", 2));
	
	rooms[1] = new Room("Which room should I go into",
			new Choice("Room 0",0),
			new Choice("Room 2", 2));
	
	rooms[2] = new Room("Which room should I go into",
			new Choice("Room 0",0),
			new Choice("Room 3 Game", 3));
	
	rooms[3] = new Room("game", new AnagramMiniGame());
	
	
	
}

//function that returns a Page
public Room getRoomNumber(int roomNumber) {
	return rooms[roomNumber];
}
	
}


