package GameProj;

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

	
	public BorderPane pane = new BorderPane();
	
	@Override public void start(Stage primaryStage) throws Exception {
		
		pane = new BorderPane();
		
		Rectangle rect = new Rectangle(50, 50, Color.GREEN);
		
		Snake snake = new Snake(3,rect);
		
		pane.setCenter(snake.getSnakePix().get(1));
		
		Scene scene = new Scene(pane, 800, 600);
		scene.setFill(Color.BLACK);
		
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.RIGHT) {
				snake.moveRight();
			}
			
			
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}