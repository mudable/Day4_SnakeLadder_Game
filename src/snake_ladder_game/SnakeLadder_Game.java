package snake_ladder_game;

public class SnakeLadder_Game {
	static int position = 0;
	static int count = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to snake Ladder game.");
		while (position < 100) {
			int die = (int) (Math.random() * 10) % 7;
			System.out.println("Position of player is:" + die);
			int result = (int) (Math.random() * 10) % 3 + 1;
			count++;
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
			if (position > 100) {
				position = position = die;
				System.out.println("your position after ladder is ::" + position);
			}
			if (position == 100) {
				System.out.println("player won the game");
			}
		}
		System.out.println("Number of time the player roll the die is:" + count);
	}

}
