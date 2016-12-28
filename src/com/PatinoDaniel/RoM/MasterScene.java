package com.PatinoDaniel.RoM;

import java.util.HashMap;

import javafx.stage.Stage;

/**
 * All scenes need to have a single point of reference for all data, this is a limitation of JavaFX
 * Therefore this class will store the data required to build the scene using the scene creator class
 * as well as the all pertinent data in the game
 * 
 * @author Dsp02_000
 *
 */


public class MasterScene{
	
	Stage primaryStage;
	
	public MasterScene(Stage primaryStage){
		this.primaryStage = primaryStage;
	}
	
	public void SceneDataBase(){
		
		HashMap<String, String[]> dataSet = new HashMap<>();
		
		// String[] choices, String bgPath, String title, boolean isBackButton, Stage primaryStage, Scene backScene, GUI status...
		
		String[] MainSceneData = {null, "file:Assets/download.png", "Main", "false", "primaryStage", "null"};
		dataSet.put("Main", MainSceneData);
		
	}
}
