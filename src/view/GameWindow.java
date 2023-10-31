package view;

import javax.swing.*;

public class GameWindow extends JFrame {
	
    public GameWindow(GameMainPanel gamePanel) {
    	
        setTitle("Mi Juego");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(gamePanel);
        
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);    
        
    }

  

   
    
}

