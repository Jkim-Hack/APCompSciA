package MainPackage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MoreNums {
	
	public void displayNums() {
		
		VBox box = new VBox();
		box.setSpacing(50);
		
	
		
		Stage stge = new Stage();
		
		int random = (int)(Math.random() * 50 + 1);
		int random1 = (int)(Math.random() * 50 + 1);
		
		
		int j = 0;
		int i = 1;
		
		while(i <= random) {
			
			random1 = i*random1;
			
			j = random1;
			
			i++;
			
		}
		
		int k = 0;
		
		do {
			random = i*random;
			k = random;
			i++;
		} while(i <= random1);
		
		
		
		
		Label label = new Label("" + j);
		label.setPadding(new Insets(20));
		
		Label label1 = new Label("" + k);
		label1.setPadding(new Insets(20));
		
		box.getChildren().addAll(label, label1);
		box.setPadding(new Insets(20));
		box.setAlignment(Pos.CENTER);
		
		
		
		BorderPane pane = new BorderPane();
		
		pane.setCenter(box);
		
		
		Scene scene = new Scene(pane, 300,200);
		
		stge.setScene(scene);
		stge.show();
		
		
		}
		
	}


