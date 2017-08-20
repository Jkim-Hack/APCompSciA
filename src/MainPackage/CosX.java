package MainPackage;

public class CosX extends NumberStore{

	public CosX(double num1, double num2, String Title) {
		super(num1, num2, Title);
		
	}

	public double display() {
		
		double num3 = num1 * Math.cos(num2);
	
		return num3;
		
	}
	
}