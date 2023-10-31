package main;

import view.GameMainPanel;
import view.GameWindow;

public class launcher {
	
	private GameWindow gameWindow;
	private GameMainPanel gamePanel;
	
	public  launcher() {
		gamePanel = new GameMainPanel();
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();
	}
	
	public static void main(String[] args) {
		new launcher();
	}

}
