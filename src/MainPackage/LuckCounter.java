package MainPackage;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LuckCounter {

	//Makes a new method called Lucky
	public void Lucky() {
		
		//Sets a new Stage
		Stage stage = new Stage();
		
		//New Label is created and padding is set
		Label label = new Label("You have chosen the lucky letter!");
		label.setPadding(new Insets(20));
		
		//New borderpane created
		BorderPane pane = new BorderPane();
		
		//New Scene created with parameters with pane and width and height
		Scene scene = new Scene(pane, 230, 150);
		
		//Label is set the center of borderpane
		pane.setCenter(label);
		
		//Stage sets the scene
		stage.setScene(scene);
		//Stage is shown
		stage.show();
		
	}

	//Makes a new method called Lucky
	public void UnLucky() {
		
		//Sets a new Stage
		Stage stage = new Stage();
		
		//New Label is created and padding is set
		Label label = new Label("You have chosen the UNLUCKY letter! How unfortunate... ");
		label.setPadding(new Insets(20));
		
		//New borderpane created
		BorderPane pane = new BorderPane();
		
		//New Scene created with parameters with pane and width and height
		Scene scene = new Scene(pane, 350, 150);
		
		//Label is set the center of borderpane
		pane.setCenter(label);
		
		//Stage sets the scene
		stage.setScene(scene);
		
		//Stage is shown
		stage.show();
		
		
	}	
	
}
