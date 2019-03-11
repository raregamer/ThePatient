package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramMiniGame implements Games {
//Anagram variables
	private String anagramScrambledWord;
	private String anagramAnswer;
	private int playerHealth;
	
 	//Constructor
 	public AnagramMiniGame(int playerHealth) {
	this.playerHealth = playerHealth;
}
		
//Method to start anagram game. 
	public int startGame(int playerHealth) {
		//Scanner for input.
		System.out.println("That is an interesting choice, can you take a look at this and try to solve it?");
		Scanner s = new Scanner(System.in);
		
		anagramAnswer = getWord();
		anagramScrambledWord = scrambleWord(anagramAnswer); //make a method to scramble word. scrambleWord();
		System.out.println("guess anagram " + anagramScrambledWord);
		
		String playersGuess = s.next();
		if(checkAnswer(playersGuess,anagramAnswer)) {
			 System.out.println("Very good");
			 playerHealth += 10;
			 
		}else {
			System.out.println("Hmm...we will need to work on that");
			playerHealth -= 20;
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
	
	private String getWord() {
		//get words from dictionary api.
		ArrayList<String> wordList = new ArrayList <String>();
		wordList.add("Word");
		wordList.add("Flower");
		
		int randomIndex = (int) (Math.random() * wordList.size());
		
		return wordList.get(randomIndex);
	}
	
	private String scrambleWord(String word) {
		 String currentWord = word;
		 //Split word into an array
		char [] wordSplit = currentWord.toCharArray();
		
		for (int i = 0; i < wordSplit.length; i++) {
			
	        int randomIndex = (int)(Math.random() * wordSplit.length);
	        char temp = wordSplit[i];
	        wordSplit[i] = wordSplit[randomIndex];
	        wordSplit[randomIndex] = temp;
		}
		
		return new String(wordSplit);
	}

	
}
