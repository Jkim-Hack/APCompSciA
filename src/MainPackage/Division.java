package MainPackage;

/*
 * This class contains mathematical expressions
 */


public class Division extends NumberStore {

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public Division(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	//Makes a new display method for this class
	public double display() {
		
	//Mathematical expression of the division of two numbers
	   double num3 = num1/num2;
	    
	  //return result
	    return num3;
		
	}
	
	
}
