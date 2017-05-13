/**
 * 
 * @author Somya Bhatia, Michelle Li
 * Period 1
 *
 */
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GamePiece extends GridPane{

	private Button button = new Button();
	private final int SQUARE_LENGTH = 70;
	private String XorO;

	/**
	 * constructor to pass in values for the two variables
	 * 
	 * @param exoh
	 *            - either X or O
	 */
	public GamePiece(String exoh) {
		XorO = exoh;
		button.setMinSize(SQUARE_LENGTH, SQUARE_LENGTH);
        button.setOnAction(e -> {
            if (button.getText().isEmpty()) {
                button.setText(XorO);
                if (XorO.equals("X")) button.setStyle("-fx-text-fill: darkred;");
                else button.setStyle("-fx-text-fill: royalblue;");
            }
        });
	}
	
	public Button getButton() {
		return button;
	}

	/**
	 * setter method to set the value of the game piece
	 * 
	 * @param exoh
	 *            - either X or O
	 */
	public void setXorO(String exoh) {
		XorO = exoh;
		button.setText(XorO);
		if (XorO.equals("X")) button.setStyle("-fx-text-fill: darkred;");
        else button.setStyle("-fx-text-fill: royalblue;");
	}

	/**
	 * getter method to return either X or O
	 * 
	 * @return
	 */
	public String getXorO() {
		return XorO;
	}
	
	/**
	 * toString method
	 */
	public String toString() {
		return XorO;
	}

}
