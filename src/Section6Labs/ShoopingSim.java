package Section6Labs;

import java.util.Scanner;

public class ShoopingSim {

	public static void main(String[] args) {
		
		//new shopping cart object
		ShoppingCart cart = new ShoppingCart();
		
		
		//loops through so that the program can continue
		while(true) {
			
			Scanner s = new Scanner(System.in);
			//collects data
			System.out.println("What is the name of your item?");
			String l = s.nextLine();
			System.out.println("Price?");
			double d = s.nextDouble();
			System.out.println("Amount?");
			int a = s.nextInt();
			
			//adds data to cart
			cart.addToCart(l, d, a);
			//prints data
			System.out.println(cart.toString());
			
			//asks to continue of no then the loop ends
			System.out.println("Continue? Yes/No");
			String c = s.next();
		
			if(c.equalsIgnoreCase("No")) {
				break;
			}
			
			
		}
		//prints final price
		System.out.println("Please pay " + cart.getTotalPrice());
		
		
		
	}
	
	
	
}
