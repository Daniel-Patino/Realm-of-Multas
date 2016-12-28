package com.PatinoDaniel.RoM;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Scene_Title extends Main{
	
	public Scene Title(Stage titleStage){
		StackPane root = new StackPane();
		root.getChildren().add(titleImageLoad("file:Assets/download.png"));
		root.getChildren().add(titleTextCharacteristics(96));
		
		Pane toStart = new Pane();
		toStart.getChildren().addAll(root, clickToStart("Click to Start!"));
		
		Scene scene = new Scene(toStart, GAME_WIDTH, GAME_HEIGHT);
		
		return scene;
	}
	
	public BoxBlur blurFX(int intensity){
		BoxBlur bb = new BoxBlur();
		bb.setWidth(intensity);
		bb.setHeight(intensity);
		bb.setIterations(3);
		return bb;
	}
	
	public ImageView titleImageLoad(String directory){
		Image image = new Image(directory, GAME_WIDTH, GAME_HEIGHT, false, false);
		ImageView imageView = new ImageView();
		imageView.setImage(image);
		imageView.setEffect(blurFX(7));
		return imageView;
	}
	
	public Text titleTextCharacteristics(int fontSize){
		Text titleText = new Text();
		titleText.setText(GAME_TITLE);
		titleText.setFill(Color.BLACK);
		titleText.setFont(Font.font("Mistral", FontWeight.BOLD, fontSize));
		titleText.setTextAlignment(TextAlignment.CENTER);
		return titleText;
	}
	
	public Text clickToStart(String text){
		Text toFade = new Text();
		toFade.setText(text);
		toFade.setFill(Color.BLACK);
		toFade.setFont(Font.font("Mistral", FontWeight.BOLD, 24));
		toFade.setX((GAME_WIDTH / 2) - toFade.getLayoutBounds().getMaxX() / 2);
		toFade.setY(GAME_HEIGHT - 100); 
		
		FadeTransition ft = new FadeTransition(Duration.millis(1500), toFade);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		return toFade;
	}
}
