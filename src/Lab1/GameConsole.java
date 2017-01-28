package lab1;

import java.util.Scanner;

/**
 * GameConsole has to ask the GuessingGame if a user's guess is correct, and ask for hint
 * @author Pimwalun
 *
 */
public class GameConsole {
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game pulls the class GuessingGame 
	 * @return the secret number when user guesses it.
	 */
	public int play(GuessingGame game) {
		Scanner scanner = new Scanner(System.in);
		String title = "Guessing Game";
		String prompt = "Your guess? ";
		System.out.println(game.getHint());
		System.out.println(title);

		int number = 0;
		while (number != game.getSecret()) {
			game.getHint();
			System.out.print(prompt);
			number = scanner.nextInt();
			game.guess(number);
			System.out.println(game.getHint());
		}
		System.out.println("Correct. You used " + game.getCount() + " guesses.");
		return number;
	}
}
