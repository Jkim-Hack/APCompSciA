package SwedishChef;

import java.util.*;

public class MainChef {

	public static void main(String[] args) {

		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String bork = " Bork Bork Bork!";
/*
		//If only one character added
		if (s.length() == 1) {
			for (int i = 0; i <= s.length() - 1; i++) {
				String substr = s.substring(i, i + 1).toUpperCase();
				
				//Work on this one vvvv
		
				if(substr.matches("(.*)A(.*)")) {
					s = s.replaceAll("A", "E");
				}
			
				
				/*Work on this vvv
				if(substr.matches("(.*)O(.*)")) {
					s = s.replace('O', 'U');
				}
				
				//These cannot go from one letter string into two
			
				if(substr.matches("(.*)F(.*)")) {
					s = s.replaceAll("F", "FF");
				}
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replaceAll("V", "FF");
				}
		
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
			
				else if(substr.matches("(.*)A(.*)")) {
					s = s.replaceAll("A", "E");
				}
		
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
				
				else if(substr.matches("(.*)F(.*)")) {
					s = s.replaceAll("F", "FF");
				}
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replaceAll("V", "FF");
				}
				
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
			
			else if(substr.matches("(.*)A(\\S)(.*)")) {
				s = s.replace('A', 'E');
			}
			
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
			
			else if(substr.matches("(.*)F(.*)")) {
				s = s.replaceAll("F", "FF");
			}
			else if(substr.matches("(.*)V(.*)")) {
				s = s.replaceAll("V", "FF");
			}
			
			else if(substr.matches("(.*)W(.*)")) {
			//replacing all W with V
				s = s.replace('W', 'V');
			}
		}
	}
		*/

	//If only 4 characters and above added
		if(s.length() >= 4) {
			
			for (int i = 0; i <= s.length() - 4; i++) {
				String substr = s.substring(i, i + 4).toUpperCase();
				
				
				if (substr.matches("(.*)THE(.*)")) {
					s = s.replaceAll("THE", "ZEE");
				}
				else if(substr.matches("(.*)AN(.*)")) {
					s = s.replaceAll("AN", "UN");
				}
				else if(substr.matches("(.*)AU(.*)")) {
					s = s.replaceAll("AU", "OO");
				}
				
				else if((substr.matches("(.*)A(\\S)(.*)"))) {
					for (int j = 0; j < s.length(); j++) {
						
						if ((s.substring(j, j + 1)).equals("A") && !(s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + 'E' + s.substring(j+1);
							
							}
						else if((s.substring(j, j + 1)).equals("A") && (s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + 'A' + s.substring(j+1);
						}
			
					}
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
				//only when EN is next to a period.
				else if(substr.matches("(.*)EN(\\S)(.*)")) {
					for (int j = 0; j < s.length() -2; j++) {
						if ((s.substring(j, j + 2)).equals("EN") && !(s.substring(j+2, j + 3).equals(" ")|| s.substring(j+2, j + 3).equals("."))) {
							s = s.substring(0, j) + "EN" + s.substring(j+2);
							}
						else if((s.substring(j, j + 2)).equals("EN") && (s.substring(j+2, j + 3).equals(" ")||s.substring(j+2, j + 3).equals("."))) {
							s = s.substring(0, j) + "EE" + s.substring(j+2);
						}
					}
				}
				//how is there a heap space error here? vvv
				/*
				else if(substr.matches("(.*)F(.*)")) {
					String f = s.replace("F", "FF");
					s = f;
				}
				*/
				else if(substr.matches("(.*)E(\\S)(.*)")) {
					for (int j = 0; j < s.length()-3; j++) {
						if ((s.substring(j, j + 1)).equals("E") && !(s.substring(j+1, j + 2).equals(" ")|| s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + "E" + s.substring(j+1);
							}
						else if((s.substring(j, j + 1)).equals("E") && (s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
							String l = s.substring(j+2);
							s = s.substring(0, j+2) + "  " + l;
							s = s.substring(0, j) + "E-A" + s.substring(j+3);
						}
					}
				}
				else if(substr.matches("(.*)U(\\S)(.*)")) {
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
		
				
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replace("V", "F");
		
				}
			
				
				else if(substr.matches("(.*)O(.*)")) {
					s = s.replace('O', 'U');
				}
				
				else if(substr.matches("(.*)W(.*)")) {
					//replacing all characters W with V.
					s = s.replace('W', 'V');
					
				}
				
				} 
			
			}
			System.out.println(s.toUpperCase() + bork.toUpperCase());
			
		}
	}
