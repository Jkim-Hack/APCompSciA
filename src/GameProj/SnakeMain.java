package GameProj;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;


public class SnakeMain extends Application {

	Rectangle Rectangle = new Rectangle();

	@Override public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox();

		Button btUp = new Button("UP");
        Button btDown = new Button("DOWN");
        Button btLeft = new Button("LEFT");
        Button btRight = new Button("RIGHT");

        pane.getChildren().add(btUp);
        pane.getChildren().add(btDown);
        pane.getChildren().add(btRight);
        pane.getChildren().add(btLeft);

		
		
		FlowPane ane = new FlowPane();
		
		Scene scene = new Scene(ane, 800,600);
		scene.setFill(Color.GREEN);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}