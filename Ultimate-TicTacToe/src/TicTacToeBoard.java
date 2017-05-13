/**
 * TicTacToeBoard class-Class that creates a 3x3 tic tac toe board The class
 * contains methods to set and get a certain square on the board
 * 
 * @author yugreta3411, Michelle Li 
 * period 1
 */

import javafx.scene.layout.GridPane;

public class TicTacToeBoard extends GridPane {

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
				add(board[i][j].getButton(), i, j);
			}
		}
		setStyle("-fx-border-color: white; -fx-border-width: 1; -fx-border-radius: 5");
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
		board[row][column].setXorO(setTo.getXorO());
	}
	
	public String getRow(int row) {
		return board[row][0].getXorO() + " " + board[row][1].getXorO() + " " + board[row][2].getXorO();
	}
	
	public String getWinner() {
		return winner;
	}
	
	public void setWinner(String s) {
		winner = s;
		if (winner.equals("X")) {
			for (int r = 0; r < 3; r++) {
				for (int c = 0; c < 3; c++) {
					board[r][c].getButton().setStyle("-fx-border-color: white; -fx-border-width: 1; -fx-border-radius: 5;-fx-background-color: darkred;-fx-text-fill: white;");
				}
			}
		}
        else {
        	for (int r = 0; r < 3; r++) {
				for (int c = 0; c < 3; c++) {
					board[r][c].getButton().setStyle("-fx-border-color: white; -fx-border-width: 1; -fx-border-radius: 5;-fx-background-color: royalblue;-fx-text-fill: white;");
				}
			}
        }
	}

}
