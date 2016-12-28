package com.PatinoDaniel.RoM;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Scene_Keep extends SceneCreator {

	public Scene_Keep(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene, boolean isUserInter) {
		super(choices, bgPath, title, isBackButton, primaryStage, backScene, isUserInter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Scene customButtons(Stage primaryStage, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Scene customEvents(Stage primaryStage, Player player) {
		// TODO Auto-generated method stub
		Scene scene = constructedScene;
		VBox toBox = (VBox) masterStackPane.getChildren().get(3);
		
		System.out.println(masterStackPane.getChildren().get(3));
		System.out.println(masterStackPane.getChildren().get(2));
		System.out.println(masterStackPane.getChildren().get(1));
		System.out.println(masterStackPane.getChildren().get(0));
		
		toBox.getChildren().get(0).setOnMouseClicked(e ->{
			player.setGold(player.getGold() + 50);
			player.setHealth(player.getHealth() + 25);
			StringProperty x = new SimpleStringProperty("Health: " + player.getHealth() + " Gold: " + player.getGold());
			userGUI.toDisplay.textProperty().bind(x);
			primaryStage.setScene(this.customEvents(primaryStage, player));
			System.out.println("Pressed");
		});
		
		return scene;
	}
}
