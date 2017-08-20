package MainPackage;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Display {

	protected NumberStore operation;
	
	
	public Display(NumberStore op) {
		this.operation = op;
	}
	

	public NumberStore getOperation() {
		return operation;
	}



	public void setOperation(NumberStore operation) {
		this.operation = operation;
	}



public void displayItems() {
	
	
	
	Stage stge = new Stage();
	
	
	Label answer = new Label("" + operation.display());
	answer.setPadding(new Insets(20));
	
	BorderPane pane = new BorderPane();
	
	pane.setCenter(answer);
	
	Scene scene = new Scene(pane, 500,450);
	
	stge.setScene(scene);
	stge.show();
	
	
	}
	
}
