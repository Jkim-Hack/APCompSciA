package Labs;

import java.util.Scanner;

public class TestName {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the First then Middle then Last name of person 1: ");
		String firstF = s.nextLine();
		String firstM = s.nextLine();
		String firstL = s.nextLine();
		
		System.out.println("Person 2: ");
		String secondF = s.nextLine();
		String secondM = s.nextLine();
		String secondL = s.nextLine();
		
		
		Name first = new Name(firstF, firstM, firstL);
		Name second = new Name(secondF, secondM, secondL);
		
		System.out.println("First person: ");
		
		System.out.println(first.firstMiddleLast());
		System.out.println(first.lastFirstMiddle());
		System.out.println(first.initials());
		System.out.println(first.length());
		
		System.out.println("Second person: ");
		
		System.out.println(second.firstMiddleLast());
		System.out.println(second.lastFirstMiddle());
		System.out.println(second.initials());
		System.out.println(second.length());
		
		
		System.out.println("Are they the same? " + first.equals(second.firstMiddleLast()));
		
	}
	
	
}
