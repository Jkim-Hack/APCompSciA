package GameProj;

import java.io.File;
<<<<<<< HEAD
import java.io.FileInputStream;
=======
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
<<<<<<< HEAD
import javafx.event.EventHandler;
=======
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
<<<<<<< HEAD
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
=======
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SnakeMain extends Application {

	private int addX = 0;
	private int addY = 0;
<<<<<<< HEAD
	public int c = 0;
	private double multX = 5;
	private double multY = 5;
	public static Pane pane = new Pane();
	public static boolean moveRight = false;
	public static boolean moveLeft = false;
	public static boolean moveUp = false;
	public static boolean moveDown = false;
	public static boolean ha = false;
	public static boolean ea = false;
	private Label score = new Label();
	private Label loseLabel = new Label();
	private AnimationTimer animate;
	private boolean restartBool = false;
	private Label anykey = new Label();
	private MediaPlayer mediaPlayer;
	Button Easy = new Button("Easy");
	Button Hard = new Button("Hard");
	final ImageView selectedImage = new ImageView();

=======
	private double multX = 5;
	private double multY = 5;
	public static Pane pane = new Pane();
	public static boolean moveRight = false;
	public static boolean moveLeft = false;
	public static boolean moveUp = false;
	public static boolean moveDown = false;
	private Label score = new Label();
	private Label loseLabel = new Label();
	private AnimationTimer animate;
	private boolean restartBool = false;
	private Label anykey = new Label();
	private MediaPlayer mediaPlayer;
	
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
	@Override
	public void start(Stage primaryStage) throws Exception {

		Line border1 = new Line(0.0, 0, 800, 0);
		Line border2 = new Line(0, 0, 0, 600);
		Line border3 = new Line(800, 0, 800, 600);
		Line border4 = new Line(0, 600, 800, 600);

<<<<<<< HEAD
=======
		pane.getChildren().addAll(border1, border2, border3, border4);
		
		Media hit = new Media(new File("MusicGame.mp3").toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.setVolume(.3);
		mediaPlayer.play();
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

<<<<<<< HEAD
		pane.getChildren().addAll(border1, border2, border3, border4);
		Image image1 = new Image(new FileInputStream("C:\\Users\\ashwinneil\\git\\APCompSciA\\Untitled.jpg"));
		selectedImage.setImage(image1);
		pane.getChildren().addAll(selectedImage);

		Media hit = new Media(new File("MusicGame.mp3").toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.setVolume(.4);
		mediaPlayer.play();

		Rectangle rect = new Rectangle(400, 300, 20, 20);
		rect.setFill(Color.GREEN);

		int x = (int) (Math.random() * 750) + 1;
		int y = (int) (Math.random() * 500) + 1;

		Rectangle rectFood = new Rectangle(x, y, 20, 20);
		rectFood.setFill(Color.YELLOW);
=======
		Rectangle rect = new Rectangle(400, 300, 20, 20);
		rect.setFill(Color.GREEN);
 
		int x = (int) (Math.random() * 750) + 1;
		int y = (int) (Math.random() * 500) + 1;

		Rectangle rectFood = new Rectangle(x, y, 20, 20);
		rectFood.setFill(Color.BLUE);
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		Snake snake = new Snake(3, rect);
		snake.addHead();
		Food food = new Food(rectFood, pane);
<<<<<<< HEAD
        Easy.setEffect(new DropShadow());
        Hard.setEffect(new DropShadow());
        
		anykey = new Label("Press P to play again");
		anykey.setTranslateX(90);
		anykey.setTranslateY(400);
		anykey.setFont(Font.font("Arial", 30));
		anykey.setVisible(false);
		pane.getChildren().add(anykey);
		pane.getChildren().add(Easy);
		Easy.setTranslateX(240);
		Easy.setTranslateY(150);
		Easy.setScaleX(3);
		Easy.setScaleY(3);
		Easy.setStyle("-fx-background-color: #00ff00; ");
		Easy.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Hard.setVisible(false);
				Easy.setVisible(false);
				ea = true;
				ha=false;
			}
		});
		pane.getChildren().add(Hard);
		Hard.setTranslateX(533);
		Hard.setTranslateY(150);
		Hard.setScaleX(3);
		Hard.setScaleY(3);
		Hard.setStyle("-fx-background-color: #FF00FF; ");
		Hard.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Hard.setVisible(false);
				Easy.setVisible(false);
				ha = true;
				ea=false;
			}
		});
