package MainPackage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Alert {

	
//Creates new AlertBox method	
	public void AlertBox() {
	
		//New Stage and VBox
		Stage stge = new Stage();
		
		VBox box = new VBox();
		
		//New BorderPane called pane
		BorderPane pane = new BorderPane();
		
		//New label, labeled "error"
		Label error = new Label("ERROR");
		
		//New scene with parameters with pane and width and height
		Scene scene = new Scene(pane, 230, 150);
		//Puts error button as a child in VBox parent.
		box.getChildren().add(error);
		
		//VBox is set the center of the pane
		pane.setCenter(box);
		//Set alignment of VBox
		box.setAlignment(Pos.CENTER);
		
		//Stage is set with the scene
		stge.setScene(scene);
		//Stage is shown
		stge.show();
		
		
	}
}
