package atm.problems;

import java.util.Scanner;

public class AtmQuestionWithBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String correctPin = ("2394");

		// Prompt the user for a PIN
		System.out.println("Pleae enter your 4-digit pin:");
		String userPin = input.nextLine();
		int guessNumber = 1;
		while (!userPin.equals(correctPin)) {
			System.out.println("I am sorry, please try again");
			userPin = input.nextLine();
			guessNumber++;
			if (userPin.equals(correctPin)) {
				System.out.println("Correct. Would you like to make a deposit or a withdrawl?");
				break;
			} else if (guessNumber == 3) {
				System.out.println(
						"I am sorry, you have exceeded the maximum amount of guesses. Your account is locked for 24 hours.");
				break;
			}
		}
		input.close();
	}

}
