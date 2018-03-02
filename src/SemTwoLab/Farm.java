package SemTwoLab;

import java.util.ArrayList;

public class Farm {

	private ArrayList<Animal> list = new ArrayList<Animal>();
	
	public void addAnimal() {
		Chicken chicken = new Chicken();
		Cow cow = new Cow();
		
	
		
		int k = (int)(Math.random()*100)+1;
		if(k % 2 == 0) {
			list.add(cow);
		} else{
			list.add(chicken);
		}
	
	}
	
	public String sing() {
		
		return "Old MacDonald had a farm. E-I-E-I-O! And on that farm he had a " 
		+ list.get(0).getType() + ". E-I-E-I-O!" + "With a " + list.get(0).makesound() + 
		list.get(0).makesound() + " here and a " + list.get(0).makesound() + " there";
		
	}
	
}
