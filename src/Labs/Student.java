package Labs;

//****************************************************************
//Student.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2.  Methods prompt for and read in grades, 
//compute the average, and return a string containing student’s info. 
//****************************************************************
import java.util.Scanner;

public class Student {
	// declare instance data
	private String name;
	private int test1;
	private int test2;
	// -----------------------------------------------
	// constructor
	// -----------------------------------------------
	public Student(String studentName) {
		name = studentName;
	}

	// -----------------------------------------------
	// inputGrades: prompt for and read in student's grades for test1 and test2.
	// Use name in prompts, e.g., "Enter's Joe's score for test1".
	// -----------------------------------------------
	public void inputGrades() {
		System.out.println("Enter " + name + "score for test1: ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println("test2: ");
		Scanner d = new Scanner(System.in);
		String b = s.nextLine();
		
		test1 = Integer.parseInt(a);
		test2 = Integer.parseInt(b)
;	}

	// -----------------------------------------------
	// getAverage: compute and return the student's test average
	// -----------------------------------------------

	public int getAverage()
	{
		return (test1 + test2)/2;
	}

	// -----------------------------------------------
	public String getName()
	{
		return name;
	}
	// -----------------------------------------------

	public void printName()
	{
		System.out.println(name);
	}

}
