package Section6Labs;

import java.util.Scanner;

public class ShoopingSim {

	public static void main(String[] args) {
		
		
		ShoppingCart cart = new ShoppingCart();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("What is the name of your item?");
			String l = s.nextLine();
			System.out.println("Price?");
			double d = s.nextDouble();
			System.out.println("Amount?");
			int a = s.nextInt();
			
			cart.addToCart(l, d, a);
			System.out.println(cart.toString());
			
			System.out.println("Continue? Yes/No");
			String c = s.next();
		
			if(c.equalsIgnoreCase("No")) {
				break;
			}
			
			
		}
		System.out.println("Please pay " + cart.getTotalPrice());
		
		
		
	}
	
	
	
}
