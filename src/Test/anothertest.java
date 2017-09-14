package Test;

public class anothertest {

	public static void main(String[] args) {
		String s = "I U S";
		int spaces = s.length() - s.replace(" ", "").length();
		System.out.println(spaces);
	}
	
}
