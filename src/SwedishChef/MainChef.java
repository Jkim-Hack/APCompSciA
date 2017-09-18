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
				.replaceAll("TION", "shun")
				.replaceFirst("(\\B)I", "ee")
				.replaceAll("EN(\\b)", "ee")
				.replaceAll("F", "ff")
				.replaceAll("E(\\b)", "e-a")
				.replaceAll("(\\B)U", "oo")
				.replaceAll("V", "f")
				.replaceAll("W", "v")
				.toUpperCase();

		System.out.println(s.toUpperCase() + bork.toUpperCase());
	}
}
