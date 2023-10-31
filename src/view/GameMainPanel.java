package view;

import javax.swing.*;

import controller.KeyboardInputs;

import java.awt.*;

public class GameMainPanel extends JPanel {
	

	public GameMainPanel() {
        initializePanel();
    }

    private void initializePanel() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK); // Cambia el color de fondo según tus necesidades
    }


	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}
}

