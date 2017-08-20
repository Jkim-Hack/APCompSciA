package MainPackage;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Alert {

	public void AlertBox() {
	
		Stage stge = new Stage();
		
		VBox box = new VBox();
		
		BorderPane pane = new BorderPane();
		
		Label error = new Label("ERROR");
		
		Scene scene = new Scene(pane, 230, 150);
		
		box.getChildren().add(error);
		
		pane.setCenter(box);
		box.setAlignment(Pos.CENTER);
		
		stge.setScene(scene);
		stge.show();
		
		
	}
}
