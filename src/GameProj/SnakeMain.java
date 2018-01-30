package GameProj;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SnakeMain extends Application {

	public int addX = 0;
	public int addY = 0;
	public BorderPane pane = new BorderPane();
	public boolean moveRight = false;
	public boolean moveLeft = false;
	public boolean moveUp = false;
	public boolean moveDown = false;

	@Override
	public void start(Stage primaryStage) throws Exception {

		pane = new BorderPane();

		Rectangle rect = new Rectangle(10, 10, Color.GREEN);

		Snake snake = new Snake(3, rect);

		pane.setCenter(snake.getSnakePix().get(0));

		Scene scene = new Scene(pane, 800, 600);
		scene.setFill(Color.BLACK);

		scene.setOnKeyPressed(e -> {
		
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

		AnimationTimer animate = new AnimationTimer() {

			@Override
			public void handle(long now) {
			if(moveRight) {
				addX+=1;
				snake.setCordX(addX);
				snake.moveRight();
			}
			if(moveLeft) {
				addX-=1;
				snake.setCordX(addX);
				snake.moveRight();
			}
			if(moveUp) {
				addY+=1;
				addX = 0;
				snake.setCordX(addX);
				snake.moveRight();
			}
			if(moveDown) {
				addX = 0;
				addY -= 1;
				snake.setCordX(addX);
				snake.moveRight();
			}

		}

	};animate.start();

	primaryStage.setScene(scene);primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}