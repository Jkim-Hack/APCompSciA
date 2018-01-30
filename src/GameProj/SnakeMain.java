package GameProj;

import javafx.application.Application;
<<<<<<< HEAD

=======
import javafx.geometry.Pos;
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
=======
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Button;


public class SnakeMain extends Application {

<<<<<<< HEAD
	Rectangle Rectangle = new Rectangle();

=======
	
	public BorderPane pane = new BorderPane();
	
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
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

		
		pane = new BorderPane();
		
<<<<<<< HEAD
		FlowPane ane = new FlowPane();
=======
		Rectangle rect = new Rectangle(50, 50, Color.GREEN);
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		
<<<<<<< HEAD
		Scene scene = new Scene(ane, 800,600);
		scene.setFill(Color.GREEN);
=======
		Snake snake = new Snake(3,rect);
		
		pane.setCenter(snake.getSnakePix().get(1));
		
		Scene scene = new Scene(pane, 800, 600);
		scene.setFill(Color.BLACK);
		
		scene.setOnKeyPressed(e -> {
			if(e.getCode() == KeyCode.RIGHT) {
				snake.moveRight();
			}
			
			
		});
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}