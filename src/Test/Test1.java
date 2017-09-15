package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String s = "AHAHAHA AH AHAHA.";
		for(int space = s.indexOf(" "); space >= 0; space = s.indexOf(" ", space + 1)) {
			System.out.println(space);
		}
		
	}
	
	
}
