package SwedishChef;

import java.util.*;

public class MainChef {

	public static void main(String[] args) {

		String a;
		String c = null;
		String the = "THE";
		String bork = ". Bork Bork Bork!";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		a = scanner.nextLine().toUpperCase();

		System.out.println(convert(a) + bork.toUpperCase());

	}

	public static String convert(String a) {

		String c = null;
		String b = null;
		int length = a.length();
		int i = length;
		

		if (a != null) {
			for (i = length; i >= 1; i = i - 1) {

				if ((a.substring(i - 1, i)).equalsIgnoreCase("e")) {

					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("h")) {

						if ((a.substring(i - 3, i - 2)).equalsIgnoreCase("t")) {
							b = a.replace(a.substring(i - 3, i), "ZEE");

						}
					}

				}
			}
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("n")) {

					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("a")) {
						c = b.replace(a.substring(i - 2, i), "UN");
					}

				}
				else if ((a.substring(i - 1, i)).equalsIgnoreCase("a")) {
					c = b.replace(a.substring(i - 1, i), "A");
				}
			}

			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("u")) {

					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("a")) {
						c = b.replace(a.substring(i - 2, i), "OO");

					}

				}

			}
		//Replace all occurances of A and E later
			
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("w")) {

					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("o")) {
						c = b.replace(a.substring(i - 2, i), "OO");

					}

				}

			}
		/*	
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("O")) {
 
						c = b.replace(a.substring(i - 1, i), "U");

					}

				}
*/
			}
			
		
		return c;
	}

}
