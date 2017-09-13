package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String b = null;
		
		for (int i = 0; i <= s.length() - 4 ; i++) {
		    String substr = s.substring(i, i + 4);
		    if (substr.matches("(.*)the(.*)")) { System.out.print(" ZEE");  
		    b = " ZEE";
		    }
		    else if(substr.matches("(.*)an(.*)")) {
		    	b = " UN";
		    }
		
		}
		System.out.println(b);
	}
/*
	public static String convert(String a) {

>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		String b = null;

		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4);
			if (substr.matches("(.*)the(.*)")) {
				System.out.print(" ZEE");
				b = " ZEE";
			} else if (substr.matches("(.*)an(.*)")) {
				b = " UN";
			}

		}
		System.out.println(b);
	}
	/*
	 * public static String convert(String a) {
	 * 
	 * >>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git String
	 * b = null; for (int i = 0; i <= s.length() - 3; i++) { String substr =
	 * s.substring(i, i + 3); if (substr.matches("(.*)the(.*)")) { a =
	 * s.replace(s.substring(i, i + 3), "ZEE"); System.out.println(a); } else if
	 * (substr.matches("(.*)an(.*)")) { b = a.replace(s.substring(i, i + 2), "UN");
	 * System.out.println(b); }
	 * 
	 * } } /* public static String convert(String a) {
	 * 
	 * String b = null; String c = null; String d = null; String e = null; String f
	 * = null; String g = null; String h = null; String j = null; int k = 1; int
	 * length = a.length(); int i = length;
	 * 
	 * if (a != null) { while(k < length) { for (i = length; i >= 1; i = i - 1) { if
	 * ((a.substring(i - k, i)).equalsIgnoreCase("e")) { k++; if ((a.substring(i -
	 * k, i - k)).equalsIgnoreCase("h")) { k++; if ((a.substring(i - k, i -
	 * k)).equalsIgnoreCase("t")) { k++; b = a.replace(a.substring(i - k, i),
	 * "ZEE"); } } } } return b; }
	 * 
	 * for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("n")) { if ((a.substring(i - 2, i -
	 * 1)).equalsIgnoreCase("a")) { c = b.replace(a.substring(i - 2, i), "UN"); } }
	 * }
	 * 
	 * 
	 * for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("u")) { if ((a.substring(i - 2, i -
	 * 1)).equalsIgnoreCase("a")) { d = c.replace(a.substring(i - 2, i), "OO"); } }
	 * } for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("a")) { d = c.replace(a.substring(i - 1, i), "E"); } }
	 * for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("w")) { if ((a.substring(i - 2, i -
	 * 1)).equalsIgnoreCase("o")) { e = d.replace(a.substring(i - 2, i), "OO"); } }
	 * }
	 * 
	 * for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("O")) {
	 * 
	 * f = e.replace(a.substring(i - 1, i), "U");
	 * 
	 * }
	 * 
	 * } for (i = length; i >= 1; i = i - 1) { if ((a.substring(i - 1,
	 * i)).equalsIgnoreCase("R")) { if ((a.substring(i - 2,
	 * i)).equalsIgnoreCase("I")) { g = f.replace(a.substring(i - 2, i), "UR"); } }
	 * 
	 * } if (j == null) { if (h == null) { if (g == null) { if (f == null) { if (e
	 * == null) { if (d == null) { if (c == null) { if (b == null) { return a; }
	 * else { return b; } } else { return c; } } else { return d; } } else { return
	 * e; } } else { return f; } } else { return g; } } else { return h; } } else {
	 * return j; }
	 * 
	 * } return b; }
	 */
}
