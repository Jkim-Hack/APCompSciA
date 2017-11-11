package Labs;

import java.util.Scanner;

public class BandBoosterDriver {

	
	public static void main(String[] args) {
		System.out.println("Enter first name: ");
		Scanner s = new Scanner(System.in);
		String firstName = s.nextLine();
		System.out.println("Second name: ");
		String secondName = s.nextLine();
		
		BandBooster first = new BandBooster(firstName);
		BandBooster second = new BandBooster(secondName);
		
		System.out.println("Enter the number of boxes " + first.getName() + " sold: ");
		int sold1 = s.nextInt();
		System.out.println("Enter the number of boxes " + second.getName() + " sold: ");
		int sold2 = s.nextInt();
		
		first.updateSales(sold1);
		second.updateSales(sold2);
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		
	}
	
	
}
