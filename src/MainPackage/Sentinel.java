package MainPackage;


 /* 
  This class contains usage of ints, chars, booleans, sentinel while loops, if/else statement, nested for loops, 
  and string manipulation.
 */


import java.util.Scanner;

public class Sentinel {

	//New method called Sentinel
	public int Sentinel() {
		
		//Initialize integers 
		int number = 0; 
		int product = 0;
		
		//double percent promoted integer to double
		double percent = (double)(100);
		
		//Make boolean value L to true
		boolean L = true;
		
		//Initialize Char
		char a;
		
		//Sentinel while loop when L is true (SPOILER! It is)
		while (L) {
			
			//Print out "Guess a number: " and user enters a number.
			System.out.println("Guess a number: ");
			Scanner scanner = new Scanner(System.in);
			number = scanner.nextInt();
			
			//If number is equal to 4
			if(number == 4) {
				
				//Make char a equal 'A'
				a = 'A';
				
				//Print the number and the middle statement then the char then break
				System.out.println(number + " is the correct answer! you get an " + a);
				break;
				
			//If number does not equal to 4 the line appears and the while loop starts again
			} else {
				System.out.println("Nope, try again. Hint: 100-99");
			}
			
		}
		
		//Nested for loop, loops through the correct number entered and prints all the numbers before it. 
		
		for (int i = 1; i < number; i++) {
			
			System.out.println("The numbers before that are: " + i);
			
			//Second for loop: last number in the for loop above and multiplies it by the correct number
			//from the if statement
			
			for (int j = 1; j <= number; j++) {
				
				
				product = i*j;
				
			}
			
		}
		
		//Prints out the product.
		System.out.println("The product of the last number and " + number + " is: " + product);
		
		//Sets string to "Amazing" then prints out the string then prints out "I am Amazed 100%" with the usage of substring and promotion
		String string = "Amazing";
		System.out.println(string);
		System.out.println("I am " + string.substring(0, 4) + "ed " + percent + "%" );
		
		//returns an integer number + number
		return number + number;
		
		
	}
	
	
	
	
}
