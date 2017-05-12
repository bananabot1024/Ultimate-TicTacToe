/**
 * TicTacToeBoard class-Class that creates a 3x3 tic tac toe board The class
 * contains methods to set and get a certain square on the board
 * 
 * @author yugreta3411, Michelle Li 
 * period 1
 */
public class TicTacToeBoard {

	private GamePiece[][] board;
	private String winner = "_";

	/**
	 * TicTacToeboard constructor-Constructor that initializes board to a 3x3
	 * array of game pieces
	 */

	public TicTacToeBoard() {
		board = new GamePiece[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = new GamePiece("_");
			}
		}
	}

	/**
	 * Method that gets the piece at a certain row and column of the tic tac toe
	 * board
	 * 
	 * @param row
	 *            the row of the board
	 * @param column
	 *            the column of the board
	 * @return the game piece at that row or column, null if there is no game
	 *         piece object
	 */

	public GamePiece getPieceAt(int row, int column) {
		return board[row][column];
	}

	/**
	 * Method that sets the square at that row and column to a certain game
	 * piece
	 * 
	 * @param row
	 *            the row of the square to be set
	 * @param column
	 *            the column of the square to be set
	 * @param setTo
	 *            the game piece the square will be set to
	 */

	public void setPieceAt(int row, int column, GamePiece setTo) {
		board[row][column] = setTo;
	}
	
	public String getRow(int row) {
		return board[row][0].getXorO() + " " + board[row][1].getXorO() + " " + board[row][2].getXorO();
	}
	
	public String getWinner() {
		return winner;
	}
	
	public void setWinner(String s) {
		winner = s;
	}

}
