package GameProj;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Food {

	//instance vars
	
	private Rectangle pickup;
	private Pane pane;
	
	//constructors
	public Food(Rectangle pckup, Pane pane1) {
		pickup = pckup;
		pane = pane1;
		pane.getChildren().add(pickup);
	}
	
	//sets location
	public void setLocation(int a, int b) {
		pickup.relocate(a, b);
	}
//getters and setters
	public Rectangle getPickup() {
		return pickup;
	}

	public void setPickup(Rectangle pickup) {
		this.pickup = pickup;
	}
	
	
}
