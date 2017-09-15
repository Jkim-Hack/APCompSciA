package Test;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String bork = " Bork Bork Bork!";

		//If only one character added
		if (s.length() == 1) {
			for (int i = 0; i <= s.length() - 1; i++) {
				String substr = s.substring(i, i + 1).toUpperCase();
				
				//Work on this one vvvv
				/*
				if(substr.matches("(.*)A(.*)")) {
					s = s.replaceAll("A", "E");
				}
				*/
				
				/*Work on this vvv
				if(substr.matches("(.*)O(.*)")) {
					s = s.replace('O', 'U');
				}
				*/
				//These cannot go from one letter string into two
				/*
				if(substr.matches("(.*)F(.*)")) {
					s = s.replaceAll("F", "FF");
				}
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replaceAll("V", "FF");
				}
				*/
				//except this one
				if(substr.matches("(.*)W(.*)")) {
					s = s.replace('W', 'V');
				}
			}
		}
		//If only 2 characters added
		else if (s.length() == 2) {
			for (int i = 0; i <= s.length() - 2; i++) {
				String substr = s.substring(i, i + 2).toUpperCase();
				//if the established substring has an AN anywhere
				if(substr.matches("(.*)AN(.*)")) {
					//replaces all occurences of AN to UN
					s = s.replaceAll("AN", "UN");
				}
				else if(substr.matches("(.*)AU(.*)")) {
					s = s.replaceAll("AU", "OO");
				}
				//Work on this one vvvv
			/*
				else if(substr.matches("(.*)A(.*)")) {
					s = s.replaceAll("A", "E");
				}
			*/
				else if(substr.matches("(.*)OW(.*)")) {
					s = s.replaceAll("OW", "OO");
				}
				
				if(substr.matches("(.*)O(.*)")) {
					s = s.replace('O', 'U');
				}
				
				else if(substr.matches("(.*)IR(.*)")) {
				//replacing all IR with UR
					s = s.replaceAll("IR", "UR");
				}
				
				else if(substr.matches("(.*)EN(.*)")) {
				//replacing all EN with EE
					s = s.replaceAll("EN", "EE");
				}
				/*
				else if(substr.matches("(.*)F(.*)")) {
					s = s.replaceAll("F", "FF");
				}
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replaceAll("V", "FF");
				}
				*/
				else if(substr.matches("(.*)W(.*)")) {
				//replacing all W with V
					s = s.replace('W', 'V');
				}
			}
		}
	//If only 3 characters added
	else if (s.length() == 3) {
		for (int i = 0; i <= s.length() - 3; i++) {
			String substr = s.substring(i, i + 3).toUpperCase();
		
			
			if (substr.matches("(.*)THE(.*)")) {
				s = s.replaceAll("THE", "ZEE");
			}
			else if(substr.matches("(.*)AN(.*)")) {
				s = s.replaceAll("AN", "UN");
			}
			else if(substr.matches("(.*)AU(.*)")) {
				s = s.replaceAll("AU", "OO");
			}
			
			//int p = substr.indexOf('A');
			/*
			else if(substr.matches("(.*)A(\\S)(.*)")) {
				s = s.replace('A', 'E');
			}
			*/
			else if(substr.matches("(.*)OW(.*)")) {
			//replace all OW with OO
				s = s.replaceAll("OW", "OO");
			}
			
			if(substr.matches("(.*)O(.*)")) {
			//replacing all O with U 
				s = s.replace('O', 'U');
			}
			
			else if(substr.matches("(.*)IR(.*)")) {
			//replacing all IR with UR
				s = s.replaceAll("IR", "UR");
			}
			/*
			else if(substr.matches("(.*)F(.*)")) {
				s = s.replaceAll("F", "FF");
			}
			else if(substr.matches("(.*)V(.*)")) {
				s = s.replaceAll("V", "FF");
			}
			*/
			else if(substr.matches("(.*)W(.*)")) {
			//replacing all W with V
				s = s.replace('W', 'V');
			}
		}
	}
	//If only 4 characters and above added
	else if(s.length() >= 4) {
		for (int i = 0; i <= s.length() - 4; i++) {
			String substr = s.substring(i, i + 4).toUpperCase();
			
			if (substr.matches("(.*)THE(.*)")) {
				s = s.replaceAll("THE", "ZEE");
			}
			else if(substr.matches("(.*)O(.*)")) {
				s = s.replace('O', 'U');
			}
			else if(substr.matches("(.*)AN(.*)")) {
				s = s.replaceAll("AN", "UN");
			}
			else if(substr.matches("(.*)AU(.*)")) {
				s = s.replaceAll("AU", "OO");
			}
		//ignore
			else if(substr.matches("(.*)A(\\S)(.*)")) {
				if((substr.substring(substr.length(), substr.length()+1).equals("."))) {
					
				}
				s = s.replaceAll("[A]", "E");
			}
			
			else if(substr.matches("(.*)OW(.*)")) {
				s = s.replaceAll("OW", "OO");
			}
			else if(substr.matches("(.*)IR(.*)")) {
				s = s.replaceAll("IR", "UR");
			}
			else if(substr.matches("(.*)TION(.*)")) {
				//replacing all TION with SHUN
				s = s.replaceAll("TION", "SHUN");
			}
			/*
			else if(substr.matches("(.*)F(.*)")) {
				s = s.replaceAll("F", "FF");
			}
			else if(substr.matches("(.*)V(.*)")) {
				s = s.replaceAll("V", "FF");
			}
			*/
			else if(substr.matches("(.*)W(.*)")) {
				//replacing all characters W with V.
				s = s.replace('W', 'V');
				
			}
			
			}
		}
		System.out.println(s.toUpperCase() + bork.toUpperCase());
		
	}
}
