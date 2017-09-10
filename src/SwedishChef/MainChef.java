package SwedishChef;

import java.util.*;

public class MainChef {

	public static void main(String[] args) {

		String a;
		String b = null;
		String c = null;
		String the = "THE";
		String bork = " Bork Bork Bork";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		a = scanner.nextLine();
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

		}
		System.out.println(b);

	}

	public static String the(String a) {
		a = "ZEE";
		return a;

	}
}
