package main;

import java.util.Scanner;

public class FlowerGame implements Games {

	/*
	 * flower game pick flower has 6 leaves with random values -10 to +10 6 chances
	 * to take it or leave the flower. ---------------------
	 * 
	 * make flower object, can be an array with 6 random values (pick leave) go
	 * through each value and present to player to accept or not accept if accept
	 * return value and add to points.
	 */

	private int playerHealth;

	// Constructor
	public FlowerGame(int playerHealth) {
		this.playerHealth = playerHealth;
	}

	public int startGame(int playerHealth) {
		Scanner input = new Scanner(System.in);
		Flower flower = new Flower();
		flower.assignPedalValues();
		int currentPedalValue = 0;

		for (int i = 0; i < flower.pedals.length; i++) {
			currentPedalValue = flower.pedals[i];
			System.out.println("The pedal you have is worth " + currentPedalValue + " health points."
					+ "\nWould you like to keep this pedal or pick a new one.");

			int selection = 0;

			while (selection != 1) {

				try {
					System.out.println("1. Pick flower\n2. Keep flower");
					selection = input.nextInt();

				} catch (Exception e) {
					System.out.println("Not a valid option.");
					input.next();
				} finally {
					if (selection == 2) {
						System.out.println("break");
						break;
					}

				}
			}

			if (selection == 2) {
				System.out.println("break");
				break;
			}

		}
		System.out.println("Your current pedal is worth " + currentPedalValue);
		if(currentPedalValue <= 0) {
			System.out.println("Better luck next time.");
		}
		System.out.println("");
		return playerHealth + currentPedalValue;

	}

}
