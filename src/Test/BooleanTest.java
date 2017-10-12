package Test;

import java.util.Scanner;

public class BooleanTest {

	public static void main(String[] args) {
		
	
		System.out.println(max(5 , 8, -4));
		String j = "Lol";
		j += j;
		j += j;
		
		System.out.println(j);
		
	}
	public static int max(int x, int y, int z) {
		if(x >= y && x>=z) 
			return x;
		else if(y>=x && y>=z) 
			return y;
		
		return z;
		
		
	}
	
}
