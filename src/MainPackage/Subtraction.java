package MainPackage;

/*
 * This class contains a mathematical expression.
 */


public class Subtraction extends NumberStore {

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public Subtraction(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	//Makes a new display method for this class
	public double display() {
		
	//Mathematical expression of subtraction of two numbers
	   double num3 = num1-num2;
	
	   //Return result
	    return num3;
		
	}
	
	
}
