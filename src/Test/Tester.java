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

}
