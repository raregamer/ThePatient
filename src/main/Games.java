package main;

//Make an interface that allows me to make games and pass them as a paremeter 
public interface Games {
	//all games have a start game function that takes in the players health and every game can control that
	//players health.
	public int startGame(int playersHealth);

}
