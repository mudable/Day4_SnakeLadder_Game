package snake_ladder_game;

public class SnakeLadder_Game {
	int position = 0;
	static int count = 0;
	int position1 = 0;

	int position2 = 0;

	public int start(int position) {

		this.position = position;
		count = 0;
		// position = 0;

		int rollDice = position();
		int checkValue = die();
		switch (checkValue) {
		case 0:
			System.out.println("player in the same position");
			break;
		case 1:
			position = (position + rollDice);
			System.out.println("player position after ladder is :" + position);
			break;
		case 2:
			position = (position - rollDice);
			System.out.println("player Position after snake is:" + position);
			if (position < 0) {
				position = 0;
			}
			break;
		}
		if (position > 100) {
			position = position - rollDice;
			System.out.println("your position after ladder is :" + position);
		}
		return position;

	}

	public void checkWinner(SnakeLadder_Game obj) {
		while (position1 < 100 && position2 < 100) {
			position1 = obj.start(position1);
			System.out.println("Position of player 1 is " + position1);
			if (position1 == 100) {
				System.out.println("player1 own the game");
			}
			position2 = obj.start(position2);
			System.out.println("Position of player 2 is " + position2);
			if (position2 == 100) {
				System.out.println("player2 own the game");
			}
		}
	}

	static int position() {
		count++;
		return (int) (Math.random() * 10) % 6 + 1;

	}

	static int die() {
		return (int) (Math.random() * 10) % 3;
	}

	public static void main(String[] args) {
		SnakeLadder_Game obj1 = new SnakeLadder_Game();
		obj1.checkWinner(obj1);
	}
}