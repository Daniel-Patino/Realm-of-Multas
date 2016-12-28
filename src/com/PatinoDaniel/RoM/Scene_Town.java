package com.PatinoDaniel.RoM;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Scene_Town extends SceneCreator{
	
	public Scene_Town(String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene, boolean isUserInter) {
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
		return null;
	}
}
