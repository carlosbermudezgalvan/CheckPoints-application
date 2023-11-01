package main;

import model.memento.Caretaker;
import model.memento.OriginatorPlayer;
import view.GamePanel;
import view.GameWindow;

import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.io.File;
import java.io.IOException;

public class Game {

    private GameWindow gameWindow;
	private GamePanel gamePanel;
	private OriginatorPlayer player;
	private Caretaker caretaker; 



    public Game() {
		initializePlayer();
		caretaker = new Caretaker(player);
		gamePanel = new GamePanel(player, caretaker);
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();

		caretaker = new Caretaker(player);

	}

	private void initializePlayer() {
        // Cargar el sprite del jugador
        ImageIcon playerIcon = new ImageIcon("src\\assets\\teletubbyBAD.png");

        // Crear jugador
        player = new OriginatorPlayer(new Point(100, 100), playerIcon);
    }

    
}
