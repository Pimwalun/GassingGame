package lab1;

import java.util.Random; // for random number

/**
 * Game of guessing a secret number.
 * @author Pimwalun Witchawanitchanun
 */
public class GuessingGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	private int count = 0;

	/**
	 * Initialize a new game
	 * @param upperBound is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) { // This is a constructor
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
	}
	
	/**
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}
	
	/**
	 * Create evaluation a guess.
	 * @param number is the number from guessing
	 * @return evaluation a guess
	 */
	public boolean guess(int number) {
		count++;
		if (number == this.secret) {
			setHint("Right! The secret is " + number);
			return true;
		} else if (number > this.secret) {
			setHint("Sorry, your guess is too large");
			return false;
		} else {
			setHint("Sorry, your guess is too small");
			return false;
		}
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return this.hint;
	}
	
	/**
	 * @param hint Set the game hint
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}
	
	/**
	 * Return a random number
	 * @return random number
	 */
	public int getSecret() {
		return this.secret;
	}
	
	/**
	 * Return the recent count
	 * @return the recent count
	 */
	public int getCount() {
		return count;
	}

}
