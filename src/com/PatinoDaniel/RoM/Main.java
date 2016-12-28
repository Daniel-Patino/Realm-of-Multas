package com.PatinoDaniel.RoM;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class Main extends Application {
	
	public static final String GAME_TITLE = "Realm of Multas";
	public static final int GAME_WIDTH = 760;
	public static final int GAME_HEIGHT = 640;
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene_Title OpenScene = new Scene_Title();
			Scene_Main MainScene = new Scene_Main();
			
			Scene OpenSc = OpenScene.Title(primaryStage);
			
			primaryStage.setTitle(GAME_TITLE);
			primaryStage.setScene(OpenSc);			
			primaryStage.show();
			
			OpenSc.setOnMouseClicked(e -> {
				System.out.println("Pressed");
				Player newPlayer = new Player(100, 100, 100);
				
				Scene MainSc = MainScene.Title(primaryStage, newPlayer);
				
				primaryStage.setScene(MainSc);
				primaryStage.show();			
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Scene TrashScene(){
		StackPane root = new StackPane();
		Text FILLER = new Text();
		FILLER.setText("FILLER");
		FILLER.setFill(Color.BLACK);
		FILLER.setFont(Font.font("Mistral", FontWeight.BOLD, 32));
		FILLER.setTextAlignment(TextAlignment.CENTER);
		root.getChildren().add(FILLER);
		
		Scene scene = new Scene(root, 760, 640);
		return scene;
	}
}
