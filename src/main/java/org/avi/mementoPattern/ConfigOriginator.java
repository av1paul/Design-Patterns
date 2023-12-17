package org.avi.mementoPattern;

public class ConfigOriginator {
    private int length;
    private int width;

    public ConfigOriginator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ConfigMemento createMemento() {
        return new ConfigMemento(length, width);
    }

    public void restoreMemento(ConfigMemento memento) {
        if(memento == null) {
            return;
        }
        length = memento.getLength();
        width = memento.getWidth();
    }

    @Override
    public String toString() {
        return "ConfigOriginator{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
