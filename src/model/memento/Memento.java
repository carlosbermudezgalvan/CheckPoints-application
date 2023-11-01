package model.memento;

import java.awt.Point;

import javax.swing.ImageIcon;

public class Memento {
    private Point playerLocation;

    public Memento(Point playerLocation) {
        this.playerLocation = playerLocation;
    }

    public Point getPlayerLocation() {
        return playerLocation;
    }

    


    
}