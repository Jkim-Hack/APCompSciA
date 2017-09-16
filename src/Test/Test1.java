package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "AHAHAHA AHAHAHA."; 
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
		if((substr.matches("(.*)A(\\S)(.*)"))) {
				for (int j = 0; j < s.length(); j++) {
					
					if ((s.substring(j, j + 1)).equals("A") && !(s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
						s = s.substring(0, j) + 'E' + s.substring(j+1);
						
						}
					else if((s.substring(j, j + 1)).equals("A") && (s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
						s = s.substring(0, j) + 'A' + s.substring(j+1);
					}
		
				}
			}
	
		
		}
		System.out.println(s);
	
	}
}
