package com.PatinoDaniel.RoM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Scene_Main extends SceneCreator{
	
	public Scene_Main(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene, boolean isUserInter) {
		super(choices, bgPath, title, isBackButton, primaryStage, backScene, isUserInter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Scene customEvents(Stage primaryStage, Player player){
		
		Scene scene = constructedScene;
		Pane destinationButtons = new Pane();

		scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		
		Button keepButton = buttonCreator("KEEP", 75, 50, 190, 120);
		Button wildernessButton = buttonCreator("WILDERNESS", 75, 50, 200, 200);
		Button townButton = buttonCreator("TOWN", 75, 50, 120, 60);
		Button addMoney = buttonCreator("MONEY+", 75, 50, 500, 500);
		
		wildernessButton.setId("wilderness");
		
		destinationButtons.getChildren().add(keepButton);
		destinationButtons.getChildren().add(wildernessButton);
		destinationButtons.getChildren().add(townButton);
		destinationButtons.getChildren().add(addMoney);
		
		masterStackPane.getChildren().add(destinationButtons);

		addMoney.setOnMouseClicked(e -> {
			player.setGold(player.getGold() + 50);
			player.setHealth(player.getHealth() + 25);
			StringProperty x = new SimpleStringProperty("Health: " + player.getHealth() + " Gold: " + player.getGold());
			userGUI.toDisplay.textProperty().bind(x);
			primaryStage.setScene(this.customEvents(primaryStage, player));
		});
		
		keepButton.setOnMouseClicked(e -> {
			String[] choices = {"+MONEY", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			
			Scene_Keep KeepScene = new Scene_Keep(choices, "file:Assets/castle-1821609_960_720.jpg",
					"Keep", true, primaryStage, scene, true);
			Scene KeepSc = KeepScene.constructScene(player);
			KeepScene.customEvents(primaryStage, player);
			primaryStage.setScene(KeepSc);
			System.out.println("KEEP");
		});
		
		wildernessButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER"};
			Scene_Town WildernessScene = new Scene_Town(choices, "file:Assets/Iceberg-Lake-Mount-Baker-Wilderness-Washington.jpg",
					"Wilderness", true, primaryStage, scene, false);
			Scene WildSc = WildernessScene.constructScene(player);
			primaryStage.setScene(WildSc);

			System.out.println("WILDERNESS");
		});
		
		townButton.setOnMouseClicked(e -> {
			String[] choices = {"FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER", "FILLER"};
			Scene_Town TownScene = new Scene_Town(choices, "file:Assets/906741-town-wallpaper.jpg",
					"Town",	true, primaryStage, scene, false);
			Scene TownSc = TownScene.constructScene(player);
			primaryStage.setScene(TownSc);
			System.out.println("TOWN");
		});
		
		return scene;
	}
	
	@Override
	public Scene customButtons(Stage primaryStage, Player player) {
		// TODO Auto-generated method stub
		return null;
	}
}
