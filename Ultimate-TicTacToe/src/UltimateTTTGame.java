/**
 * 
 * @author Adrienne Ly
 * @period 1
 *
 */

/**
 * UltimateTTTGame class simulates the game of Ultimate TicTacToe.
 */

public class UltimateTTTGame {
	private UltimateTicTacToeBoard theBoard;
	private Player xPlayer;
	private Player oPlayer;

	public UltimateTTTGame(UltimateTicTacToeBoard board, Player xP, Player oP) {
		theBoard = board;
		xPlayer = xP;
		oPlayer = oP;
	}

	public void playGame() {
		while (!checkWinner(xPlayer) && !checkWinner(oPlayer)) {
			xPlayer.makeAMove();
			if (!checkWinner(xPlayer) && !checkWinner(oPlayer)) {
				oPlayer.makeAMove();
			}
		}

		if (checkWinner(xPlayer)) {
			System.out.println("You won, Player X!");
		} else {
			System.out.println("You won, Player 0!");
		}

	}

	public boolean checkWinner(Player p) {
		// checking each row of big squares
		for (int rSquare = 0; rSquare < 3; rSquare++) {
			if ((checkWinnerSquare(p, rSquare, 0) && checkWinnerSquare(p, rSquare, 1)
					&& checkWinnerSquare(p, rSquare, 2))) {
				return true;
			}
		}
		// checking each column of big squares
		for (int cSquare = 0; cSquare < 3; cSquare++) {
			if ((checkWinnerSquare(p, 0, cSquare) && checkWinnerSquare(p, 1, cSquare)
					&& checkWinnerSquare(p, 2, cSquare))) {
				return true;
			}
		}

		// check diagonals of big squares
		if ((checkWinnerSquare(p, 0, 0) && checkWinnerSquare(p, 1, 1) && checkWinnerSquare(p, 2, 2))
				|| (checkWinnerSquare(p, 2, 0) && checkWinnerSquare(p, 1, 1) && checkWinnerSquare(p, 0, 2))) {
			return true;
		}

		return false;
	}

	public boolean checkWinnerSquare(Player p, int rStart, int cStart) {

		// check each row of small square
		for (int rIn = 0; rIn < 3; rIn++) {
			if (theBoard.getPieceAt(rStart, cStart, rIn, 0).getXorO().equals(p.thisPlayersPiece.getXorO())
					&& theBoard.getPieceAt(rStart, cStart, rIn, 1).getXorO().equals(p.thisPlayersPiece.getXorO())
					&& theBoard.getPieceAt(rStart, cStart, rIn, 2).getXorO().equals(p.thisPlayersPiece.getXorO())) {
				return true;
			}

		}

		// check each column of small square
		for (int cIn = 0; cIn < 3; cIn++) {
			if (theBoard.getPieceAt(rStart, cStart, 0, cIn).getXorO().equals(p.thisPlayersPiece.getXorO())
					&& theBoard.getPieceAt(rStart, cStart, 1, cIn).getXorO().equals(p.thisPlayersPiece.getXorO())
					&& theBoard.getPieceAt(rStart, cStart, 2, cIn).getXorO().equals(p.thisPlayersPiece.getXorO())) {
				return true;
			}

		}

		// check diagonals of small square
		if ((theBoard.getPieceAt(rStart, cStart, 0, 0).getXorO().equals(p.thisPlayersPiece.getXorO())
				&& theBoard.getPieceAt(rStart, cStart, 1, 1).getXorO().equals(p.thisPlayersPiece.getXorO())
				&& theBoard.getPieceAt(rStart, cStart, 2, 2).getXorO().equals(p.thisPlayersPiece.getXorO()))
				|| (theBoard.getPieceAt(rStart, cStart, 2, 0).getXorO().equals(p.thisPlayersPiece.getXorO())
						&& theBoard.getPieceAt(rStart, cStart, 1, 1).getXorO().equals(p.thisPlayersPiece.getXorO())
						&& theBoard.getPieceAt(rStart, cStart, 0, 2).getXorO().equals(p.thisPlayersPiece.getXorO()))) {
			return true;
		}

		return false;
	}

}