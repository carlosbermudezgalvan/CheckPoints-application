package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.memento.Caretaker;
import model.memento.Memento;
import model.memento.OriginatorPlayer;
import view.GamePanel;


public class KeyboardInputs implements KeyListener {

	private GamePanel gameMainPanel;
	private OriginatorPlayer player;
	private Caretaker caretaker;


	public KeyboardInputs(GamePanel gamePanel, OriginatorPlayer player, Caretaker caretaker) {
        this.gameMainPanel = gamePanel;
        this.player = player;
        this.caretaker = caretaker;
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                player.moveUp(); // Llama al método de movimiento apropiado
                break;
            case KeyEvent.VK_A:
                player.moveLeft();
                break;
            case KeyEvent.VK_S:
                player.moveDown();
                break;
            case KeyEvent.VK_D:
                player.moveRight();
                break;
			case KeyEvent.VK_C:
                // Guardar un checkpoint (Memento)
                caretaker.addCheckpoint();
                break;
            case KeyEvent.VK_Z:
                // Deshacer (restaurar desde el último checkpoint)
               	caretaker.undo();
                break;
        }

	}

}
