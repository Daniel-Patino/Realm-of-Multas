package com.PatinoDaniel.RoM;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scene_Main extends SceneCreator{
	
	public Scene_Main(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene) {
		super(choices, bgPath, title, isBackButton, primaryStage, backScene);
		// TODO Auto-generated constructor stub
	}

	public Scene customEvents(Stage primaryStage, Player player){
		
		Scene scene = constructedScene;
		Pane destinationButtons = new Pane();
		
		Button keepButton = buttonCreator("KEEP", 50, 50, GAME_WIDTH/2, 120);
		Button wildernessButton = buttonCreator("WILDERNESS", 50, 50, GAME_WIDTH/3, 120);
		Button townButton = buttonCreator("TOWN", 50, 50, GAME_WIDTH/4, 120);
		
		destinationButtons.getChildren().add(keepButton);
		destinationButtons.getChildren().add(wildernessButton);
		destinationButtons.getChildren().add(townButton);
		
		masterStackPane.getChildren().add(destinationButtons);
		
		keepButton.setOnMouseClicked(e -> {
			
			String[] choices = {"FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			Scene_Keep KeepScene = new Scene_Keep(choices, "file:Assets/castle-1821609_960_720.jpg",
					"Keep", true, primaryStage, this.customEvents(primaryStage, player));
			Scene KeepSc = KeepScene.constructScene();
			primaryStage.setScene(KeepSc);
			
			System.out.println("KEEP");
		});
		
		wildernessButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER"};
			Scene_Town WildernessScene = new Scene_Town(choices, "file:Assets/download.png", "Wilderness",
					true, primaryStage, this.customEvents(primaryStage, player));
			Scene WildSc = WildernessScene.constructScene();
			primaryStage.setScene(WildSc);

			System.out.println("WILDERNESS");
		});
		
		townButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			Scene_Town TownScene = new Scene_Town(choices, "file:Assets/download.png", "Town",
					true, primaryStage, this.customEvents(primaryStage, player));
			Scene TownSc = TownScene.constructScene();
			primaryStage.setScene(TownSc);

			System.out.println("TOWN");
		});
		
		return scene;
	}
	
	@Override
	public Scene customButtons() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * DEAD DEAD, ONLY FOR REFERENCE
	 * @param primaryStage
	 * @param player
	 * @return
	 */
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
		
		//root.getChildren().add(titleImageLoad("file:Assets/download.png"));
		root.getChildren().add(destinationButtons);
		root.getChildren().add(toGui);
		
		
		Scene scene = new Scene(root, GAME_WIDTH, GAME_HEIGHT);

		scene.getStylesheets();
		keepButton.setOnMouseClicked(e -> {
			
			String[] choices = {"FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			Scene_Keep KeepScene = new Scene_Keep(choices, "file:Assets/castle-1821609_960_720.jpg",
					"Keep", true, primaryStage, this.Title(primaryStage, player));
			Scene KeepSc = KeepScene.constructScene();
			primaryStage.setScene(KeepSc);
			
			System.out.println("KEEP");
		});
		
		wildernessButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER"};
			Scene_Town WildernessScene = new Scene_Town(choices, "file:Assets/download.png", "Wilderness",
					true, primaryStage, this.Title(primaryStage, player));
			Scene WildSc = WildernessScene.constructScene();
			primaryStage.setScene(WildSc);

			System.out.println("WILDERNESS");
		});
		
		townButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			Scene_Town TownScene = new Scene_Town(choices, "file:Assets/download.png", "Town",
					true, primaryStage, this.Title(primaryStage, player));
			Scene TownSc = TownScene.constructScene();
			primaryStage.setScene(TownSc);

			System.out.println("TOWN");
		});
		
		return scene;
	}
}
