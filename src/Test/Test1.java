package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "F HH F IM FAG."; 
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
			if(substr.matches("(.*)F(.*)")) {
				for (int j = 0; j < s.length()-2; j++) {
					if((s.substring(j, j + 1)).matches("(.*)F(.*)")) {
						String l = s.substring(j+1);
						s = s.substring(0, j+1) + " " + l;
						s = s.substring(0, j) + "ff" + s.substring(j+2);
					}
				}
			}
	
		}
		System.out.println(s);
	
	}
	public static void run(String a) {
		
	}
}
