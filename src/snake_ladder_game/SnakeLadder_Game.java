package snake_ladder_game;

public class SnakeLadder_Game {
	static int position = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to snake Ladder game.");
		int die = (int) (Math.random() * 10) % 7;
		System.out.println("Position of player is:" + die);
		int result = (int) (Math.random() * 10) % 3 + 1;

		System.out.println(" switch case number is " + result);
		switch (result) {
		case 1:
			System.out.println("No Play You are in the same position.");
			break;

		case 2:
			position = (position + die);
			System.out.println("your position after ladder is ::" + position);
			break;

		case 3:
			position = (position - die);

			if (position < 0) {
				position = 0;
			}
			System.out.println("Your Position after snake is::" + position);
			break;
		}
	}

}
