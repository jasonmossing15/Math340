/*
 * this class is used to keep track of the board, and all of the moves
 */
public class gamePanel {

	public static int numberOfSquares;
	public String game[];

	public gamePanel(int numOfSquares) {
		numberOfSquares = numOfSquares;
		game = new String[numberOfSquares];
	}

	public gamePanel(String oldgame[]) {
		game = oldgame;
	}

	/*
	 * this function checks to see if the move chosen is valid
	 */
	boolean isValidMove(int newMove) {
		if (isOpen(newMove)) {
			if (newMove >= 1 && newMove < game.length - 1) {
				if (isOpen(newMove - 1) && isOpen(newMove + 1)) {
					return true;
				}
			} else if (newMove == game.length - 1) {
				if (isOpen(newMove - 1)) {
					return true;
				}
			} else if (newMove == 0) {
				if (isOpen(newMove + 1)) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * this function checks to see if there are any available moves left.
	 */
	boolean gameOver() {
		for (int i = 0; i < game.length; i++) {
			if (game[i] == null) {
				return false;
			}
		}
		return true;
	}

	/*
	 * this function places a move on the board.
	 */
	void placeMove(int move, int Player) {
		game[move] = Integer.toString(Player);
		if (move != 0) {
			game[move - 1] = "X";
		}
		if (move != game.length - 1) {
			game[move + 1] = "X";
		}

	}

	/*
	 * this function checks to see if the spot being checked is open or has an
	 * X. This won't allow you to place on an X due to the logic used in the
	 * isValidMove() function.
	 */
	boolean isOpen(int move) {
		if (move >= 0 && move < game.length) {
			if (game[move] == null) {
				return true;
			} else {
				if (game[move].equals("X")) {
					return true;
				}
			}
		}
		return false;
	}

}