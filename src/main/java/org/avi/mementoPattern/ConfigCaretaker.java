package org.avi.mementoPattern;

import java.util.Stack;

public class ConfigCaretaker {

    private Stack<ConfigMemento> history;

    public ConfigCaretaker() {
        history = new Stack<>();
    }

    public void addMemento(ConfigMemento memento) {
        history.push(memento);
    }

    public ConfigMemento undo() {
        if(history.isEmpty()) {
            return null;
        }
        return history.pop();
    }
}
