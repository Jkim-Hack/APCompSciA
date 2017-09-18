package SwedishChef;

import java.util.*;
import java.util.regex.*;

public class MainChef {

	public static void main(String[] args) {

		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toUpperCase();
		String bork = ". Bork Bork Bork!";
		String s = str.toUpperCase();
		// If only 4 characters and above added


		s = s.replaceAll("THE", "zee") 
				.replaceAll("AN", "un")
				.replaceAll("AU", "oo")
				.replaceAll("(A)(\\B)", "e")
				.replaceAll("OW", "oo")
				.replaceAll("O", "u")
				.replaceAll("IR", "ur")
				.replaceAll("TION", "shun");
				
		String[] strArray = s.split("\\W+");
		String newStr = strArray[0].replaceAll("(\\w+?)I(.*)", "$1ee$2");
		for(int i = 1; i < strArray.length; i++) {
			newStr = newStr + " " + strArray[i].replaceAll("(\\w+?)I(.*)", "$1ee$2");
		}
		
		newStr = newStr.replaceAll("EN(\\b)", "ee")
				.replaceAll("F", "ff")
				.replaceAll("E(\\b)", "e-a")
				.replaceAll("(\\B)U", "oo")
				.replaceAll("V", "f")
				.replaceAll("W", "v")
				.toUpperCase();

		System.out.println(newStr.toUpperCase() + bork.toUpperCase());
	}
}
