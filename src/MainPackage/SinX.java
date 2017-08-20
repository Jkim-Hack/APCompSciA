package MainPackage;

import java.lang.Math;

public class SinX extends NumberStore{

	public SinX(double num1, double num2, String Title) {
		super(num1, num2, Title);
		
	}

	public double display() {
		
		double num3 = num1 * Math.sin(num2);
	
		return num3;
		
	}
	
}
