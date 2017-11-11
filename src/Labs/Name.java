package Labs;

public class Name {

	private String First;
	private String Middle;
	private String Last;
	
	public Name(String first, String middle, String last) {
		
		First = first;
		Middle = middle;
		Last = last;
				
	}

	public String getFirst() {
		return First;
	}

	public String getMiddle() {
		return Middle;
	}

	public String getLast() {
		return Last;
	}

	public String firstMiddleLast() {
		
		return First + " " + Middle + " " + Last; 
		
	}

	public String lastFirstMiddle() {
		
		return Last + " " + First + " " + Middle; 
		
	}
	
	public boolean equals(String otherName) {
		
		String name = First + " " + Middle + " " + Last;
		
		return name.equalsIgnoreCase(otherName);
		
		
	}
	
	public String initials() {
		
		String f = First.substring(0, 1);
		String m = Middle.substring(0, 1);
		String l = Last.substring(0, 1);
		
		return f + " " + m + " " + l;
		
	}
	
	public int length() {
		
		String l = First+Middle+Last;
		
		return l.length();
		
		
	}
	
}
