package MainPackage;

import java.util.Scanner;

public class Sentinel {

	public int Sentinel() {
		
		int number = 0; 
		int product = 0;
		
		
		boolean L = true;
		char a;
		
		while (L) {
			
			System.out.println("Guess a number: ");
			Scanner scanner = new Scanner(System.in);
			
			
			number = scanner.nextInt();
			
			if(number == 4) {
				
				a = 'A';
				
				System.out.println(number + " is the correct answer! you get an " + a);
				break;
				
			} else {
				System.out.println("Nope, try again. Hint: 100-99");
			}
			
		}
		
		for (int i = 1; i < number; i++) {
			
			System.out.println("The numbers before that are: " + i);
			
			for (int j = 1; j <= number; j++) {
				
				
				product = i*j;
				
			}
			
		}
		
		System.out.println("The product of the last number and " + number + " is: " + product);
		
		
		return number + number;
		
		
	}
	
	
	
	
}
