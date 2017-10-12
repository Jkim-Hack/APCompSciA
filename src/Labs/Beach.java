package Labs;

import java.util.*;
import java.awt.*;

public class Beach {

	private int myamountofGrains;
	private Color BCHcolor;
	private int myamountofShells;
	
	public Beach() {
		
		myamountofGrains = Integer.MAX_VALUE;
		BCHcolor = Color.ORANGE;
		myamountofShells = (Integer.MAX_VALUE)/30;
	}
	
	public void Wave(boolean hang, boolean ridingwave) {
		
		System.out.println("WOOSH");
		
		if (hang) {
		 System.out.println("Crab is still hagning on the beach");
		}
		else if(ridingwave) {
			
			System.out.println("Crab is now riding wave");
			
		}
		else {
			System.out.println("Crab isn't hanging on the beach and got washed away");
		}
		
		
		myamountofGrains -= (Integer.MAX_VALUE)/20;
		myamountofShells -= 1000;
		
		
		
	}
	
	public void hole() {
		
		System.out.println("There is a hole now");
		
	}
	
	public void pinched(boolean pinch) {
		
		if(pinch) {
		myamountofShells -= 1;
		}
		else {
			myamountofShells = myamountofShells;
		}
		
		
	}

	public int getMyamountofGrains() {
		return myamountofGrains;
	}

	public void setMyamountofGrains(int myamountofGrains) {
		this.myamountofGrains = myamountofGrains;
	}

	public Color getBCHcolor() {
		return BCHcolor;
	}

	public void setBCHcolor(Color bCHcolor) {
		BCHcolor = bCHcolor;
	}

	public int getMyamountofShells() {
		return myamountofShells;
	}

	public void setMyamountofShells(int myamountofShells) {
		this.myamountofShells = myamountofShells;
	}

	
	public String toString() {
		return "The amount of grains: " + myamountofGrains +
				"\nThe amount of shells: " + myamountofShells;
	}
	
	
	
	
}
