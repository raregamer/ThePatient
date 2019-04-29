package main;

public class Flower {
	
	public int [] pedals;
	
	//Flower constructor.
	public Flower() {
		//set random amount of pedals each time.
		this.pedals = new int[(int) (Math.random() * 6) + 1];
	}
	
	
	public void assignPedalValues() {
 		for(int i = 0; i < this.getPedals().length; i++) {
 			this.pedals[i] = getRandomNumber();
 		}
	}

	public int [] getPedals() {
		return pedals;
	}
	
	private int getRandomNumber() {
		int max = 50;
		int min = -50;
		int range = max - min + 1;
		int randomNum = (int) (Math.random() * range) + min;
		return randomNum;
	}

	
	

}
