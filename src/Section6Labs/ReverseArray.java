package Section6Labs;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter integer: ");
		int y = scan.nextInt();
		
		int[] vals = new int[y];
		
		System.out.println("Enter " + y + " values: ");
		for(int i = 0; i < vals.length; i++) {
			
			vals[i] = scan.nextInt();
			
			
		}
		
		for(int o : vals) {
			System.out.print(o + " ");
		}
		
		System.out.println("\nReversed: ");
		
		int k = vals.length-1;
		
		for(int j = 0; j<(vals.length/2); j++, k--) {
			
		int temp = vals[k];
		vals[k] = vals[j];
		vals[j] = temp;
		
		
			
			
		}
		
		for(int o : vals) {
			System.out.print(o + " ");
		}
		
		
		
		
	}
	

}
