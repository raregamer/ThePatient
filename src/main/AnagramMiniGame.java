package main;

import java.util.Scanner;

public class AnagramMiniGame {
//Anagram variables
	private String anagram;
	private String anagramAnswer;
	
	
//Method to start anagram game. 
	public void startAnagramGame() {
		//Scanner for input.
		Scanner s = new Scanner(System.in);
		anagram = "odwr";
		anagramAnswer = "word";
		System.out.println("guess anagram " + anagram);
		
		String playersGuess = s.next();
		if(checkAnswer(playersGuess,anagramAnswer)) {
			 System.out.println("correct");
			 Score.increaseScoreByOne();
			 
		}else {
			System.out.println("wrong");
			Score.decreaseScoreByOne();
		}
		System.out.println(playersGuess + " " + anagramAnswer);
		
		
		
	}
	
	private boolean checkAnswer(String playersAnswer, String correctAnswer) {
		if(playersAnswer.equals(correctAnswer)) {
			return true;
		
		} else {
			return false;
	}
	}

	
}
