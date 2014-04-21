/*
 * This class is used to implement the computer's logic
 */
public class computer {

	public int winingStrategy;
	public gamePanel board;

	public computer(int numberOfSquares, gamePanel inBoard) {
		winingStrategy = numberOfSquares;
		board = inBoard;
	}

	public void updateBoard(gamePanel inBoard) {
		board = inBoard;
	}

	/*
	 * this function will move the computer based on the correct strategy
	 */
	public int move() {
		double r = Math.random();
		if (winingStrategy == 5) {
			if (board.game[0] != null && board.game[0].equals("1")) {
				return 3;
			} else if (board.game[1] != null && board.game[1].equals("1")) {
				return 4;
			} else if (board.game[2] != null && board.game[2].equals("1")) {
				if (r <= 0.5) {
					return 4;
				} else {
					return 0;
				}
			} else if (board.game[3] != null && board.game[3].equals("1")) {
				if (r <= 0.5) {
					return 1;
				} else {
					return 0;
				}
			} else if (board.game[4] != null && board.game[4].equals("1")) {
				if (r <= 0.5) {
					return 1;
				} else {
					return 0;
				}
			}
		} else {
			if (board.game[0] != null && board.game[0].equals("1")) {
				if (r <= 0.2) {
					return 2;
				} else if (r <= 0.5) {
					return 3;
				} else if (r <= 0.7) {
					return 4;
				} else {
					return 5;
				}
			} else if (board.game[1] != null && board.game[1].equals("1")) {
				return 4;
			} else if (board.game[2] != null && board.game[2].equals("1")) {
				if (r <= 0.3) {
					return 0;
				} else if (r <= 0.6) {
					return 3;
				} else {
					return 4;
				}
			} else if (board.game[3] != null && board.game[3].equals("1")) {
				if (r <= 0.3) {
					return 0;
				} else if (r <= 0.6) {
					return 1;
				} else {
					return 4;
				}
			} else if (board.game[4] != null && board.game[4].equals("1")) {
				return 1;
			} else if (board.game[5] != null && board.game[5].equals("1")) {
				if (r <= 0.2) {
					return 0;
				} else if (r <= 0.5) {
					return 1;
				} else if (r <= 0.7) {
					return 2;
				} else {
					return 3;
				}
			}

		}

		return 9;
	}
}
