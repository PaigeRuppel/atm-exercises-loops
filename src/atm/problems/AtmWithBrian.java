package atm.problems;

import java.util.Scanner;

public class AtmWithBrian {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userPin = ("1234");
		String guess;

		int failCount = 0;
		do {
			System.out.println("Enter your pin:");
			guess = input.nextLine();

			if (!guess.equals(userPin)) { // it is wrong
				System.out.println("Incorrect.");
				failCount++; //increases fail count by one each time they guess wrong
			}
			if (failCount==3) {
				System.out.println("Sorry, you have exceeded the maximum number of guesses.");
				break;
			}
		} while (!guess.equals(userPin)); // ! is NOT

		System.out.println("Correct. Would you like to make a deposit or withdrawl?");
	input.close();
	}

}
