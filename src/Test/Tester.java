package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		String s = "ENWHE WHEE WHE.";
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
			if(substr.matches("(.*)E(.*)")) {
				for (int j = 0; j < s.length()-1; j++) {
					boolean l = s.substring(j+1, j + 2).equals(".");
					System.out.println(l);
				}
			}

	
		}
		System.out.println(s);
	
	}
}
