package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "FOLLOW ME.";
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
			if(substr.matches("(.*)E(.*)")) {
				for (int j = 0; j < s.length(); j++) {
					if ((s.substring(j, j + 1)).equals("E") && !(s.substring(j+1, j + 2).equals(" ")|| s.substring(j+1, j + 2).equals("."))) {
						s = s.substring(0, j) + "E" + s.substring(j+1);
						}
					else if((s.substring(j, j + 1)).equals("E") && (s.substring(j+1, j + 2).equals(" "))) {
						String l = s.substring(j+1);
						s = s.substring(0, j+1) + "  " + l;
						s = s.substring(0, j) + "E-A" + s.substring(j+3);
					}
					else if(s.substring(j, j + 1).equals("E") && s.substring(j+1, j + 2).equals(".")) {
						String l = s.substring(j+1);
						s = s.substring(0, j+1) + "  " + l;
						s = s.substring(0, j) + "E-A" + s.substring(j+3);
					}
				}
			}

	
		}
		System.out.println(s);
	
	}
}
