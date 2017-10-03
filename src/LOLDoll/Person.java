package LOLDoll;

public class Person {
	
	private String myName;
	private int myAge;
	private String myEthnicity;
	private String myEmotion;
	private boolean myIntelligence;
	
	public Person(String name, int age, String race, String feeling, boolean smart) {
		myName = name;
		myAge = age;
		myEthnicity = race;
		myEmotion = feeling;
		myIntelligence = smart;
	}
	public void Shout(String target) {
		String shoutAt = target;
		System.out.println("BAD " + shoutAt + "!");
	}
	
	public void cry() {
		myEmotion = "Sad";
		System.out.println("WAAAAAAAAAAAAHH");
	}
	
	public void laugh() {
		myEmotion = "Happy";
		System.out.println("HAHAHAHAHAHAHAHAHAHAHAHA");
	}
	public void playWithDoll(String dollName) {
		String doll = dollName;
		System.out.println("I will play with" + doll);
	}
	

}
