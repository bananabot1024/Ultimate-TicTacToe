/**
 * 
 * @author Maya Mistry, Greta Yu, Michelle Li
 * @period 1
 * 
 *         This abstract class represents the players of our Ultimate Tic-Tac
 *         -Toe game. It is abstract because the game can have two different
 *         types of players: a human player and an AI
 * 
 */
public abstract class Player {

	protected boolean isValid = false; // there is an empty space for a player
										// to make another move
	protected UltimateTicTacToeBoard board;
	protected GamePiece thisPlayersPiece;

	/**
	 * Constructor that passes through the UltimateTicTacToeBoard object and the
	 * GamePiece object to allow a human player to make a move on it.
	 * 
	 * @param b
	 *            - board used to play the game
	 * @param p
	 *            - game piece used (x or o)
	 */
	public Player(UltimateTicTacToeBoard b, GamePiece p) {
		board = b;
		thisPlayersPiece = p;
	}

	/**
	 * This abstract void method allows a human player or an AI to make a move
	 * based off of whether or not it is valid to make a move.
	 * @param moveRestrictions 
	 */
	public abstract int[] makeAMove(int[] moveRestrictions);

	/**
	 * Boolean method to check if a player is allowed to make a move.
	 * 
	 * @return isValid - true if there is an empty space available on the game
	 *         board and false if there are no spaces available.
	 */
	public boolean checkValidity(UltimateTicTacToeBoard board, int bigRow, int bigCol, int innerRow, int innerCol) {
		if (board.getPieceAt(bigRow, bigCol, innerRow, innerCol).getXorO().equals("_") && board.getTTTBoard(bigRow, bigCol).getWinner() == "_") {
			return true;
		}
		return false;
	}
	
}
