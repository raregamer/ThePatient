package main;

public class Player {
	
	//Variables
	String mName;
	char mSex;
	int mHealth; 
	String [] mItems; 
	
	//constructor
	public Player(String name, char sex){
		setmName(name);
		setmSex(sex);
		setmHealth(40);
	}
	
	//Getters and Setters
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public char getmSex() {
		return mSex;
	}
	public void setmSex(char mSex) {
		this.mSex = mSex;
	}
	public int getmHealth() {
		return mHealth;
	}
	public void setmHealth(int mHealth) {
		this.mHealth = mHealth;
	}
	public String[] getmItems() {
		return mItems;
	}
	public void setmItems(String[] mItems) {
		this.mItems = mItems;
	}


}
