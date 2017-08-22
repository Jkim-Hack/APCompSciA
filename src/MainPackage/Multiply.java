package MainPackage;

public class Multiply extends NumberStore {

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public Multiply(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	//Makes a new display method for this class
	public double display() {
		
	//Mathmatical expression of multiplication of two numbers
	   double num3 = num1*num2;
	    
	   //Returns result
	    return num3;
		
	}
	
	
}
