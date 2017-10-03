package LOLDoll;

public class Doll
{
	private String secretMessage;
	private boolean isWaterFull;
	private String shoeType;
	private int numOutfitPieces;
	private String clubName;
	private String dollName;
	
	public Doll(String message, boolean water, String shoe, int numPieces, String club, String name)
	{
		secretMessage = message;
		isWaterFull = water;
		shoeType = shoe;
		numOutfitPieces = numPieces;
		clubName = club;
		dollName = name;
	}
	
	public String tinkles()
	{
		return "I am tinkling on the carpet.";
	}
	
	public String cries()
	{
		return "Waaaaaaaaaaaaaaaaa!";
	}
	
	public String colorChange (String newcolor)
	{
		return "My hair color is now "+newcolor;
	}
	
	public String spits ()
	{
		return "Ew.";
	}
}