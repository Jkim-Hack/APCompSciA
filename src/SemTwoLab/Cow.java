package SemTwoLab;

public class Cow implements Animal{

	@Override
	public String makesound() {
		return "moo";
	}

	@Override
	public String getType() {
		return "cow";
	}

}
