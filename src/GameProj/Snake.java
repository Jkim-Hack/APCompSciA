package GameProj;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Snake {

	private ArrayList<Rectangle> snakePix;
	private Rectangle body;
	private int cordX;
	private int cordY;

	public Snake(int pix, Rectangle bod) {
		snakePix = new ArrayList<Rectangle>(3);
		body = bod;


		for (int i = 0; i < pix; i++) {
			snakePix.add(i, bod);
		}

	}

	public void setSnake() {
		for (int i = 1; i <= snakePix.size(); i++) {

		}
	}

	public void moveForward() {
		while (true) {

		}
	}

	public void moveUp() {

		for (int i = 0; i < snakePix.size(); i++) {

		}

	}

	public void moveDown() {

	}

	public void moveRight() {

		snakePix.get(0).setTranslateX(cordX);
	
	}

	public void moveLeft() {

	}

	public ArrayList<Rectangle> getSnakePix() {
		return snakePix;
	}

	public void setSnakePix(ArrayList<Rectangle> snakePix) {
		this.snakePix = snakePix;
	}

	public Rectangle getBody() {
		return body;
	}

	public void setBody(Rectangle body) {
		this.body = body;
	}

	public int getCordX() {
		return cordX;
	}

	public void setCordX(int cordX) {
		this.cordX = cordX;
	}

	public int getCordY() {
		return cordY;
	}

	public void setCordY(int cordY) {
		this.cordY = cordY;
	}

}
