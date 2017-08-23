package MainPackage;


/*
 * This class implements Math class methods and mathematical expressions
 */


public class CosX extends NumberStore{

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public CosX(double num1, double num2, String Title) {
		super(num1, num2, Title);
		
	}

	
	//Makes a new display method for this class
	public double display() {
		
		//mathmatical expression first number times the cos(second number)
		double num3 = num1 * Math.cos(num2);
	
		//return result
		return num3;
		
	}
	
}