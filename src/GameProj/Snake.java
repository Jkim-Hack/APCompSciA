package GameProj;

import java.util.ArrayList;

import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Rectangle;

public class Snake {

	private ArrayList<Rectangle> snakePix;
	private FlowPane positionBoard;
	private Rectangle body;
	
	public Snake(int pix, FlowPane pane, Rectangle bod) {
		
		for(int i = 1; i <= pix; i++) {
		snakePix.add(bod);
		}
		
		positionBoard = pane;
		
	}
	public void setSnake() {
		for(int i = 1; i <= snakePix.size(); i++) {
			
		}
	}
	public void moveForward() {
		while (true) {
			
		}
	}
	
	public void moveUp() {
		
		for(int i = 0; i < snakePix.size(); i++) {
			
			
			
		}
		
	}
	
	public void moveDown() {
		
	}

	public void moveRight() {
	
	}

	public void moveLeft() {
	
	}
	public ArrayList<Rectangle> getSnakePix() {
		return snakePix;
	}
	public void setSnakePix(ArrayList<Rectangle> snakePix) {
		this.snakePix = snakePix;
	}
	public FlowPane getPositionBoard() {
		return positionBoard;
	}
	public void setPositionBoard(FlowPane positionBoard) {
		this.positionBoard = positionBoard;
	}
	public Rectangle getBody() {
		return body;
	}
	public void setBody(Rectangle body) {
		this.body = body;
	}
	
	
	
}
