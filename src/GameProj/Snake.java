package GameProj;

import java.util.ArrayList;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Snake {

	private ArrayList<Rectangle> snakePix;
	private Pane positionBoard;
	private Rectangle body;
	private int cordX;
	private int cordY;
	
	public Snake(int pix, Pane pane, Rectangle bod) {
		snakePix = new ArrayList<Rectangle>(3);
		body = bod;
		for(int i = 0; i < pix; i++) {
			snakePix.add(i, bod);
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
		
		int i = 0;
		
		while(true) {
		
			i += 20;
			setCordX(i);
			
		}
		
		
	}

	public void moveLeft() {
	
	}
	public ArrayList<Rectangle> getSnakePix() {
		return snakePix;
	}
	public void setSnakePix(ArrayList<Rectangle> snakePix) {
		this.snakePix = snakePix;
	}
	public Pane getPositionBoard() {
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
