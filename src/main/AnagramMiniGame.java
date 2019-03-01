package main;

import java.util.Scanner;

public class AnagramMiniGame implements Games {
//Anagram variables
	private String anagram;
	private String anagramAnswer;
	private int playerHealth;
 	
public AnagramMiniGame(int playerHealth) {
	this.playerHealth = playerHealth;
}
	
	
//Method to start anagram game. 
	public int startGame(int playerHealth) {
		//Scanner for input.
		System.out.println("That is an interesting choice, can you take a look at this and try to solve it?");
		Scanner s = new Scanner(System.in);
		anagram = "odwr";
		anagramAnswer = "word";
		System.out.println("guess anagram " + anagram);
		
		String playersGuess = s.next();
		if(checkAnswer(playersGuess,anagramAnswer)) {
			 System.out.println("Very good");
			 playerHealth++;
			 
		}else {
			System.out.println("Hmm...we will need to work on that");
			playerHealth--;
		}
		
		return playerHealth;
		
	}
	
	private boolean checkAnswer(String playersAnswer, String correctAnswer) {
		if(playersAnswer.equals(correctAnswer)) {
			return true;
		
		} else {
			return false;
	}
	}

	
}
