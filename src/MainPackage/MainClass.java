package MainPackage;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override public void start(Stage primaryStage) {
		
	
	//Creates a vertical box along with its spacing
	VBox box = new VBox();
	box.setSpacing(10);
	
	//A new label is created along with the label caption
	Label lbl = new Label("Insert Number: ");
	
	
	//TextFields are created (this is where you can type whatever) this will be main inserts.
	TextField numb = new TextField();
	TextField numb1 = new TextField();
	
	
	String[] s = {
		"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
	};
	
	//Button "apply" is created. The quotes inside the parenthesis is the button's label
	Button apply = new Button("Apply");
	
	
	//this sets and event for the button apply. Other ways to do buttons are (button).setOnAction((ActionEvent event) ->
	
	apply.addEventHandler(ActionEvent.ACTION , ActionEvent -> {
  
		for(int i=0; i<= 25; i++) {
		if(numb.getText().equals(s[i])) {
		
			Alert error = new Alert();
			error.AlertBox();
		
			}
		else {
		//Gets the text from the TextFields and parses them into integers
				int	num1 = toNumInt(numb.getText());
				int num2 = toNumInt(numb1.getText());
				
				List<NumberStore> list = new ArrayList<NumberStore>();
				
				list.add(new Multiply(num1, num2));
			}
		}
		
		
	});
	
	
	
	//Creates new button called Answer
	Button Answer = new Button("Answer...");
	
	Answer.setOnAction(ActionEvent event -> {
	
	});
	
	//Creates a BorderPane (Scenes need some kind of pane like BorderPane, GridPane, AnchorPane and others.)
	BorderPane pane = new BorderPane();
	
	//Sets the BorderPane's left side with the VBox
	pane.setLeft(box);
	//Gets VBox's children like its buttons, texts, etc
	box.getChildren().addAll(lbl, numb, numb1, apply);
	//This sets the padding of each child in the box so that each child doesn't stick to the border of the scene. 
	box.setPadding(new Insets(20));
	
	//Creates a new scene or canvas with its parameters of a type of pane, width, height of the Scene
	Scene scene = new Scene(pane, 800, 800); 
	//Sets title of the stage
	primaryStage.setTitle("Main Open");
	//Stage adds the scene
    primaryStage.setScene(scene);
    //Stage is shown
    primaryStage.show();
	
	}
	
	//Main method to launch the stage
	public static void main(String[] args) {
		launch(args);
	}
	
	//Method to parse the String form the TextFields
	public int toNumInt(String num)
    {
    	int data = Integer.parseInt(num);
    	return data;
    }
	
}
