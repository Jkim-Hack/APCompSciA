package GameProj;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SnakeMain extends Application {

	public int addX = 0;
	public int addY = 0;
	public Pane pane = new Pane();
	public static boolean moveRight = false;
	public static boolean moveLeft = false;
	public static boolean moveUp = false;
	public static boolean moveDown = false;
	public Label score = new Label();
	public Label loseLabel = new Label();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Line border1 = new Line(0.0, 0, 800, 0);
		Line border2 = new Line(0, 0, 0, 600);
		Line border3 = new Line(800, 0, 800, 600);
		Line border4 = new Line(0, 600, 800, 600);
		
		pane.getChildren().addAll(border1,border2,border3,border4);
		
		Rectangle rect = new Rectangle(400, 300, 20, 20);
		rect.setFill(Color.GREEN);
		
		int x = (int)(Math.random()*790) + 1;
		int y = (int)(Math.random()*590) + 1;
		
		Rectangle rectFood = new Rectangle(x , y, 20, 20);
		rectFood.setFill(Color.BLUE);
		Snake snake = new Snake(3, pane, rect);
		Food food = new Food(rectFood, snake.getPane());
	
		loseLabel.setTranslateX(90);
		loseLabel.setTranslateY(200);
		loseLabel.setFont(Font.font ("Arial", 90));
		
		Scene scene = new Scene(snake.getPane(), 800, 600);
		scene.setFill(Color.BLACK);

		scene.setOnKeyPressed(e -> {
		
				if (e.getCode() == KeyCode.D) {
					moveRight = true;
					moveLeft = false;
					moveUp = false;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.A) {
					moveRight = false;
					moveLeft = true;
					moveUp = false;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.W) {
					moveRight = false;
					moveLeft = false;
					moveUp = true;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.S) {
					moveRight = false;
					moveLeft = false;
					moveUp = false;
					moveDown = true;
				}
			
				
		});

		AnimationTimer animate = new AnimationTimer() {

			@Override
			public void handle(long now) {
			if(moveRight) {
				addX+=10;
				snake.setCordX(addX);
				snake.moveX();
			}
			if(moveLeft) {
				addX-=10;
				snake.setCordX(addX);
				snake.moveX();
			}
			if(moveUp) {
				addY-=10;
				snake.setCordY(addY);
				snake.moveY();
			}
			if(moveDown) {
				addY += 10;
				snake.setCordY(addY);
				snake.moveY();
			}

			if(snake.getHead().getBoundsInParent().intersects(
					food.getPickup().getBoundsInParent())) {
				
				int x = (int)(Math.random()*790) + 1;
				int y = (int)(Math.random()*590) + 1;
				
				food.setLocation(x, y);
				snake.addCounter();
				score.setText("Score: "+snake.getCounter());
				
			}
			if(snake.getHead().getBoundsInParent().intersects(border1.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border2.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border3.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border4.getBoundsInParent())){
				
				snake.getHead().setVisible(false);
				food.getPickup().setVisible(false);
				loseLabel.setText("You SUCK!!! " + "\nScore: " + snake.getCounter());
				
			}
			
		}

	};animate.start();

	pane.getChildren().add(score);
	pane.getChildren().add(loseLabel);
	
	primaryStage.setScene(scene);
	primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}