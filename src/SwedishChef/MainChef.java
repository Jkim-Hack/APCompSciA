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
	a = scanner.next();
	
	 if (a != null) {
		if((a.substring(0, 3)).equalsIgnoreCase(the)) {
			b = a.substring(0, 3);
		
			the(b);
		
		}
		if(a.substring(3,6).equalsIgnoreCase(the)) {
			c = a.substring(3,6);
			
			the(c);
			
		}
		
		System.out.println(b + c);
	}
	
		
	}
	
	public static String the(String a) {
		a = "ZEE";
		return a;
		
		
	}
		
	}
	
	
	

