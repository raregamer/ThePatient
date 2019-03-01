package main;
//Score class to be accessed globally to allow to keep track of score across all mini games. 
public class Score {
	
	private int score;
	//Constructor is private and can't make new instances to be used anywhere. 
public Score () {
	this.score = 0;
}

	public  int getScore() {
		return score;
	}

	public  void increaseScoreByOne() {
		score++;
	}
	
	public  void decreaseScoreByOne() {
		score--;
	}
	
	public  void resetScore() {
		score = 0;
	}

}
