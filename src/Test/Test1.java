package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "AHAHAHAH AHAHAH"; 
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
		if((substr.matches("(.*)A(\\S)(.*)"))) {
			for(int space = s.indexOf(" "); space >= 0; space = s.indexOf(" ", space + 1)) {
				for (int j = 0; j <= s.length(); j++) {
					if ((s.substring(i, i + 1)).equals("A")) {
						if(i > 0) {
						s = s.substring(i, i+1) + 'E' + s.substring(i+2);
						}
						else {
							s = s.substring(0, i) + 'E' + s.substring(i+1);
						}
						
				} 
					else {
						s = s;
					}
				}
					//else if((substr.endsWith("A."))) {
						//s = s.replaceAll((substr.substring(substr.length()-2, substr.length()-1)), "a");
				//}
					//else if((substr.matches("(.*)A(\\S)(.*)"))) {
						// s = s.replaceAll("A", "E");
				//} 
			}
		}
	
		}
		System.out.println(s);
	}
	
	
}
