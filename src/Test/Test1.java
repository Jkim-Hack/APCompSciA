package Test;
import java.util.*;

public class Test1 {

	private static int[] numbers = {17, 34, 21, 42, 15, 69, 48, 25, 39};
	
	
	public static void main(String[] args) {
		
		mystery(3);

	}
	
	public static void mystery(int x) {
		
		for(int k =1; k < numbers.length; k = k + x) {
			numbers[k] = numbers[k-1] + x;
		}
		for(int i = 0; i < numbers.length; i++) {
		
		System.out.print(numbers[i] + " ");
		}
	}
	
	
	
}