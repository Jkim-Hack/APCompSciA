package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String b = null;
		String bork = ". Bork Bork Bork!";

		// add same thing but have an if statement with just 2 characters.
		for (int i = 0; i <= s.length() - 3; i++) {
			String substr = s.substring(i, i + 3).toUpperCase();
			if (substr.matches("(.*)THE(.*)")) {
				s = s.replaceAll("THE", "ZEE");
			}
			if(substr.matches("(.*)AN(.*)")) {
				s = s.replaceAll("AN", "UN");
			}
		}
		System.out.println(s.toUpperCase() + bork.toUpperCase());
	}
}
