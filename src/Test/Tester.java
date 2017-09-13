package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String b = null;
		String bork = ". Bork Bork Bork!";

		//add same thing but have an if statement with just 2 characters.
		
			for (int i = 0; i <= s.length() - 3; i++) {
				String substr = s.substring(i, i + 3);
			
				if (substr.matches("(.*)the(.*)")||substr.matches("(.*)The(.*)")||substr.matches("(.*)THe(.*)")||substr.matches("(.*)THE(.*)")) {
					s = s.replaceAll("the", "ZEE");
					
				} 
				else if (substr.matches("(.*)an(.*)")||substr.matches("(.*)An(.*)")||substr.matches("(.*)AN(.*)")||substr.matches("(.*)aN(.*)")) {
					s = s.replaceAll("an", "UN");
					
				} 
			}
			System.out.print(s.toUpperCase() + bork.toUpperCase());
		
	}

}
