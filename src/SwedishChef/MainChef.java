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
//		a = scanner.nextLine().toUpperCase();
		a = "the an au a";
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
		

		for (int i = 0; i <= a.length() - 3 ; i++) {
		    String substr = a.substring(i, i + 3);
		    if (substr.matches("(.*)the(.*)")) { System.out.print(" ZEE"); }
		    else if(substr.matches("(.*)an(.*)")) {
		    	System.out.print(" UN");
		    }
		
		}
		
	}
}