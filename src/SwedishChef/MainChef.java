package SwedishChef;

import java.util.*;
import java.util.regex.*;



public class MainChef {

	public static void main(String[] args) {

		System.out.println("Print: ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine().toUpperCase();
		String bork = " Bork Bork Bork!";

	//If only 4 characters and above added
		if(s.length() >= 4) {
			
			for (int i = 0; i <= s.length()-4; i++) {
				String substr = s.substring(i, i + 4).toUpperCase();
				
				
				if (substr.matches("(.*)THE(.*)")) {
					s = s.replaceAll("THE", "zee");
				}
				else if(substr.matches("(.*)AN(.*)")) {
					s = s.replaceAll("AN", "un");
				}
				else if(substr.matches("(.*)AU(.*)")) {
					s = s.replaceAll("AU", "oo");
				}
				
				else if((substr.matches("(.*)A(.*)"))) {

					Pattern pattern = Pattern.compile(("(.*)A(\\S+)"));
				    Matcher matcher = pattern.matcher(substr);
				    int startIndex = matcher.start();
				    s = s.replaceAll(substr.substring(startIndex, startIndex + 1), "E");

					for (int j = 0; j < s.length(); j++) {
						
						if ((s.substring(j, j + 1)).equals("A") && !(s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + 'e' + s.substring(j+1);
							
							}
						else if((s.substring(j, j + 1)).equals("A") && (s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + 'A' + s.substring(j+1);
						}
			
					}

				}
					
					//					for (int j = 0; j < s.length(); j++) {
//						
//						if ((s.substring(j, j + 1)).equals("A") && !(s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
//							s = s.substring(0, j) + 'E' + s.substring(j+1);
//							
//							}
//						else if((s.substring(j, j + 1)).equals("A") && (s.substring(j+1, j + 2).equals(" ")||s.substring(j+1, j + 2).equals("."))) {
//							s = s.substring(0, j) + 'A' + s.substring(j+1);
//						}
//			
//					}
				
			
			
				else if(substr.matches("(.*)OW(.*)")) {
					s = s.replaceAll("OW", "oo");
				}
				else if(substr.matches("(.*)IR(.*)")) {
					s = s.replaceAll("IR", "ur");
				}
				else if(substr.matches("(.*)TION(.*)")) {
					//replacing all TION with SHUN
					s = s.replaceAll("TION", "shun");
				}
				//only when EN is next to a period.
				else if(substr.matches("(.*)EN(.*)")) {
					for (int j = 0; j < s.length() -2; j++) {
						if ((s.substring(j, j + 2)).equals("EN") && !(s.substring(j+2, j + 3).equals(" ")|| s.substring(j+2, j + 3).equals("."))) {
							s = s.substring(0, j) + "en" + s.substring(j+2);
							}
						else if((s.substring(j, j + 2)).equals("EN") && (s.substring(j+2, j + 3).equals(" ")||s.substring(j+2, j + 3).equals("."))) {
							s = s.substring(0, j) + "EE" + s.substring(j+2);
						}
					}
				}
				else if(substr.matches("(.*)V(.*)")) {
					s = s.replace("V", "f");
		
				}
				
				else if(substr.matches("(.*)W(.*)")) {
					//replacing all characters W with V.
					s = s.replace('W', 'v');
					
				}
				//how is there a heap space error here? vvv
				else if(substr.matches("(.*)F(.*)")) {
					for (int j = 0; j < s.length()-2; j++) {
						if((s.substring(j, j + 1)).equals("F")) {
							String l = s.substring(j+1);
							s = s.substring(0, j+1) + " " + l;
							s = s.substring(0, j) + "ff" + s.substring(j+2);
						}
					}
				}
				
				else if(substr.matches("(.*)E(.*)")) {
					for (int j = 0; j < s.length(); j++) {
						if ((s.substring(j, j + 1)).equals("E") && !(s.substring(j+1, j + 2).equals(" ")|| s.substring(j+1, j + 2).equals("."))) {
							s = s.substring(0, j) + "e" + s.substring(j+1);
							}
						else if((s.substring(j, j + 1)).equals("E") && (s.substring(j+1, j + 2).equals(" "))) {
							String l = s.substring(j+1);
							s = s.substring(0, j+1) + "  " + l;
							s = s.substring(0, j) + "e-a" + s.substring(j+3);
						}
						else if(s.substring(j, j + 1).equals("E") && s.substring(j+1, j + 2).equals(".")) {
							String l = s.substring(j+1);
							s = s.substring(0, j+1) + "  " + l;
							s = s.substring(0, j) + "e-a" + s.substring(j+3);
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
									s = s.substring(0, j) + "oo" + s.substring(j+2);
								}
							}
						
					
					}
				}
				if(substr.matches("(.*)I(\\S)(.*)")) {
					for (int j = 0; j < s.length()-2; j++) {
						  if (s.substring(j, j+1).equals(" ") || s.substring(j, j+1).matches("I") ) {
							  if((s.substring(j+1, j+2).equals("I"))) {
									s = s.substring(0, j+1) + "I" + s.substring(j+2);
								}
							  else if(s.substring(0, j+1).matches("I")){
								  s = s.substring(0, 0) + "I" + s.substring(j+1);
							  }
							  else if((s.substring(j, j + 1)).equals("I")) {
									String l = s.substring(j+1);
									s = s.substring(0, j+1) + " " + l;
									s = s.substring(0, j) + "ee" + s.substring(j+2);
								}
							}
						
					
					}
				}
	
			
				
				else if(substr.matches("(.*)O(.*)")) {
					for (int j = 0; j < s.length(); j++) {
						if ((s.substring(j, j + 1)).equals("O") && !(s.substring(j + 1, j + 2).equals("W"))) {
							s = s.substring(0, j) + "u" + s.substring(j+1);
						
							}
					}
				}
				
				
				} 
			
			}
			System.out.println(s.toUpperCase() + bork.toUpperCase());
			
		}
	}
