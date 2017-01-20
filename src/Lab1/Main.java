package Lab1;

public class Main {
	public static void main(String[] args) {
//		System.out.println("I'm thinking of a number between 1 to 20");
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
