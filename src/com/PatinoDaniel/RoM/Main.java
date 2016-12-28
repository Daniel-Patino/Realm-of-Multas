package com.PatinoDaniel.RoM;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
	
	public static final String GAME_TITLE = "Realm of Multas";
	public static final int GAME_WIDTH = 760;
	public static final int GAME_HEIGHT = 640;
	@Override
	public void start(Stage primaryStage) {
		try {
			Scene_Title OpenScene = new Scene_Title();
			Scene OpenSc = OpenScene.Title(primaryStage);
			
			primaryStage.setTitle(GAME_TITLE);
			primaryStage.setScene(OpenSc);	
			primaryStage.setResizable(true);
			primaryStage.show();
			
			OpenSc.setOnMouseClicked(e -> {
				System.out.println("Pressed");
				Player newPlayer = new Player(100, 100, 100);

				Scene_Main MainScene = new Scene_Main(null, "file:Assets/download.png", "Main", false, primaryStage, null);
				Scene MainSc = MainScene.constructScene();
				MainSc = MainScene.customEvents(primaryStage, newPlayer);
				
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
}
