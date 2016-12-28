package com.PatinoDaniel.RoM;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class GUI{
	
	public Text Display(Player playerData){
		Text toDisplay = new Text();
		toDisplay.setText("Health: " + playerData.getHealth() + " Gold: " + playerData.getGold());
		toDisplay.setFill(Color.BLACK);
		toDisplay.setFont(Font.font("Mistral", FontWeight.BOLD, 28));
		toDisplay.setTextAlignment(TextAlignment.CENTER);
		return toDisplay;
	}
}
