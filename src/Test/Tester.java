package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String b = null;
		String bork = ". Bork Bork Bork!";

		// add same thing but have an if statement with just 2 characters.
		for (int i = 0; i <= s.length() - 3; i++) {
			String substr = s.substring(i, i + 3).toUpperCase();
			if (s.length() == 1) {
				if (substr.matches("(.*)A(.*)")) {
					if (substr.indexOf("A") != substr.length() - 1) {
						s = s.replaceAll("A", "E");
					} else if (substr.matches("(.*)O(.*)")) {
						s = s.replaceAll("O", "U");
						if (s.length() == 2) {
							if (substr.matches("(.*)AN(.*)")) {
								s = s.replaceAll("AN", "UN");
							} else if (substr.matches("(.*)AU(.*)")) {
								s = s.replaceAll("AU", "OO");
							} else if (substr.matches("(.*)OW(.*)")) {
								s = s.replaceAll("OW", "OO");
							} else if (substr.matches("(.*)IR(.*)")) {
								s = s.replaceAll("IR", "UR");
							} else if (substr.matches("(.*)O(.*)")) {
								s = s.replaceAll("O", "U");
							}

						} else if (s.length() == 3) {

						} else if (s.length() == 4) {

						}
					}

					// if (substr.matches("(.*)THE(.*)")) {
					// s = s.replaceAll("THE", "ZEE");
					//
					// }
					// }
					// }
					// }
					// }
					// }
					// } else if (substr.matches("(.*)TION(.*)")) {
					// s = s.replaceAll("TION", "SHUN");
					// } else if (substr.matches("(.*)OW(.*)")) {
					// s = s.replaceAll("OW", "OO");
					// } else if (substr.matches("(.*)OW(.*)")) {
					// s = s.replaceAll("OW", "OO");
					// } else if (substr.matches("(.*)OW(.*)")) {
					// s = s.replaceAll("OW", "OO");
					// } else if (substr.matches("(.*)OW(.*)")) {
					// s = s.replaceAll("OW", "OO");
					// } else if (substr.matches("(.*)OW(.*)")) {
					// s = s.replaceAll("OW", "OO");
					// } }
					// }
					// System.out.print(s.toUpperCase() + bork.toUpperCase());
					//
					// }

				}
			}
		}
	}
}
