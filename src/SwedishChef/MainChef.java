package SwedishChef;

import java.util.*;
import java.util.regex.*;

public class MainChef {

	public static void main(String[] args) {

		//asks to input something
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		//sets variables
		String str = scanner.nextLine().toUpperCase();
		String bork = " Bork Bork Bork!";
		String s = str.toUpperCase();
	

		//replaces everything that needs to be changed
		s = s.replaceAll("THE", "zee") 
				.replaceAll("AN", "un")
				.replaceAll("AU", "oo")
				.replaceAll("(A)(\\B)", "e")
				.replaceAll("OW", "oo")
				.replaceAll("O", "u")
				.replaceAll("IR", "ur")
				.replaceAll("TION", "shun");
		
		//new array to split words so that I can only be changed in one word.
		String[] strArray = s.split("\\W+");
		String newStr = strArray[0].replaceAll("(\\w+?)I(.*)", "$1ee$2");
		//loops through the string.
		for(int i = 1; i < strArray.length; i++) {
			newStr = newStr + " " + strArray[i].replaceAll("(\\w+?)I(.*)", "$1ee$2");
		}
		
		//replaces the rest.
		newStr = newStr.replaceAll("EN(\\b)", "ee")
				.replaceAll("F", "ff")
				.replaceAll("E(\\b)", "e-a")
				.replaceAll("(\\B)U", "oo")
				.replaceAll("V", "f")
				.replaceAll("W", "v")
				.toUpperCase();
		
		//if there is no period add one, else, just print.
		if(!(newStr.matches("(.*)(\\.)"))) {
			System.out.println(newStr.toUpperCase() + "." + bork.toUpperCase());
		}
		else {
			System.out.println(newStr.toUpperCase() + bork.toUpperCase());
		}
	}
}
