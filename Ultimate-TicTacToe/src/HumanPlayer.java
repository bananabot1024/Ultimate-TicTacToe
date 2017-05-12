import java.util.Scanner;

/**
 * 
 * @author Maya Mistry
 * @period 1
 * 
 */
public class HumanPlayer extends Player {
	
	protected Scanner input;

	/**
	 * Constructor that passes through the UltimateTicTacToeBoard object and the
	 * GamePiece object to allow a human player to make a move on it.
	 * 
	 * @param b
	 *            - board used to play the game
	 * @param p
	 *            - game piece used (x or o)
	 */
	public HumanPlayer(UltimateTicTacToeBoard b, GamePiece p) {
		super(b, p);
	}

	/**
	 * This abstract void method allows a human player or an AI to make a move
	 * based off of whether or not it is valid to make a move. (Implemented
	 * version for human player)
	 * 
	 */
	public int[] makeAMove(int[] moveRestrictions) {
		input = new Scanner(System.in);
		int outsideR = input.nextInt();
		int outsideC = input.nextInt();
		int insideR = input.nextInt();
		int insideC = input.nextInt();
		board.setPieceAt(outsideR, outsideC, insideR, insideC, thisPlayersPiece);
		int[] move = {outsideR, outsideC, insideR, insideC};
		return move;
	}
}
