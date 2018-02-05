package GameProj;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Food {

	private Rectangle pickup;
	private Pane pane;
	public Food(Rectangle pckup, Pane pane1) {
		pickup = pckup;
		pane = pane1;
		pane.getChildren().add(pickup);
	}
	
	public void setLocation(int a, int b) {
		pickup.relocate(a, b);
	}

	public Rectangle getPickup() {
		return pickup;
	}

	public void setPickup(Rectangle pickup) {
		this.pickup = pickup;
	}
	
	
}
