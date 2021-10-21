package snake_ladder_game;

public class SnakeLadder_Game {
	static int position = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to snake Ladder game.");
		int position = (int) (Math.random() * 10) % 7;
		System.out.println("Position of player1 is:" + position);
	}

}
