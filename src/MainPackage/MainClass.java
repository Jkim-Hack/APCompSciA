package MainPackage;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.PauseTransition;
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
import javafx.util.Duration;

public class MainClass extends Application {

	@Override public void start(Stage primaryStage) {
		
	
	//Creates a vertical boxes along with its spacings
	VBox box = new VBox();
	VBox box1 = new VBox();
	box.setSpacing(10);
	box1.setSpacing(10);
	
	//A new label is created along with the label caption
	Label lbl = new Label("Insert Number: ");
	
	Label save = new Label("Saved!");
	
	save.setVisible(false);
	
	//TextFields are created (this is where you can type whatever) this will be main inserts.
	TextField numb = new TextField("x");
	TextField numb1 = new TextField("y");
	
	
	Label howOld = new Label("What month number were you born in?");
	TextField age = new TextField("ex 11");
	Button predict = new Button("Int to String");
	
	int[] months = {
			
			1,2,3,4,5,6,7,8,9,10,11,12
			
	};
	
	predict.setOnAction((ActionEvent event) -> {
		
		int monthNum = toNumInt(age.getText());
	
		if(monthNum == months[0] || monthNum == months[1] || monthNum == months[2] || monthNum == months[3] || monthNum == months[4] || 
				monthNum == months[5] || monthNum == months[6] || monthNum == months[7] || monthNum == months[8] || monthNum == months[9]
						|| monthNum == months[10] || monthNum == months[11]) {
		
		String month;
		switch(monthNum) {
		
		case 1:  month = "January";
        break;
		case 2:  month = "February";
        break;
		case 3:  month = "March";
        break;
		case 4:  month = "April";
        break;
		case 5:  month = "May";
        break;
		case 6:  month = "June";
        break;
		case 7:  month = "July";
        break;
		case 8:  month = "August";
        break;
		case 9:  month = "September";
        break;
		case 10: month = "October";
        break;
		case 11: month = "November";
        break;
		case 12: month = "December";
        break;
		default: month = "Invalid month";
        break;
		
		
		}
		
		System.out.println(month);
		}
		
		else {
			
			Alert alert = new Alert();
			alert.AlertBox();
			
		}
		
	}); 
	
	
	Label boxLabel = new Label("Choose Operation:");
	ChoiceBox<NumberStore> operation = new ChoiceBox<NumberStore>();
	operation.setPrefWidth(150);
	operation.setDisable(true);
	
	
	//Creates new button called Answer
		Button Answer = new Button("Answer...");
		
		Answer.setOnAction((ActionEvent event) -> {
		
			Display display = new Display(operation.getValue());
			
			display.displayItems();
			
		});
		
	Answer.setDisable(true);
	
	String[] s = {
		"a", "b","c","d","x","y"
	};
	
	//Button "apply" is created. The quotes inside the parenthesis is the button's label
	
	Button apply = new Button("Apply");
	
	
	//this sets and event for the button apply. Other ways to do buttons are (button).setOnAction((ActionEvent event) ->
	
	apply.addEventHandler(ActionEvent.ACTION , ActionEvent -> {
  
		
		if(numb.getText().equals(s[0]) || numb.getText().equals(s[1]) || numb.getText().equals(s[2]) || numb.getText().equals(s[3]) 
				|| numb.getText().equals(s[4]) || numb.getText().equals(s[5])) {
		
			if(numb.getText().equals(s[2])) {
				LuckCounter counter = new LuckCounter();
				counter.Lucky();
				
			}
			else if(numb.getText().equals(s[3])) {
				LuckCounter counter = new LuckCounter();
				counter.UnLucky();
			}
			else {
			
			Alert error = new Alert();
			error.AlertBox();
			}
		
		}
		if(numb1.getText().equals(s[0]) || numb1.getText().equals(s[1]) || numb1.getText().equals(s[2]) 
				|| numb1.getText().equals(s[3]) || numb.getText().equals(s[4]) || numb.getText().equals(s[5]) )
		{
			
			if(numb1.getText().equals(s[0])) {
				LuckCounter counter = new LuckCounter();
				counter.Lucky();
				
			}
			else if(numb1.getText().equals(s[3])) {
				LuckCounter counter = new LuckCounter();
				counter.UnLucky();
			}
			else {
			Alert error = new Alert();
			error.AlertBox();
			}
		}
		else {
			//Gets the text from the TextFields and parses them into ints/doubles
				double num1 = toNumDouble(numb.getText());
				double num2 = toNumDouble(numb1.getText());
				
				List<NumberStore> list = new ArrayList<NumberStore>();
				
				list.add(new Addition(num1, num2, "Add : x+y"));
				list.add(new Subtraction(num1, num2, "Subtract : x-y"));
				list.add(new Multiply(num1, num2, "Multiply : x*y"));
				list.add(new Division(num1, num2, "Divide : x/y"));
				list.add(new SinX(num1, num2, "Sine : (x)sin(y) (Degrees) "));
				list.add(new CosX(num1, num2, "Cosine : (x)cos(y) (Degrees) "));
				list.add(new Loop(num1,num2, "(Factorial of x) * y"));
				
				operation.getItems().clear();
				operation.getItems().addAll(list);
				
				operation.setDisable(false);
				Answer.setDisable(false);
				
				save.setVisible(true);
				
				PauseTransition visiblePause = new PauseTransition(
	         	        Duration.seconds(5)
	         	);
	         	visiblePause.setOnFinished(
	         	        event -> save.setVisible(false)
	         	);
	         	visiblePause.play();
				
			}
		
		
	});
	
	
	
	
	
	
	
	//Creates a BorderPane (Scenes need some kind of pane like BorderPane, GridPane, AnchorPane and others.)
	BorderPane pane = new BorderPane();
	//Sets the BorderPane's left side with the VBox
	pane.setLeft(box);
	//Sets right side
	pane.setRight(box1);
	//Gets VBoxs' children like its buttons, texts, etc
	box.getChildren().addAll(howOld, age, predict, lbl, numb, numb1, apply, save);
	box1.getChildren().addAll(boxLabel, operation, Answer);
	//This sets the padding of each child in the boxes so that each children doesn't stick to the border of the scene. 
	box.setPadding(new Insets(20));
	box1.setPadding(new Insets(20));
	//Creates a new scene or canvas with its parameters of a type of pane, width, height of the Scene
	Scene scene = new Scene(pane, 460, 280); 
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
	public int toNumInt(String num)
    {
    	int data = Integer.parseInt(num);
    	return data;
    }
}
