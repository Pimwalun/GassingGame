package Lab1;

import java.util.Scanner;

public class GameConsole {

	public int play(GuessingGame game){
		Scanner scanner = new Scanner(System.in);
		String title = "Guessing Game";
		String prompt = "Your guess?";
		System.out.println(game.getHint());
		System.out.println(title);
		
		int num = 0;
		
		while (!game.guess(num)){
			game.getHint();
			System.out.print(prompt);
			num = scanner.nextInt();
			game.guess(num);
			System.out.println(game.getHint());
			game.setCount();
		}
		System.out.println(game.getCount());
		return game.getSecret();
	}
}
