package org.avi.mementoPattern;

public class Main {
    public static void main(String[] args) {
        ConfigCaretaker configCaretaker = new ConfigCaretaker();
        ConfigOriginator config = new ConfigOriginator(10, 20);
        ConfigMemento snapShot1 =  config.createMemento();
        configCaretaker.addMemento(snapShot1);
        config.setLength(20);
        config.setWidth(30);
        System.out.println(config);
        config.restoreMemento(configCaretaker.undo());
        System.out.println(config);
    }
}
