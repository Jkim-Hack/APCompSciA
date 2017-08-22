package MainPackage;

public class Loop extends NumberStore{

	public Loop(double num1, double num2, String Title) {
		super(num1, num2, Title);
	}
	
	public double display() {
		
		double num3 = 0;
		
		for(double i = 1; i<=num1; i++) {
			
			num2 = i * num2;	
			num3 = num2;
			
			
			
			
			System.out.println(num3);
		}
		
		
		
		return num3;
		
	}
	
	
}
