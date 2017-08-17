package MainPackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override public void start(Stage primaryStage) {
		
	
	
	VBox box = new VBox();
	box.setSpacing(10);
	
	
	Label lbl = new Label("Insert Number: ");
	
	TextField numb = new TextField();
	TextField numb1 = new TextField();
	
	Button apply = new Button("Apply");
	
	apply.addEventHandler(ActionEvent.ACTION , ActionEvent -> {
   
		
	
		
		
		int	num1 = toNumInt(numb.getText());
		int num2 = toNumInt(numb1.getText());
		
		
	});
	
	
	
	
	Button Answer = new Button("Answer...");
	
	
	BorderPane pane = new BorderPane();
	
	pane.setLeft(box);
	box.getChildren().addAll(lbl, numb, numb1);
	
	Scene scene = new Scene(pane, 800, 800); 
	primaryStage.setTitle("Main Open");
    primaryStage.setScene(scene);
    primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public int toNumInt(String num)
    {
    	int data = Integer.parseInt(num);
    	return data;
    }
	
}
