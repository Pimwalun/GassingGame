package guessinggame;

/**
 * This is main method start the Game of guessing
 * @author Pimwalun Witchawanitchanun
 */
public class Main {
	/** create objects and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
