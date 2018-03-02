package SemTwoLab;

public class Chicken implements Animal{

	
	@Override
	public String makesound() {
		
		int k = (int)(Math.random()*100)+1;
		if(k%2==0) {
			return "bawk";
		} else {
			return "cluck";
		}
		
	}

	@Override
	public String getType() {
		
		return "chicken";
		
	}

	
	
	
}
