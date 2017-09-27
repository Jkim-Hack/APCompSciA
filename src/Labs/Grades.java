package Labs;

public class Grades {
	public static void main(String[] args) {
		
		Student student1 = new Student("Mary");
		Student student2 = new Student("Mike");

		student1.inputGrades();
		System.out.println("The average grade for " + student1.getName() + " is: " + student1.getAverage());

		student2.inputGrades();
		System.out.println("The average grade for " + student2.getName() + " is: " + student2.getAverage());

		System.out.println(student1.toString());
		System.out.println(student2.toString());
		
	}
}
