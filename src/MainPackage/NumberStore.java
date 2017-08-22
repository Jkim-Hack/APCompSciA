package MainPackage;

public class NumberStore {

	
	//Initializes doubles and strings
	protected double num1;
	protected double num2;
	protected String Title;
	
	//Makes a NumberStore method that all other operation classes must follow its parameters.
	public NumberStore(double num1, double num2, String Title) {
		
	//Able to use this in each class
		this.num1 = num1;
		this.num2 = num2;
		this.Title = Title;
	}

	
//Display method for all operations that inherit from NumberStore
	
	public double display() {
		
		//Initializes
		double num3 = 0;
		
		//Returns result
		return num3;
		
	}
	
	//Getters and setters for num1, num2, and Title
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
	
	//Needed to be able to show the title of each operation in the ChoiceBox from the MainClass class
	@Override
	public String toString()
	{
		return Title;
	}
	
	
	
}
