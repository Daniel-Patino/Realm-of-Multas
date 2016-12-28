package com.PatinoDaniel.RoM;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * An abstract method to set down the framework of a scene. The items necessary for a scene to function
 * include choices(Optional), a background image, the title of the scene, a back button(Optional), a
 * reference to the primaryStage and a reference to the previous scene. Two protected but useful objects
 * include the Scene constructedScene and the StackPane masterStackPane.
 * 
 * @author Dsp02_000
 *
 */

public abstract class SceneCreator {
	
	private boolean isBackButton;
	private String[] choices;
	private String bgPath;
	private String title;
	private Stage primaryStage;
	private Scene backScene;
	
	protected Scene constructedScene;
	protected StackPane masterStackPane;
	
	public static final int GAME_WIDTH = 760;
	public static final int GAME_HEIGHT = 640;
	
	/**
	 * The master constructor, other constructors could be made with less parameters but for general purposes
	 * this one is appropriate. This sets the scene and feeds all of the class variables the necessary data
	 * so that all the methods can function without parameters 
	 * 
	 * @param choices		Several choices or no choices
	 * @param bgPath		A path to the background image
	 * @param title			The title to display
	 * @param isBackButton	Whether there is a back button or not
	 * @param primaryStage	A reference to the program Stage
	 * @param backScene		A reference to which scene the back button will go
	 */
	public SceneCreator(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene){
		System.out.println("Constructing Scene");
		this.choices = choices;
		this.bgPath = bgPath;
		this.title = title;
		this.isBackButton = isBackButton;
		this.primaryStage = primaryStage;
		this.backScene = backScene;
	}
	
	/**
	 * This function constructs the scene
	 * 
	 * @return	A constructed Scene with minimal functionality
	 */
	public Scene constructScene(){
		masterStackPane = new StackPane();
		
		masterStackPane.getChildren().add(setImageBG());
		masterStackPane.getChildren().add(setTextTitle());
		
		if(isBackButton){
			Pane backButtonPane = new Pane();
			Button backButton = new Button();
			backButton.setText("Back");
			backButtonPane.getChildren().add(backButton);
			backButtonPane.setTranslateX(10);
			backButtonPane.setTranslateY(GAME_HEIGHT - 35); 
			masterStackPane.getChildren().add(backButtonPane);
			choiceConstructor();
			
			backButton.setOnMouseClicked(e -> {
				System.out.println("Pushed");
				primaryStage.setScene(backScene);
			});
		}
		
		constructedScene = new Scene(masterStackPane, GAME_WIDTH, GAME_HEIGHT);
		return constructedScene;
	}	
	
	private void choiceConstructor(){
		
		VBox choices = new VBox();
		choices.setPadding(new Insets(10, 10, 10, 10));
		choices.setSpacing(10);
		
		Button[] buttons = new Button[this.choices.length];
		
		for(int i = 0; i < buttons.length; i++){
			buttons[i] = new Button();
			buttons[i].setText(this.choices[i]);
			buttons[i].setMaxSize(GAME_WIDTH / 3, GAME_HEIGHT / 3);
			choices.getChildren().add(buttons[i]);
		}
		
		System.out.println(choices.getBoundsInLocal());
		System.out.println(choices.getBoundsInParent());
		System.out.println(choices.getLayoutBounds());
		
		choices.setAlignment(Pos.CENTER);
		choices.setMaxSize(GAME_WIDTH / 3, GAME_HEIGHT / 3);
		
		//Scene scene = new Scene(choices);
		//primaryStage.setScene(scene);
		masterStackPane.getChildren().add(choices);
	}
	
	/**
	 * This function sets up the image to be added to the scene
	 * 
	 * @return	Formatted ImageView object to be added to the scene
	 */
	private ImageView setImageBG(){
		Image image = new Image(bgPath, GAME_WIDTH, GAME_HEIGHT, false, false);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		return imageView;
	}
	
	/**
	 * This function sets up the Text to be added to the scene
	 * 
	 * @return	Formatted Text object to be added to the scene
	 */
	private StackPane setTextTitle(){
		
		StackPane textTitle = new StackPane();
		textTitle.setAlignment(Pos.TOP_CENTER);
		textTitle.setTranslateY(10);
		
		Text title = new Text();
		title.setText(this.title);
		title.setFill(Color.BLACK);
		title.setFont(Font.font("Mistral", FontWeight.BOLD, 32));
		
		textTitle.getChildren().add(title);
		
		return textTitle;
	}
	
	public String toString(){
		System.out.println("Scene: " + title + " contains " + choices.length + " choices.");
		return "Scene: " + title + " contains " + choices.length + " choices.";
	}
}
