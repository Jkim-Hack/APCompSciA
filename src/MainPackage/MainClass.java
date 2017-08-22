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

	
//Sets the stage of the GUI
	
	@Override public void start(Stage primaryStage) {
		
	
	//Creates a vertical boxes along with its spacings
	VBox box = new VBox();
	VBox box1 = new VBox();
	box.setSpacing(10);
	box1.setSpacing(10);
	
	//A new label is created along with the label caption to insert a number
	Label lbl = new Label("Insert Number: ");
	
	
	//TextFields are created (this is where you can type whatever) this will be main inserts.
	TextField numb = new TextField("x");
	TextField numb1 = new TextField("y");
	
	
	
	
	//A new label to indicate everything in the textfields are saved
		Label save = new Label("Saved!");
	//Makes the label invisible for the time being
		save.setVisible(false);
	
	//Makes new label to ask what month number you were born in
	Label howOld = new Label("What month number were you born in?");
	
	//Makes new textbox for inserting month
	TextField age = new TextField("ex 11");
	
	//Makes new button to turn that number into the string value of that year.
	Button predict = new Button("Int to String");
	
	//Array of ints with months
	int[] months = {
			
			1,2,3,4,5,6,7,8,9,10,11,12
			
	};
	//On button press get integer from the age textbox
	predict.setOnAction((ActionEvent event) -> {
		
		int monthNum = toNumInt(age.getText());
	
	//If the inserted month number is in the array of integers start the switch statements 	
		
		if(monthNum == months[0] || monthNum == months[1] || monthNum == months[2] || monthNum == months[3] || monthNum == months[4] || 
				monthNum == months[5] || monthNum == months[6] || monthNum == months[7] || monthNum == months[8] || monthNum == months[9]
						|| monthNum == months[10] || monthNum == months[11]) {
		
		
		//Initialize the String type 'month'.	
		String month;
		
		//Makes a switch case with months with the inserted month number as what case the switch statements are looking for
		
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
		//displays month in string
		System.out.println(month);
		}
	
	
	//if the the number entered doesn't match any of the integers in the array it opens an alert box	
		else {
			
		//Makes a new Alert object from the Alert class	
			Alert alert = new Alert();
		
		//Displays the Alert Box with the method.	
			
			alert.AlertBox();
			
		}
		
	}); 
	
	//Makes a new Label that says "Choose Operation"
	Label boxLabel = new Label("Choose Operation:");
	
	//Creates a new ChoiceBox (or dropdown menu) with an arraylist as its parameters.
	ChoiceBox<NumberStore> operation = new ChoiceBox<NumberStore>();
	
	//Sets the width of the choicebox
	operation.setPrefWidth(150);
	
	//Disables the choicebox for now
	operation.setDisable(true);
	
	
	//Creates new button called Answer with the label "Answer..."
		Button Answer = new Button("Answer...");
		
		//Sets the Answer button to false making it disabled for the time being
		Answer.setDisable(true);
		
		
		//When the Answer button is pressed
		Answer.setOnAction((ActionEvent event) -> {
		
			
			//Makes a new Display object from the Display class and parameters the value of the selected operation from other classes
			Display display = new Display(operation.getValue());
			
			//Display method, displays a new stage and scene
			display.displayItems();
			
		});
		
	
	//Makes a new array of strings. (Strings because I wanted to implement a .equals method in the if statements)
	String[] s = {
		"a", "b","c","d","x","y"
	};
	
	//Button "apply" is created. The quotes inside the parenthesis is the button's label
	
	Button apply = new Button("Apply");
	
	
	//This sets and event for the button apply. Other ways to do buttons are (button).setOnAction((ActionEvent event) ->
	
	apply.addEventHandler(ActionEvent.ACTION , ActionEvent -> {
  
	//This sets if the the Textfield of numb equals any of the characters from the array of strings
		if(numb.getText().equals(s[0]) || numb.getText().equals(s[1]) || numb.getText().equals(s[2]) || numb.getText().equals(s[3]) 
				|| numb.getText().equals(s[4]) || numb.getText().equals(s[5])) {
		
			//This sets if the Textfield has a letter from the 3rd item in the array of strings it plays the method
			if(numb.getText().equals(s[2])) {
				
				//Makes a new LuckCounter class object from the LuckCounter class
				LuckCounter counter = new LuckCounter();
				
				//Method displays the lucky method from the LuckCounter class
				counter.Lucky();
				
			}
			//This sets if the Textfield has a letter from the 4th item in the array of strings it plays the method
			else if(numb.getText().equals(s[3])) {
				
				//New LuckCounter class object
				LuckCounter counter = new LuckCounter();
				
				//Displays the unlucky method from the LuckCounter class
				counter.UnLucky();
			}
			
			//If the entered string is neither one of the luck or unlucky numbers and is consistent with the first if statement, 
			//it just displays the AlertBox method
			else {
			
			//New Alert class object
			Alert error = new Alert();
			
			//AlertBox method from Alert class
			error.AlertBox();
			}
		
		}
		
		
		//This sets if the the Textfield of numb1 equals any of the characters from the array of strings
		if(numb1.getText().equals(s[0]) || numb1.getText().equals(s[1]) || numb1.getText().equals(s[2]) 
				|| numb1.getText().equals(s[3]) || numb.getText().equals(s[4]) || numb.getText().equals(s[5]) )
		{
			//This sets if the Textfield has a letter from the 1st item in the array of strings it plays the method
			if(numb1.getText().equals(s[0])) {
				
				//New LuckCounter class object
				LuckCounter counter = new LuckCounter();
				
				//Method displays the lucky method from the LuckCounter class
				counter.Lucky();
				
			}
			//This sets if the Textfield has a letter from the 4th item in the array of strings it plays the method
			else if(numb1.getText().equals(s[3])) {
				
				//New LuckCounter class object
				LuckCounter counter = new LuckCounter();
				
				//Method displays the lucky method from the LuckCounter class
				counter.UnLucky();
			}
			//If the entered string is neither one of the luck or unlucky numbers and is consistent with the first if statement, 
			//it just displays the AlertBox method
			else {
				
			//New Alert class object
			Alert error = new Alert();
			
			//AlertBox method from Alert class
			error.AlertBox();
			}
		}
		
		//If all of that is false and an actual number is inserted these stetments play
		else {
			
			//new Sentinel class object
			Sentinel sentinel = new Sentinel();
			
			//Sentinel class method
			sentinel.Sentinel();
			
			//Gets the text from the TextFields and parses them into doubles
				double num1 = toNumDouble(numb.getText());
				double num2 = toNumDouble(numb1.getText());
				
			//Makes a new ArrayList from the NumberStore class	
				List<NumberStore> list = new ArrayList<NumberStore>();
				
				//Adds classes Addition through Loop with its parameters in the list. 
				list.add(new Addition(num1, num2, "Add : x+y"));
				list.add(new Subtraction(num1, num2, "Subtract : x-y"));
				list.add(new Multiply(num1, num2, "Multiply : x*y"));
				list.add(new Division(num1, num2, "Divide : x/y"));
				list.add(new SinX(num1, num2, "Sine : (x)sin(y) (Degrees) "));
				list.add(new CosX(num1, num2, "Cosine : (x)cos(y) (Degrees) "));
				list.add(new Loop(num1,num2, "(Factorial of x) * y"));
				
				
				//This clears all items selected from the list
				operation.getItems().clear();
				
				//This adds all the Items from the list and adds it to the operation choicebox
				operation.getItems().addAll(list);
				
				//Enables operation choicebox
				operation.setDisable(false);
				
				//Enables Answer button
				Answer.setDisable(false);
				
				//Sets save label's visibility to true
				save.setVisible(true);
				
				//This plays a PausTransition class where after 5 seconds it makes the save label invisible again.
				PauseTransition visiblePause = new PauseTransition(
	         	        Duration.seconds(5)
	         	);
	         	visiblePause.setOnFinished(
	         	        event -> save.setVisible(false)
	         	);
	         	//Plays the above methods
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
	
	//Method to parse the String from the TextFields to a double
	public double toNumDouble(String num)
    {
    	double data = Double.parseDouble(num);
    	return data;
    }
	//Method to parse the String from the TextFields to a integer
	public int toNumInt(String num)
    {
    	int data = Integer.parseInt(num);
    	return data;
    }
}