=======
		
		anykey = new Label("Press SPACE to play again");
		anykey.setTranslateX(90);
		anykey.setTranslateY(400);
		anykey.setFont(Font.font("Arial", 30));
		anykey.setVisible(false);
		pane.getChildren().add(anykey);
		
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		loseLabel.setTranslateX(90);
		loseLabel.setTranslateY(150);
		loseLabel.setFont(Font.font("Arial", 90));
		pane.getChildren().add(loseLabel);
		loseLabel.setVisible(false);

		Scene scene = new Scene(pane, 800, 600);

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
<<<<<<< HEAD
			if (e.getCode() == KeyCode.P) {

				if (restartBool) {
					Easy.setTranslateX(240);
					Easy.setTranslateY(150);
					Hard.setTranslateX(533);
					Hard.setTranslateY(150);
					anykey.setVisible(false);
					loseLabel.setVisible(false);
					
					Easy.setVisible(true);
					
					Easy.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							Easy.setVisible(false);
							Hard.setVisible(false);
							ea=true;
							ha=false;
							snake.addHead();
							snake.setCordX(0);
							snake.setCordY(0);
							addX = 0;
							addY = 0;
							multX = 5;
							multY = 5;
							pane.getChildren().add(food.getPickup());
							snake.setCounter(0);
							score.setText("Score: " + snake.getCounter());
							score.setVisible(true);
							animate.start();
						}
					});
					Hard.setVisible(true);
					Hard.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							Hard.setVisible(false);
							Easy.setVisible(false);
							ha=true;
							ea=false;
							snake.addHead();
							snake.setCordX(0);
							snake.setCordY(0);
							addX = 0;
							addY = 0;
							multX = 5;
							multY = 5;
							
							pane.getChildren().add(food.getPickup());
							snake.setCounter(0);
							score.setText("Score: " + snake.getCounter());
							score.setVisible(true);
							animate.start();
						}
					});
					
						
		

=======
			if (e.getCode() == KeyCode.SPACE) {

				if (restartBool) {
					
					anykey.setVisible(false);
					loseLabel.setVisible(false);
					snake.addHead();
					snake.setCordX(0);
					snake.setCordY(0);
					addX = 0;
					addY = 0;
					multX = 5;
					multY = 5;
					pane.getChildren().add(food.getPickup());
					snake.setCounter(0);
					animate.start();
					
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
				}
			}

		});

<<<<<<< HEAD
=======
		

>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		animate = new AnimationTimer() {

			@Override
			public void handle(long now) {
<<<<<<< HEAD
				if (ea) {
					if (moveRight) {
						addX += multX;
						snake.setCordX(addX);
						snake.moveX();
					}
					if (moveLeft) {
						addX -= multX;
						snake.setCordX(addX);
						snake.moveX();
					}
					if (moveUp) {
						addY -= multY;
						snake.setCordY(addY);
						snake.moveY();
					}
					if (moveDown) {
						addY += multY;
						snake.setCordY(addY);
						snake.moveY();
					}
				}
				if (ha) {
					if (moveRight) {
						addX += multX + 5;
						snake.setCordX(addX);
						snake.moveX();
					}
					if (moveLeft) {
						addX -= 10;
						snake.setCordX(addX);
						snake.moveX();
					}
					if (moveUp) {
						addY -= 10;
						snake.setCordY(addY);
						snake.moveY();
					}
					if (moveDown) {
						addY += multY + 5;
						snake.setCordY(addY);
						snake.moveY();
					}
				}
=======
				if (moveRight) {
					addX += multX;
					snake.setCordX(addX);
					snake.moveX();
				}
				if (moveLeft) {
					addX -= multX;
					snake.setCordX(addX);
					snake.moveX();
				}
				if (moveUp) {
					addY -= multY;
					snake.setCordY(addY);
					snake.moveY();
				}
				if (moveDown) {
					addY += multY;
					snake.setCordY(addY);
					snake.moveY();
				}

				if (snake.getHead().getBoundsInParent().intersects(food.getPickup().getBoundsInParent())) {

					int x = (int) (Math.random() * 750) + 1;
					int y = (int) (Math.random() * 500) + 1;

					food.setLocation(x, y);
					snake.addCounter();

					if (snake.getCounter() % 10 == 0) {
						multX *= 1.25;
						multY *= 1.25;
					}

					score.setText("Score: " + snake.getCounter());

				}
				if (snake.getHead().getBoundsInParent().intersects(border1.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border2.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border3.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border4.getBoundsInParent())) {

					snake.removeHead();
					pane.getChildren().remove(food.getPickup());
					loseLabel.setText("You SUCK!!!" + "\n    Score: " + snake.getCounter());
					loseLabel.setVisible(true);
					anykey.setVisible(true);
					animate.stop();
					restartBool = true;
				}

			}
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

<<<<<<< HEAD
				if (snake.getHead().getBoundsInParent().intersects(food.getPickup().getBoundsInParent()) ) {
=======
		};
		animate.start();
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

<<<<<<< HEAD
					int x = (int) (Math.random() * 750) + 1;
					int y = (int) (Math.random() * 500) + 1;
=======
		pane.getChildren().add(score);
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

<<<<<<< HEAD
					food.setLocation(x, y);
					snake.addCounter();

					if (snake.getCounter() % 10 == 0) {
						multX *= 1.25;
						multY *= 1.25;
					}

					score.setFont(new Font("Arial", 30));
					score.setText("Score: " + snake.getCounter());

				}
			
				if ((snake.getHead().getBoundsInParent().intersects(border1.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border2.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border3.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border4.getBoundsInParent()))&& (ea||ha)) {
					snake.removeHead();
					mediaPlayer.setVolume(0);
					score.setVisible(false);
					pane.getChildren().remove(food.getPickup());
					loseLabel.setText("You LOSE!!!" + "\n    Score: " + snake.getCounter());
					loseLabel.setVisible(true);
					anykey.setVisible(true);
					animate.stop();
					restartBool = true;
					ea=false;
					ha=false;
				}
				
			}
			
		};
		animate.start();

		pane.getChildren().add(score);

=======
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}