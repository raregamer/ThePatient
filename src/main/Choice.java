package main;

/*Choice class to make a choice and get the next room/scenario based on that choice*/

public class Choice {
	//Set choiceText to a choice option (I.E. "Go forward");
	private String choiceText;
	//nextRoomPage will have you go to a new place or 
	//what happens next based on this choice)
	private int nextRoomPage;
	
	
	//constructor for text and to next page
	public Choice(String choiceText, int nextRoomPage) {
		this.setChoiceText(choiceText);
		this.setNextRoomPage(nextRoomPage);
	}

	
	//Getter and setters
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
