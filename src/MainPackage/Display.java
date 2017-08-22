package MainPackage;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Display {

	//New NumberStore object called operation
	protected NumberStore operation;
	
	//Display class object has parameters of the operation selected and open the specific selected operation
	public Display(NumberStore op) {
		this.operation = op;
	}
	
	//Getters and Setters of operation
	public NumberStore getOperation() {
		return operation;
	}



	public void setOperation(NumberStore operation) {
		this.operation = operation;
	}


//New method to display operation
public void displayItems() {
	
	//New VBox
	VBox box = new VBox();
	
	//New Stage is set
	Stage stge = new Stage();
	
	//Button "MORE NUMBERSSSS" is created and when pressed it displays the method displayNums()
	Button moreNumbers = new Button("MORE NUMBERSSSSS");
	moreNumbers.setOnAction((ActionEvent event) -> {
		
		MoreNums more = new MoreNums();
		more.displayNums();
		
	});
	
	//Children are set in a VBox parent along with its padding
	box.getChildren().addAll(moreNumbers);
	box.setPadding(new Insets(20));
	
	//New Label that shows the operation's display method along with padding and font.
	Label answer = new Label("" + operation.display());
	answer.setFont(Font.font ("Segoe UI", 24));
	answer.setPadding(new Insets(20));
	
	//New BorderPane is created
	BorderPane pane = new BorderPane();
	
	//The Answer is set on the center portion of the pane
	pane.setCenter(answer);
	
	//The VBox and children are set on the top portion of the pane
	pane.setTop(box);
	
	//New scene created with parameters of pane, width and height
	Scene scene = new Scene(pane, 300,200);
	
	//Scene is set to stage
	stge.setScene(scene);
	//Shows stage
	stge.show();
	
	
	}


}
