package MainPackage;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override public void start(Stage primaryStage) {
		
	
	//Creates a vertical boxes along with its spacings
	VBox box = new VBox();
	VBox box1 = new VBox();
	box.setSpacing(10);
	box1.setSpacing(10);
	
	//A new label is created along with the label caption
	Label lbl = new Label("Insert Number: ");
	
	
	//TextFields are created (this is where you can type whatever) this will be main inserts.
	TextField numb = new TextField();
	TextField numb1 = new TextField();
	
	Label boxLabel = new Label("Choose Operation");
	ChoiceBox<NumberStore> operation = new ChoiceBox<NumberStore>();
	operation.setPrefWidth(150);
	
	
	String[] s = {
		"a", "b","c","d"
	};
	
	//Button "apply" is created. The quotes inside the parenthesis is the button's label
	
	Button apply = new Button("Apply");
	
	
	//this sets and event for the button apply. Other ways to do buttons are (button).setOnAction((ActionEvent event) ->
	
	apply.addEventHandler(ActionEvent.ACTION , ActionEvent -> {
  
		
		if(numb.getText().equals(s[0]) || numb.getText().equals(s[1]) || numb.getText().equals(s[2]) || numb.getText().equals(s[3])) {
		
			Alert error = new Alert();
			error.AlertBox();
		
		}
		else if(numb1.getText().equals(s[0]) || numb1.getText().equals(s[1]) || numb1.getText().equals(s[2]) || numb1.getText().equals(s[3]) )
		{
			
			Alert error = new Alert();
			error.AlertBox();
			
		}
		else {
		//Gets the text from the TextFields and parses them into integers
				double num1 = toNumDouble(numb.getText());
				double num2 = toNumDouble(numb1.getText());
				
				List<NumberStore> list = new ArrayList<NumberStore>();
				
				list.add(new Multiply(num1, num2, "Multiply"));
				
				operation.getItems().clear();
				operation.getItems().addAll(list);
				
			}
		
		
		
	});
	
	
	
	//Creates new button called Answer
	Button Answer = new Button("Answer...");
	
	Answer.setOnAction((ActionEvent event) -> {
	
		Display display = new Display(operation.getValue());
		
		display.displayItems();
		
	});
	
	//Creates a BorderPane (Scenes need some kind of pane like BorderPane, GridPane, AnchorPane and others.)
	BorderPane pane = new BorderPane();
	
	//Sets the BorderPane's left side with the VBox
	pane.setLeft(box);
	//Sets right side
	pane.setRight(box1);
	//Gets VBoxs' children like its buttons, texts, etc
	box.getChildren().addAll(lbl, numb, numb1, apply);
	box1.getChildren().addAll(boxLabel, operation, Answer);
	//This sets the padding of each child in the boxes so that each children doesn't stick to the border of the scene. 
	box.setPadding(new Insets(20));
	box1.setPadding(new Insets(20));
	//Creates a new scene or canvas with its parameters of a type of pane, width, height of the Scene
	Scene scene = new Scene(pane, 500, 500); 
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
	public double toNumDouble(String num)
    {
    	double data = Double.parseDouble(num);
    	return data;
    }
	
}
