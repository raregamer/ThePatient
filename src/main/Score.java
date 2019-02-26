package main;
//Score class to be accessed globally to allow to keep track of score across all mini games. 
public class Score {
	
	private static int score = 0;
	//Constructor is private and can't make new instances to be used anywhere. 
	private Score() {
		
	}

	public static int getScore() {
		return score;
	}

	public static void increaseScoreByOne() {
		score++;
	}
	
	public static void decreaseScoreByOne() {
		score--;
	}
	
	public static void resetScore() {
		score = 0;
	}

}
