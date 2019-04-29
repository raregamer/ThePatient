package main;

public class FlowerGame implements Games{
	
/*	flower game
	pick flower 
	has 6 leaves with random values -10 to +10
	6 chances to take it or leave the flower.
	---------------------
	
	make flower object, can be an array with 6 random values
	(pick leave) go through each value and present to player to accept or not accept
	if accept return value and add to points.
	*/
	
	
	
	private int playerHealth;
	
	//Constructor
	 	public FlowerGame(int playerHealth) {
		this.playerHealth = playerHealth;
	}
	 	
	 	public int startGame(int playerHealth) {
	 		
	 		Flower flower = new Flower();
	 		flower.assignPedalValues();
	 		int currentPedalValue = 0; 
	 		for(int i = 0; i < flower.pedals.length;i++) {
	 			currentPedalValue = flower.pedals[i];
	 			System.out.println(currentPedalValue);
	 		}
	 		return playerHealth + currentPedalValue;
	 		
	 		
	 		
	 	}
	 	
	 	

}
