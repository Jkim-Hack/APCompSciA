package GameProj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

	//initialize variables
	private int addX = 0;
	private int addY = 0;
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
	Label l = new Label();
	public FileSeralize file = new FileSeralize();
	
	@Override
	//makes board
	public void start(Stage primaryStage) throws Exception {

		Line border1 = new Line(0.0, 0, 800, 0);
		Line border2 = new Line(0, 0, 0, 600);
		Line border3 = new Line(800, 0, 800, 600);
		Line border4 = new Line(0, 600, 800, 600);


		pane.getChildren().addAll(border1, border2, border3, border4);
		//adds backdrop
		Image image1 = new Image(new FileInputStream("Untitled.jpg"));
		selectedImage.setImage(image1);
		pane.getChildren().addAll(selectedImage);
<<<<<<< HEAD


=======
		//adds music
		Media hit = new Media(new File("MusicGameOld.mp3").toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		//sets volume
		mediaPlayer.setVolume(.4);
		mediaPlayer.play();
		
		//new rectangles, one for the player the other for food with rand coordinates
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		Rectangle rect = new Rectangle(400, 300, 20, 20);
		rect.setFill(Color.BLUE);

		int x = (int) (Math.random() * 750) + 1;
		int y = (int) (Math.random() * 500) + 1;

		Rectangle rectFood = new Rectangle(x, y, 20, 20);
		rectFood.setFill(Color.YELLOW);
		
		//new snake class with adding the head
		Snake snake = new Snake(3, rect);
		snake.addHead();
		//new food class
		Food food = new Food(rectFood, pane);
		
		File f = new File(System.getenv("APPDATA")+ "\\ServerTest\\highscore.ser");

        f.getParentFile().mkdirs(); 
        try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("Already Exists");
			
		}
		
		File f1 = new File(System.getenv("APPDATA")+ "\\ServerTest\\highscoreEasy.ser");

        f1.getParentFile().mkdirs(); 
        try {
			f1.createNewFile();
		} catch (IOException e) {
			System.out.println("Already Exists");
			
		} 
		
		//sets a shadow effect to the button
        Easy.setEffect(new DropShadow());
        Hard.setEffect(new DropShadow());
        
        //reset label and translations
		anykey = new Label("Press P to play again");
<<<<<<< HEAD
		anykey.setTextFill(Color.YELLOW);
		anykey.setTranslateX(90);
=======
		anykey.setTranslateX(275);
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
		anykey.setTranslateY(400);
		anykey.setFont(Font.font("Arial", 30));
		anykey.setVisible(false);
		//adds to pane
		pane.getChildren().add(anykey);
		pane.getChildren().add(Easy);
		//translates easy button and sets action to it
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

				Media hit = new Media(new File("MusicGameOld.mp3").toURI().toString());
				mediaPlayer = new MediaPlayer(hit);
				mediaPlayer.setVolume(.4);
				mediaPlayer.play();
			}
		});
		//adds hard button
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
<<<<<<< HEAD
				ea=false;

				Media hit = new Media(new File("MusicGameOld.mp3").toURI().toString());
				mediaPlayer = new MediaPlayer(hit);
				mediaPlayer.setVolume(.4);
				mediaPlayer.play();
