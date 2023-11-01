package view;

import javax.swing.*;

import controller.KeyboardInputs;
import model.memento.Caretaker;
import model.memento.OriginatorPlayer;

import java.awt.*;

public class GamePanel extends JPanel {
	private OriginatorPlayer player; 
    private Caretaker caretaker; 

    private ImageIcon backgroundImage = new ImageIcon("src\\assets\\background.png"); // Agrega una imagen de fondo


	public GamePanel(OriginatorPlayer player, Caretaker caretaker) {
        this.player = player; 
        this.caretaker = caretaker;
        addKeyListener(new KeyboardInputs(this, player, caretaker));
        initializePanel();
    }

    private void initializePanel() {
        setPreferredSize(new Dimension(1200, 700));
        setBackground(Color.BLACK); 
    }

    public void setPlayer(OriginatorPlayer player) {
        this.player = player;
    }

	private int backgroundOffset = 0; // Variable para controlar el desplazamiento del fondo

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawBackground(g);
        drawPlayer(g);
        repaint();
    }

    private void drawBackground(Graphics g) {
        if (backgroundImage != null) {
            int panelWidth = getWidth();
            int panelHeight = getHeight();

            int bgWidth = backgroundImage.getIconWidth();
            int bgHeight = backgroundImage.getIconHeight();

            int newBgWidth = panelWidth;
            int newBgHeight = (int) (1.0 * bgHeight * panelWidth / bgWidth);

            // Ajusta la posición del fondo si el jugador llega a la mitad del panel
            if (player != null && player.getPlayerLocation().y >= getHeight() / 2) {
                backgroundOffset = player.getPlayerLocation().y - getHeight() / 2;
            }

            // Dibuja el fondo con el ajuste de posición (backgroundOffset)
            g.drawImage(backgroundImage.getImage(), 0, -backgroundOffset, panelWidth, newBgHeight - backgroundOffset, null);
        }
    }

    private void drawPlayer(Graphics g) {
        if (player != null && player.getSprite() != null) {
            int newPlayerWidth = 75; // Nueva anchura del jugador en píxeles
            int newPlayerHeight = 75; // Nueva altura del jugador en píxeles

            Image scaledPlayerImage = player.getSprite().getImage().getScaledInstance(newPlayerWidth, newPlayerHeight, Image.SCALE_DEFAULT);
            ImageIcon scaledPlayerIcon = new ImageIcon(scaledPlayerImage);

            int playerY = player.getPlayerLocation().y - backgroundOffset; // Ajusta la posición del jugador según el desplazamiento del fondo

            scaledPlayerIcon.paintIcon(this, g, player.getPlayerLocation().x, playerY);
        }
    }



    
}

