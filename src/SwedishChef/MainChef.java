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

		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = null;
		String j = null;
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
			}
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("u")) {
					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("a")) {
						d = c.replace(a.substring(i - 2, i), "OO");
					}
				}
			}
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("a")) {
					d = c.replace(a.substring(i - 1, i), "E");
				}
			}
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("w")) {
					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("o")) {
						e = d.replace(a.substring(i - 2, i), "OO");
					}
				}
			}
			/*
			 * for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
			 * i)).equalsIgnoreCase("O")) {
			 * 
			 * c = b.replace(a.substring(i - 1, i), "U");
			 * 
			 * }
			 * 
			 * }
			 */
		}
		if (f == null) {
			if (e == null) {
				if (d == null) {
					if (c == null) {
						if (b == null) {
							return a;
						} else {
							return b;
						}
					} else {
						return c;
					}
				} else {
					return d;
				}
			} else {
				return e;
			}
		} else {
			return f;
		}
	}
}