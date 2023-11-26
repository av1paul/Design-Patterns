package org.avi.factoryPattern;

public class ShapeFactory {

    public Shape getShape(String shapeName) {
        switch (shapeName) {
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
        }
        return null;
    }
}
