package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.GameMainPanel;


public class KeyboardInputs implements KeyListener {

	private GameMainPanel gameMainPanel;

	public KeyboardInputs(GameMainPanel gameMainPanel) {
		this.gameMainPanel = gameMainPanel;
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
			System.out.println("W");
			break;
		case KeyEvent.VK_A:
			System.out.println("A");
			break;
		case KeyEvent.VK_S:
			System.out.println("S");
			break;
		case KeyEvent.VK_D:
			System.out.println("D");
			break;
		}

	}

}
