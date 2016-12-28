package com.PatinoDaniel.RoM;

import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class GUI{
	
	public Text toDisplay;
	
	/**
	 * This function will create a User Interface with data acquired from the Player Class
	 * 
	 * @param playerData
	 * @return
	 */
	public StackPane userInterface(Player playerData){
		
		StackPane userData = new StackPane();
		userData.setAlignment(Pos.TOP_LEFT);
		userData.setTranslateX(10);
		userData.setTranslateY(10);
		
		toDisplay = new Text();
		toDisplay.setFont(Font.font("Mistral", FontWeight.BOLD, 28));
		toDisplay.setTextAlignment(TextAlignment.CENTER);
		
		toDisplay.setText("Health: " + playerData.getHealth() + " Gold: " + playerData.getGold());
		
		userData.getChildren().add(toDisplay);
		
		return userData;
	}
}
