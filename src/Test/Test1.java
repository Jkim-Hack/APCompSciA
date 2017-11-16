package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		
		lol(38);
		
		}


	public static void lol(int l) {
		
		if( l > 4) {
			lol(l%4);
		}
		
		System.out.print(l/4 + " ");
		
	}

}