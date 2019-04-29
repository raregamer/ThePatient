package main;

public class Flower {
	
	public int [] petals;
	
	//Flower constructor.
	public Flower() {
		//set random amount of petals each time.
		this.petals = new int[(int) (Math.random() * 6) + 1];
	}
	
	
	public void assignPetalValues() {
 		for(int i = 0; i < this.getPetals().length; i++) {
 			this.petals[i] = getRandomNumber();
 		}
	}

	public int [] getPetals() {
		return petals;
	}
	
	private int getRandomNumber() {
		int max = 50;
		int min = -50;
		int range = max - min + 1;
		int randomNum = (int) (Math.random() * range) + min;
		return randomNum;
	}

	
	

}
