package GameProj;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SnakeMain extends Application {

	@Override public void start(Stage primaryStage) throws Exception {
		
		
		
		FlowPane pane = new FlowPane();
		
		Scene scene = new Scene(pane, 800, 600);
		scene.setFill(Color.BLACK);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}