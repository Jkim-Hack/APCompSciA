package GameProj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SnakeMain extends Application {

	@Override public void start(Stage primaryStage) throws Exception {
		
		BorderPane pane = new BorderPane();
		
		Rectangle rect = new Rectangle(100, 100, Color.GREEN);
		
		Snake snake = new Snake(3, pane, rect);
	
		for(int i = 0; i<3; i++){
		snake.getSnakePix().get(i).setLayoutX(200 + i);
		snake.getSnakePix().get(i).setLayoutY(200 + i);
		}
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