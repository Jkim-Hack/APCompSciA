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
				String str = s.substring(i, i + 3);
			
				if (str.matches("(.*)the(.*)")||str.matches("(.*)The(.*)")||str.matches("(.*)THe(.*)")||str.matches("(.*)THE(.*)")) {
					s = s.replaceAll("the", "ZEE");
					
				} 
				else if (str.matches("(.*)an(.*)")||str.matches("(.*)An(.*)")||str.matches("(.*)AN(.*)")||str.matches("(.*)aN(.*)")) {
					s = s.replaceAll("an", "UN");
					
				} 
				else if (str.matches("(.*)au(.*)")||str.matches("(.*)Au(.*)")||str.matches("(.*)AU(.*)")||str.matches("(.*)aU(.*)")) {
					s = s.replaceAll("au", "OO");
					
				} 
			}
			System.out.print(s.toUpperCase() + bork.toUpperCase());
		
	}

}
