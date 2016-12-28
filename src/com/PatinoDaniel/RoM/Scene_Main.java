package com.PatinoDaniel.RoM;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene_Main extends Main{
	
	public Scene Title(Stage primaryStage, Player player){
		
		StackPane root = new StackPane();
		Pane destinationButtons = new Pane();
		
		Button keepButton = buttonCreator("KEEP", 50, 50, GAME_WIDTH/2, 120);
		Button wildernessButton = buttonCreator("WILDERNESS", 50, 50, GAME_WIDTH/3, 120);
		Button townButton = buttonCreator("TOWN", 50, 50, GAME_WIDTH/4, 120);
		
		destinationButtons.getChildren().add(keepButton);
		destinationButtons.getChildren().add(wildernessButton);
		destinationButtons.getChildren().add(townButton);
		
		GUI gui = new GUI();
		Text toGui = gui.Display(player);
		
		root.getChildren().add(titleImageLoad("file:Assets/download.png"));
		root.getChildren().add(destinationButtons);
		root.getChildren().add(toGui);
		
		
		Scene scene = new Scene(root, GAME_WIDTH, GAME_HEIGHT);

		scene.getStylesheets();
		keepButton.setOnMouseClicked(e -> {
			
			String[] choices = {"a", "b", "c"};
			Scene_Keep KeepScene = new Scene_Keep(choices, "file:Assets/download.png", "Keep", true, primaryStage, this.Title(primaryStage, player));
			Scene KeepSc = KeepScene.constructScene();
			primaryStage.setScene(KeepSc);
			primaryStage.show();
			
			System.out.println("KEEP");
		});
		
		wildernessButton.setOnMouseClicked(e -> {
			String[] choices = {"a", "b", "c"};
			Scene_Town WildernessScene = new Scene_Town(choices, "file:Assets/download.png", "Wilderness", true, primaryStage, this.Title(primaryStage, player));
			Scene WildSc = WildernessScene.constructScene();
			primaryStage.setScene(WildSc);
			primaryStage.show();

			System.out.println("WILDERNESS");
		});
		
		townButton.setOnMouseClicked(e -> {
			String[] choices = {"a", "b", "c"};
			Scene_Town TownScene = new Scene_Town(choices, "file:Assets/download.png", "Town", true, primaryStage, this.Title(primaryStage, player));
			Scene TownSc = TownScene.constructScene();
			primaryStage.setScene(TownSc);
			primaryStage.show();
			System.out.println("TOWN");
		});
		
		return scene;
	}
	
	public Button buttonCreator(String title, int width, int height, double xCoord, double yCoord){
		
		Button customButton = new Button(title);
		customButton.setPrefSize(width, height);
		customButton.setTranslateX(xCoord);
		customButton.setTranslateY(yCoord);
		
		return customButton;
	}
	
	public ImageView titleImageLoad(String directory){
		Image image = new Image(directory, GAME_WIDTH, GAME_HEIGHT, false, false);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		return imageView;
	}
	
	public void openScene(Stage primaryStage, Scene sceneToOpen){
		primaryStage.setScene(sceneToOpen);
		primaryStage.show();
	}
}
