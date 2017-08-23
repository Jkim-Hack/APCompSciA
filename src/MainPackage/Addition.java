package MainPackage;

/*
 * This class contains mathematical expressions of addition.
 */


public class Addition extends NumberStore {

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public Addition(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	//Makes a new display method for this class
	public double display() {
		
	//mathematical expression addition of two numbers
	   double num3 = num1+num2;
	    
	   //returns result
	    return num3;
		
	}
	
	
}
