package MainPackage;

public class Loop extends NumberStore{
	
	//gets the format from NumberStore and gets all the values from the insert Textfields from the main class
	public Loop(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	//Makes a new display method for this class
	public double display() {
		
		//initialize result
		double num3 = 0;
		
		//Loop through to get a factorial of the first number, then multiply by the second number
		for(double i = 1; i<=num1; i++) {
			
			num2 = i * num2;	
			num3 = num2;
			
			
			
			//prints result
			System.out.println(num3);
		}
		
		
		//return result
		return num3;
		
	}
	
	
}
