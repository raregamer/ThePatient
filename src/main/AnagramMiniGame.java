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
		wordList.add("Help");
		wordList.add("Doctor");
		wordList.add("Mr. Belmonte");
		wordList.add("Forever");
		wordList.add("Canvas");
		wordList.add("Xylophone");
		wordList.add("Quarantine");
		wordList.add("Illusion");
		
		int randomIndex = (int) (Math.random() * wordList.size());
		
		return wordList.get(randomIndex);
	}
	
	private String scrambleWord(String word) {
		 String currentWord = word;
		 //Split word into an array
		char [] wordSplit = currentWord.toCharArray();
		
		for (int i = 0; i < wordSplit.length; i++) {
			
	        int randomIndex = (int)(Math.random() * wordSplit.length);
	        //make a temp of the value so we can switch it with the random letters
	        char temp = wordSplit[i];
	        //put value of random index into the loop index 
	        wordSplit[i] = wordSplit[randomIndex];
	        //now put the temp into the random index spot.
	        wordSplit[randomIndex] = temp;
		}
		
		return new String(wordSplit);
	}

	
}
