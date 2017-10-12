package LOLDoll;

public class LOLDollMain {

	public static void main(String[] args) {
		
		boolean intellect = false;
		Person p = new Person("Tej", 6, "Asian", "Happy", intellect);
		Dog d = new Dog();
		Doll doll = new Doll("The pythagorean theorem is a lie", true, "sneakers", 5, "The club", "Abhishek");
		
		d.setBreed("Corgi");
	
		p.playWithDoll(doll.getDollName());
		System.out.println("\n" + doll.getDollName() + " says: \n" + doll.cries() + "\n" + doll.tinkles() + "\n" +
		doll.colorChange("Blue") + "\n" + doll.spits());
		p.laugh();
		System.out.println(" ");
		p.leaveDoll(doll.getDollName());
		
		System.out.println("\n" + d.getName() + " is looking around and is thinking... " + d.find());
		d.chew();
		d.bark();
		d.pee();
		
		System.out.println("\nThe child comes outside after hearing the bark...");
		d.setisChildThere(true);
		d.chew();
		
		System.out.println("\nThe child now goes beserk... ");
		p.Shout(d.getName());
		p.cry();
	}
	
}
