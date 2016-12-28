package com.PatinoDaniel.RoM;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Scene_Town extends SceneManager{
	
	public Scene_Town(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene) {
		super(choices, bgPath, title, isBackButton, primaryStage, backScene);
		// TODO Auto-generated constructor stub
	}
	
	public Scene addMore(){
		
		Scene withMore = constructScene();
		
		Pane toTest = new Pane();
		Button backButton = new Button();
		backButton.setText("Back");
		toTest.getChildren().add(backButton);
		masterStackPane.getChildren().add(toTest);
		
		return withMore;
	}
}
