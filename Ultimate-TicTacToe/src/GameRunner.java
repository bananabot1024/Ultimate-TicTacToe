import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GameRunner extends Application {

	private static Player xPlayer = null, oPlayer = null;
	private static UltimateTicTacToeBoard board = new UltimateTicTacToeBoard();
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		xPlayer = null;
//		oPlayer = null;
//		board = new UltimateTicTacToeBoard();
//		System.out.println("Choose the X piece player. Type 1 for human player and type 2 for a computer");
//		int number = sc.nextInt();
//		if (number == 1) {
//			xPlayer = new HumanPlayer(board, new GamePiece("X"));
//		} else if (number == 2) {
//			System.out.println("Choose level of difficulty for the computer: (1) for easy and (2) for hard");
//			int level = sc.nextInt();
//			if (level == 1) {
//				xPlayer = new EasyAI(board, new GamePiece("X"));
//			} else {
//				xPlayer = new HardAI(board, new GamePiece("X"));
//			}
//		}
//		System.out.println("Choose the O piece player. Type 1 for human player and type 2 for a computer");
//		int number2 = sc.nextInt();
//		if (number2 == 1) {
//			oPlayer = new HumanPlayer(board, new GamePiece("O"));
//		} else if (number2 == 2) {
//			System.out.println("Choose level of difficulty for the computer: (1) for easy and (2) for hard");
//			int level1 = sc.nextInt();
//			if (level1 == 1) {
//				oPlayer = new EasyAI(board, new GamePiece("O"));
//			} else {
//				oPlayer = new HardAI(board, new GamePiece("O"));
//			}
//		}
		launch(args);
		//UltimateTTTGame game = new UltimateTTTGame(board, xPlayer, oPlayer);
		//game.playGame();

	}
	
	public void start(Stage stage) throws Exception {
		stage.setTitle("Ultimate Tic Tac Toe");
		UltimateTTTGame g = new UltimateTTTGame(board, new HumanPlayer(board, new GamePiece("X")), new HumanPlayer(board, new GamePiece("")),stage);
		stage.setScene(new Scene(g));
		stage.show();
		g.playGame();
	}

}
