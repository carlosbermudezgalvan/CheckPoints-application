package model.memento;

import java.awt.Point;

import javax.swing.ImageIcon;

public class OriginatorPlayer {
    private Point playerLocation; 
    private ImageIcon sprite; 

    public OriginatorPlayer(Point playerLocation, ImageIcon sprite) {
        this.playerLocation = playerLocation;
        this.sprite = sprite;
    }

    public Point getPlayerLocation() {
        return playerLocation;
    }

    public ImageIcon getSprite() {
        return sprite;
    }

    public void moveUp() {
        playerLocation.translate(0, -10); 
    }

    public void moveDown() {
        playerLocation.translate(0, 10); 
    }

    public void moveLeft() {
        playerLocation.translate(-10, 0); 
    }

    public void moveRight() {
        playerLocation.translate(10, 0); 
    }

    public Memento createMemento() {
        return new Memento(new Point(this.playerLocation));
    }
    public void restoreFromMemento(Memento memento) {
        this.playerLocation = new Point(memento.getPlayerLocation());
    }
}

