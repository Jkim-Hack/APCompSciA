package Test;

public class Test2 {

	
	
	
	public static void main(String[] args) {
		
		int[] vals = new int[6];
		vals[0] = 3;
		vals[1] = 5;
		vals[2] = 4;
		vals[3] = 4;
		vals[4] = 4;
		vals[5] = 4;

		sumodd(vals);
				
	}
		
		
		
	
	
public static int sumodd (int[] vals) {
		
		int sum = 0;
		for (int i = 0; i <= vals.length - 1; i++) {
			if (vals[i] % 2 == 1) {
				
				sum += vals[i];
				
			}
			
		}
		System.out.println(sum);
		return sum;
				
	}
	
}
