package atm.problems;

import java.util.Scanner;

public class AtmAskForUserPin {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int correctPin = 2394;

		// Prompt the user for a PIN
		System.out.println("Pleae enter your 4-digit pin:");
		int userPin = input.nextInt();
		int guessNumber = 1;
		while (userPin != correctPin) {
			if (guessNumber < 3) {
				System.out.println("I am sorry, please try again"); // Display an error message if the user guesses wrong and prompt again
				userPin = input.nextInt();
				guessNumber++;
			} else {
				System.out.println(
						"Incorrect again. You have exceeded the maximum amount of guesses. Your account is now locked indefinitely. Good luck.");
				System.exit(0); // stretch - quit after three failed attempts with an apologetic message
			}
		}
		System.out.println("Correct."); 	// If user gets it right, print congratulatory message
	input.close();
	}
}
