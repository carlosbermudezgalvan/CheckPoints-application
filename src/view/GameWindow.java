package view;

import javax.swing.*;

public class GameWindow extends JFrame {
	
    public GameWindow(GamePanel gamePanel) {
    	
        setTitle("Mi Juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(gamePanel);
        pack(); // Ajusta el tamaño del JFrame según su contenido
        
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);    
        
    }

  

   
    
}

