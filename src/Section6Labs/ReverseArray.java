package Section6Labs;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		//scanner class called
		Scanner scan = new Scanner(System.in);
		
		//enters the amount of integers in the array
		System.out.println("Enter integer: ");
		int y = scan.nextInt();

		int[] vals = new int[y];
		
		//enters values to be added to the array.
		System.out.println("Enter " + y + " values: ");
		for (int i = 0; i < vals.length; i++) {

			vals[i] = scan.nextInt();

		}
		//prints array
		for (int o : vals) {
			System.out.print(o + " ");
		}

		System.out.println("\nReversed: ");

		int k = vals.length - 1;

		for (int j = 0; j < (vals.length / 2); j++, k--) {
			
			//the array's values are being stored in a temporary value. able to go backwards 
			//because of the k-- in the for loop.
			
			//basically lines 38-39 are storing values backwards then fowards hence reversing the array
			int temp = vals[k];
			vals[k] = vals[j];
			vals[j] = temp;

		}
		//prints the reversed array
		for (int o : vals) {
			System.out.print(o + " ");
		}

	}

}
