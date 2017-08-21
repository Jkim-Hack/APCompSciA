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
	
	VBox box = new VBox();
	
	Stage stge = new Stage();
	
	Button moreNumbers = new Button("MORE NUMBERSSSSS");
	moreNumbers.setOnAction((ActionEvent event) -> {
		
		MoreNums more = new MoreNums();
		more.displayNums();
		
	});
	
	box.getChildren().addAll(moreNumbers);
	box.setPadding(new Insets(20));
	
	Label answer = new Label("" + operation.display());
	answer.setFont(Font.font ("Segoe UI", 24));
	answer.setPadding(new Insets(20));
	
	BorderPane pane = new BorderPane();
	
	pane.setCenter(answer);
	pane.setTop(box);
	
	
	Scene scene = new Scene(pane, 300,200);
	
	stge.setScene(scene);
	stge.show();
	
	
	}


}
