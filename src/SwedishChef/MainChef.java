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
		System.out.println(the(a) + an(a) + bork.toUpperCase());

	}


		
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = null;
		String j = null;
		
	public static String the(String a) {	
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
			
		}
		return b;
		}
		
	public static String an(String a) {
		
		String b = null;
		int length = a.length();
		int i = length;
		
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("n")) {
					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("a")) {
						b = a.replace(a.substring(i - 2, i), "UN");
					}
				}
			}
		
	
		return b;	
			
	}
	
	public static String au(String a) {
	
		String b = null;
		int length = a.length();
		int i = length;
		
			for (i = length; i >= 1; i = i - 1) {
				if ((a.substring(i - 1, i)).equalsIgnoreCase("u")) {
					if ((a.substring(i - 2, i - 1)).equalsIgnoreCase("a")) {
						b = a.replace(a.substring(i - 2, i), "OO");
					}
				}
			}
			
			
			return b;
			
	}	
		
/*	
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
			
			  for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
			  i)).equalsIgnoreCase("O")) {
			  
			  c = b.replace(a.substring(i - 1, i), "U");
			  
			  }
			  
			  }
			 
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
	*/
}
