package MainPackage;

public class NumberStore {

	protected double num;
	protected double num1;
	protected String Title;
	
	public NumberStore(double num1, double num2, String Title) {
		this.num = num1;
		this.num1 = num2;
		this.Title = Title;
	}


	public double display() {
		
		double num3 = 0;
		
		return num3;
		
	}
	
	public double getNum1() {
		return num1;
	}


	public void setNum(double num1) {
		this.num1 = num1;
	}


	public double getNum2() {
		return num1;
	}


	public void setNum2(double num2) {
		this.num1 = num2;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}
	
	@Override
	public String toString()
	{
		return Title;
	}
	
	
	
}
