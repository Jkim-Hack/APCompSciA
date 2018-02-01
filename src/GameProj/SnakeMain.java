package GameProj;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	public double multX = 10;
	public double multY = 10;
	public static Pane pane = new Pane();
	public static boolean moveRight = false;
	public static boolean moveLeft = false;
	public static boolean moveUp = false;
	public static boolean moveDown = false;
	public Label score = new Label();
	public Label loseLabel = new Label();
	public AnimationTimer animate;
	public Button restart;
	
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
		Snake snake = new Snake(3,rect);
		snake.addHead();
		Food food = new Food(rectFood, pane);
	
		loseLabel.setTranslateX(90);
		loseLabel.setTranslateY(200);
		loseLabel.setFont(Font.font ("Arial", 90));
		
		Scene scene = new Scene(pane, 800, 600);
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
				if (e.getCode() == KeyCode.RIGHT) {
					moveRight = true;
					moveLeft = false;
					moveUp = false;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.LEFT) {
					moveRight = false;
					moveLeft = true;
					moveUp = false;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.UP) {
					moveRight = false;
					moveLeft = false;
					moveUp = true;
					moveDown = false;
				}
				if (e.getCode() == KeyCode.DOWN) {
					moveRight = false;
					moveLeft = false;
					moveUp = false;
					moveDown = true;
				}
			
				
		});

		
		Task<Void> RestartTask = new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				
				snake.addHead();
				snake.setCordX(0);
				snake.setCordY(0);
				addX = 0;
				addY = 0;
				pane.getChildren().add(food.getPickup());
				pane.getChildren().remove(loseLabel);
				snake.setCounter(0);
				
				return null;
			}
			
		};
		
		
		restart = new Button("Restart?");
		restart.setTranslateX(400);
		restart.setTranslateY(500);
		
		restart.addEventHandler(ActionEvent.ACTION, ActionEvent ->{
			
			Thread t = new Thread(RestartTask);
			t.setDaemon(true);
			t.start();
			
		});
		
		RestartTask.setOnSucceeded(event -> {
			pane.getChildren().remove(restart);
			animate.start();
			
		});
		
		
		 animate = new AnimationTimer() {

			@Override
			public void handle(long now) {
			pane.getChildren().remove(restart);
			if(moveRight) {
				addX+=multX;
				snake.setCordX(addX);
				snake.moveX();
			}
			if(moveLeft) {
				addX-=multX;
				snake.setCordX(addX);
				snake.moveX();
			}
			if(moveUp) {
				addY-=multY;
				snake.setCordY(addY);
				snake.moveY();
			}
			if(moveDown) {
				addY += multY;
				snake.setCordY(addY);
				snake.moveY();
			}

			if(snake.getHead().getBoundsInParent().intersects(
					food.getPickup().getBoundsInParent())) {
				
				int x = (int)(Math.random()*770) + 1;
				int y = (int)(Math.random()*570) + 1;
				
				food.setLocation(x, y);
				snake.addCounter();
				
				if(snake.getCounter() % 10 == 0) {
					multX*=1.25;
					multY*=1.25;
				}
				
				score.setText("Score: "+snake.getCounter());
				
			}
			if(snake.getHead().getBoundsInParent().intersects(border1.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border2.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border3.getBoundsInParent())||
					snake.getHead().getBoundsInParent().intersects(border4.getBoundsInParent())){
				
				snake.removeHead();
				pane.getChildren().remove(food.getPickup());
				pane.getChildren().add(loseLabel);
				loseLabel.setText("You SUCK!!! " + "\nScore: " + snake.getCounter());
				restart.setVisible(true);
				restart.setDisable(false);
				pane.getChildren().add(restart);
				animate.stop();
			}
			
		}

	};
	animate.start();
	
	
	
	pane.getChildren().add(score);
	
	primaryStage.setScene(scene);
	primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}