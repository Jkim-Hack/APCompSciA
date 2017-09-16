package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "U HAUHUA U."; 
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
			if(substr.matches("(.*)U(\\S)(.*)")) {
				for (int j = 0; j < s.length()-2; j++) {
					  if (s.substring(j, j+1).equals(" ") || s.substring(j, j+1).matches("U")) {
						  if((s.substring(j+1, j+2).equals("U"))) {
								s = s.substring(0, j+1) + "U" + s.substring(j+2);
							}
						  else if(s.substring(0, j+1).matches("U")){
							  s = s.substring(0, 0) + "U" + s.substring(j+1);
						  }
						  else if((s.substring(j, j + 1)).equals("U")) {
								String l = s.substring(j+1);
								s = s.substring(0, j+1) + " " + l;
								s = s.substring(0, j) + "OO" + s.substring(j+2);
							}
						}
					
				
				}
			}
	
		}
		System.out.println(s);
	
	}
	public static void run(String a) {
		
	}
}
