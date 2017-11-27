package Test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		
		String l = "Happy Halloween!";
		
		System.out.println(Test1.testMethod(l));
		
		}


	public static String testMethod(String s) {
		
		for(int i = 0; i <s.length(); i += 3){
			s = s.substring(0, i) + "-" + s.substring(i +1);
		}
		
		return s;
	}

}