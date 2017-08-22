package MainPackage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MoreNums {
	
	//New method called displayNums
	public void displayNums() {
		
		//new VBox created with spacing between each child
		VBox box = new VBox();
		box.setSpacing(50);
		
	
		//New Stage set
		Stage stge = new Stage();
		
		//Two integers with a Math.random() statement, in the range between 0-50
		int random = (int)(Math.random() * 50 + 1);
		int random1 = (int)(Math.random() * 50 + 1);
		
		//Integers j, i, k initialized
		int j = 0;
		int i = 1;
		int k = 0;
		
		//new while loop where if i<=random is true continue to loop through. This makes a factorial of random and sets it to j
		while(i <= random) {
			
			random1 = i*random1;
			
			j = random1;
			
			i++;
			
		}
		
		
		//new do-while loop that makes a factorial of random1 and sets it to k
		do {
			random = i*random;
			k = random;
			i++;
		} while(i <= random1);
		
		
		
		//New label that prints j and sets font and padding of the label
		Label label = new Label("" + j);
		label.setFont(Font.font ("Segoe UI", 24));
		label.setPadding(new Insets(20));
		
		//New label that prints k and sets font and padding of the label
		Label label1 = new Label("" + k);
		label1.setFont(Font.font ("Segoe UI", 24));
		label1.setPadding(new Insets(20));
		
		//Children of label and label1 added to the parent VBox along with padding and alignment
		box.getChildren().addAll(label, label1);
		box.setPadding(new Insets(20));
		box.setAlignment(Pos.CENTER);
		
		
		//New BorderPane
		BorderPane pane = new BorderPane();
		
		//Setting VBox parent to the center of the pane
		pane.setCenter(box);
		
		//New scene with parameters of pane, width and height
		Scene scene = new Scene(pane, 300,200);
		
		//Scene is set to stage
		stge.setScene(scene);
		//Shows stage
		stge.show();
		
		
		}
		
	}


