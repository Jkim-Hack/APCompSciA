package MainPackage;

import java.lang.Math;

public class SinX extends NumberStore{

	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public SinX(double num1, double num2, String Title) {
		super(num1, num2, Title);
		
	}

	//Makes a new display method for this class
	public double display() {
		
		//mathmatical expression first number times the sin(second number)
		double num3 = num1 * Math.sin(num2);
	
		//return result
		return num3;
		
	}
	
}
