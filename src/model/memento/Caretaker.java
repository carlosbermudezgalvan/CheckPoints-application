package model.memento;

import java.util.Stack;

public class Caretaker {
    private OriginatorPlayer originatorPlayer;
    private Stack<Memento> history;

    public Caretaker(OriginatorPlayer originatorPlayer) {
        this.originatorPlayer = originatorPlayer;
        this.history = new Stack<>();
    }

    public void addCheckpoint() {
        // Crea un memento a partir del estado actual del jugador y lo agrega a la pila
        Memento checkpoint = originatorPlayer.createMemento();
        history.push(checkpoint);
    }

    public void undo() {
        if (!history.isEmpty()) {
            // Obtiene el memento más reciente de la pila y lo restaura en el jugador
            Memento previousState = history.pop();
            originatorPlayer.restoreFromMemento(previousState);
        }
    }
}

