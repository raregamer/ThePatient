package main;

/*Choice class to make a choice and get the next room/scenario based on that choice*/

public class Choice {
	//Set choiceText to a choice option (I.E. "Go forward");
	private String choiceText;
	//nextRoomPage will have you go to a new place or 
	//what happens next based on this choice)
	private int nextRoomPage;
	private int subRoomPage;
	
	
	private Games game; 
	private boolean isAction; 
	

	//constructor for text and to next page
	public Choice(String choiceText, int nextRoomPage, int subRoomPage) {
		this.setChoiceText(choiceText);
		this.setNextRoomPage(nextRoomPage);
		this.setSubRoomPage(subRoomPage);
	}
	
	//constructor to pass in game. 
	public Choice(String choiceText, Games game) {
		this.setChoiceText(choiceText);
		this.setGame(game);
		setAction(true);
	}

	
	//Getter and setters
	
	public int getSubRoomPage() {
		return subRoomPage;
	}

	public void setSubRoomPage(int subRoomPage) {
		this.subRoomPage = subRoomPage;
	}

	
	public boolean isAction() {
		return isAction;
	}

	public void setAction(boolean isAction) {
		this.isAction = isAction;
	}

	public Games getGame() {
		return game;
	}
	public void setGame(Games game) {
		this.game = game;
	}
	
	public int getNextRoomPage() {
		return nextRoomPage;
	}
	public void setNextRoomPage(int nextRoomPage) {
		this.nextRoomPage = nextRoomPage;
	}
	public String getChoiceText() {
		return choiceText;
	}
	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}

}
