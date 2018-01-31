package GameProj;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Snake {

	private ArrayList<Rectangle> snakePix;
	private Rectangle body;
	private Rectangle head;
	private int cordX;
	private int cordY;
	private Pane pane;
	private int counter;

	public Snake(int pix, Pane pane1, Rectangle bod) {
		snakePix = new ArrayList<Rectangle>(pix);
		body = bod;
		head = bod;
		pane = pane1;
		counter = 0;
		for (int i = 0; i < pix; i++) {
			snakePix.add(i, bod);
		}
		addHead();

	}

	public void addHead() {

		pane.getChildren().add(head);

	}

	public void addCounter() {
	
		counter++;

	}

	public void moveY() {
		head.setTranslateY(cordY);
	}

	public void moveX() {

		head.setTranslateX(cordX);
		
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

	public Pane getPane() {
		return pane;
	}

	public void setPane(Pane pane) {
		this.pane = pane;
	}

	public Rectangle getHead() {
		return head;
	}

	public void setHead(Rectangle head) {
		this.head = head;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	
}
