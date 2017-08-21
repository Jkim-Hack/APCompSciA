package MainPackage;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LuckCounter {

	
	public void Lucky() {
		
		Stage stage = new Stage();
		
		Label label = new Label("You have chosen the lucky letter!");
		label.setPadding(new Insets(20));
		
		
		BorderPane pane = new BorderPane();
		
		Scene scene = new Scene(pane, 230, 150);
		
		pane.setCenter(label);
		
		stage.setScene(scene);
		stage.show();
		
	}

	public void UnLucky() {
		
		Stage stage = new Stage();
		
		Label label = new Label("You have chosen the UNLUCKY letter! How unfortunate... ");
		label.setPadding(new Insets(20));
		
		
		BorderPane pane = new BorderPane();
		
		Scene scene = new Scene(pane, 350, 150);
		
		pane.setCenter(label);
		
		stage.setScene(scene);
		stage.show();
		
	}	
	
}