=======
				ea = false;
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git
			}
		});
		//Translates label and adds label into pane
		loseLabel.setTranslateX(150);
		loseLabel.setTranslateY(150);
		loseLabel.setFont(Font.font("Arial", 90));
		loseLabel.setTextFill(Color.BLUEVIOLET);
		pane.getChildren().add(loseLabel);
		loseLabel.setVisible(false);
	
		
		
		
		//new scene class
		Scene scene = new Scene(pane, 800, 600);

		//all key press listeners
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
			//Resets everything when pressing P
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
					
						
		

				}
			}

		});

		//new animation timer
		animate = new AnimationTimer() {

			//movement of the head
			@Override
			public void handle(long now) {
				
				if(ha) {
				
			        
			        try {
				         FileInputStream fileIn = new FileInputStream(System.getenv("APPDATA")+ "\\ServerTest\\highscore.ser");
				         ObjectInputStream in = new ObjectInputStream(fileIn);
				         file = (FileSeralize) in.readObject();
				         in.close();
				         fileIn.close();
				      } catch (IOException i) {
				         file.HighscoreLocal = 0;
				      } catch (ClassNotFoundException c) {
				         System.out.println("Class not found");
				         c.printStackTrace();
				      }
			       
				} else if(ea){	        
					
			       
			        try {
				         FileInputStream fileIn = new FileInputStream(
				        		 System.getenv("APPDATA")+ "\\ServerTest\\highscoreEasy.ser");
				         ObjectInputStream in = new ObjectInputStream(fileIn);
				         file = (FileSeralize) in.readObject();
				         in.close();
				         fileIn.close();
				      } catch (IOException i) {
				         file.HighscoreLocalEasy = 0;
				      } catch (ClassNotFoundException c) {
				         System.out.println("Class not found");
				         c.printStackTrace();
				      }
			        
				}
				
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

				//collision wiht the food
				if (snake.getHead().getBoundsInParent().intersects(food.getPickup().getBoundsInParent()) ) {

					int x = (int) (Math.random() * 750) + 1;
					int y = (int) (Math.random() * 500) + 1;

					food.setLocation(x, y);
					snake.addCounter();

					if (snake.getCounter() % 10 == 0) {
						multX *= 1.25;
						multY *= 1.25;
					}

<<<<<<< HEAD
					score.setFont(new Font("Arial", 30));
					score.setTextFill(Color.BURLYWOOD);
					score.setText("Score: " + snake.getCounter());
=======
					if(snake.getCounter() >= file.HighscoreLocal) {
						file.HighscoreLocal = snake.getCounter();
					}
>>>>>>> branch 'master' of https://github.com/Jkim-Hack/APCompSciA.git

					score.setFont(new Font("Arial", 15));
					score.setText("Score: " + snake.getCounter());
					l.setText("Highscore: " + file.HighscoreLocal);
					l.setTranslateX(75);
					l.setFont(new Font("Arial", 15));
		
				}
				//collision with the border and results of doing so
				if ((snake.getHead().getBoundsInParent().intersects(border1.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border2.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border3.getBoundsInParent())
						|| snake.getHead().getBoundsInParent().intersects(border4.getBoundsInParent())
						)&& (ea||ha)) {
					snake.removeHead();
					mediaPlayer.setVolume(0);
					score.setVisible(false);
					pane.getChildren().remove(food.getPickup());
					loseLabel.setText("You LOSE!!!!" + "\n    Score: " + snake.getCounter());
					loseLabel.setVisible(true);
					anykey.setVisible(true);
					restartBool = true;
					ea=false;
					ha=false;

					if(snake.getCounter() >= file.HighscoreLocal && ha) {
					try {
				         FileOutputStream fileOut = new FileOutputStream(
				        		 System.getenv("APPDATA")+ "\\ServerTest\\highscore.ser");
				         ObjectOutputStream out = new ObjectOutputStream(fileOut);
				         out.writeObject(file);
				         out.close();
				         fileOut.close();
				      } catch (IOException i) {
				         i.printStackTrace();
				      }
					}
					else if(snake.getCounter() >= file.HighscoreLocalEasy && ea) {
						try {
					         FileOutputStream fileOut = new FileOutputStream(
					        		 System.getenv("APPDATA")+ "\\ServerTest\\highscoreEasy.ser");
					         ObjectOutputStream out = new ObjectOutputStream(fileOut);
					         out.writeObject(file);
					         out.close();
					         fileOut.close();
					      } catch (IOException i) {
					         i.printStackTrace();
					      }
						}
					animate.stop();
				}
				
			}
			
		};
		//starts animation
		animate.start();
		//adds core to pane
		pane.getChildren().addAll(score, l);

		//scene added 
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	//launches
	public static void main(String[] args) {
		launch(args);
	}

}