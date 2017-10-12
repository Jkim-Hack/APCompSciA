package Labs;

import java.util.*;
import java.awt.*;

public class Crab {

	private Color myColor;
	private int myAge;
	private boolean hang;
	private boolean isriding;
	private String myname;
	
	public Crab() {
		
		myAge = 1;
		myColor = Color.RED;
		myname = "Mr.Krabs";
		hang = false;
		
	}
	
	public Crab(int age, Color color, String name) {
		
		myname = name;
		myAge = age;
		myColor = color;
		
	}
	
	public void makeahole(String name) {
		
		System.out.println(name + " made a hole");
		hang = true;
		
	}
	public void outofhole(String name) {
		
		System.out.println(name + " is out of the hole");
		hang = false;
		isriding = true;
		
	}
	
	public void hangon(String name, boolean hanger) {
		
		if (hanger) {
		System.out.println(name + " is hanging in hole");
		}
		else {
			System.out.println(name + " is not hanging in hole");
		}
		
	}
	
	public boolean pinchshell() {
		
		System.out.println("The crab is pinching a shell");
		
		return true;
		
	}
	
	

	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public boolean isHang() {
		return hang;
	}

	public void setHang(boolean hang) {
		this.hang = hang;
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public boolean isIsriding() {
		return isriding;
	}

	public void setIsriding(boolean isriding) {
		this.isriding = isriding;
	}
	
	public String toString() {
		
		return "Crab's name is: " + myname + "\nCrab's age is: " + myAge;
		
	}
	
}
