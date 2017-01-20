package Lab1;

import java.util.Random;

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count = 0;

	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;

	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	public int getSecret() {
		return secret;
	}

	public void setSecret(int secret) {
		this.secret = secret;
	}

	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	public boolean guess(int num) {
		if (num == this.secret) {
			setHint("Correct! The secret is " + num);
			return true;
		} else if (num > this.secret) {
			setHint("Sorry, too large");
			return false;
		} else {
			setHint("Sorry, too small");
			return false;
		}
	}

	public String getHint() {
		return hint;
	}

	protected void setHint(String hint) {
		this.hint = hint;
	}

	public int getCount() {
		return count;
	}

	public void setCount() {
		count++;
	}

}
