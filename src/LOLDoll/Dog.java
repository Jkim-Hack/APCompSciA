package LOLDoll;

public class Dog {

	private String name;
	private String breed;
	private int age;
	private String furColor;
	private String eyeColor;
	private boolean isChildThere;

	public Dog() {
		age = 30;
		name = "Scarlett";
		breed = "Beagle";
		furColor = "Brown";
		eyeColor = "Blue";
		isChildThere = false;

	}

	public Dog(String myName, String myBreed) {
		myName = name;
		myBreed = breed;
	}

	public Dog(String myName, String myBreed, int myAge, String myFurColor, String myEyeColor) {
		myName = name;
		myBreed = breed;
		myAge = age;
		myFurColor = furColor;
		myEyeColor = eyeColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String mName) {
		mName = name;
	}

	public int getAge() {
		return age;
	}

	public void setName(int mAge) {
		mAge = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String mBreed) {
		mBreed = breed;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String mEyeColor) {
		mEyeColor = eyeColor;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String mFurColor) {
		mFurColor = furColor;
	}

	public boolean getisChildThere() {
		return isChildThere;
	}

	public void setisChildThere(boolean misChildThere) {
		isChildThere = misChildThere;
	}

	public void poop() {
		if (isChildThere) {
			System.out.println("No Poop!");
		} else {
			System.out.println("Poop!");
		}

	}

	public void pee() {
		if (!(isChildThere)) {
			System.out.println("No Pee!");
		} else {
			System.out.println("Pee!");
		}
	}

	public void chew() {
		if (isChildThere) {
			System.out.println("No Chew!");
		} else {
			System.out.println("Chew!");
		}
	}

	public void bark() {
		if (isChildThere) {
			System.out.println("No Bark!");
		} else {
			System.out.println("Bark!");
		}
	}
	public String find() {
		return "Hey look a doll!";
	}
}
