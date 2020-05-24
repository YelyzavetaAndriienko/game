package view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameViewManager {
	
	private AnchorPane gamePane;
	private Scene gameScene;
	private Stage gameStage;
	private Stage menuStage;
	private final static int GAME_HEIGHT = 600;
	private final static int GAME_WIDTH = 800;
	
	
	public GameViewManager() {
		initializeStage();
		createKeyListeners();
	}
	
	private void createKeyListeners() {
		gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
    		@Override
    		public void handle(KeyEvent event) {
    		if(event.getCode()==KeyCode.LEFT) {
    			
    		}else if(event.getCode()==KeyCode.RIGHT) {
    			
    		}
    		}
    	});
		
		gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
    		@Override
    		public void handle(KeyEvent event) {
    		if(event.getCode()==KeyCode.LEFT) {
    			
    		}else if(event.getCode()==KeyCode.RIGHT) {
    			
    		}
    		}
    	});
		
	}
	
	private void initializeStage() {
		gamePane = new AnchorPane();
		gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT);
		gameStage = new Stage();
		gameStage.setScene(gameScene);
		
	}
	
	public void createNewGame(Stage menuStage) {
		this.menuStage = menuStage;
		this.menuStage.hide();
		gameStage.show();
}
}
