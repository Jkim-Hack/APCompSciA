package MainPackage;

import java.util.Scanner;

public class Sentinel {

	public int Sentinel() {
		
		int number = 0; 
		
		boolean L = true;
		char a;
		
		while (L) {
			
			System.out.println("Guess a number: ");
			Scanner scanner = new Scanner(System.in);
			
			
			number = scanner.nextInt();
			
			if(number == 1) {
				
				System.out.println(number + number);
				break;
			} else {
				
			}
			
		}
		
		return number + number;
		
		
	}
	
	
	
	
}
