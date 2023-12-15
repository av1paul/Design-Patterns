package org.avi.flyweightPattern.wordProcessor;

public class DocumentCharacter implements ILetter {

    private Character character;
    private String fontType;
    private int fontSize;

    public DocumentCharacter(Character character, String fontType, int fontSize) {
        this.character = character;
        this.fontType = fontType;
        this.fontSize = fontSize;
    }

    @Override
    public void display(int row, int col) {
        System.out.println("Displaying letter " + character + " at (" + row + ", " +  col + ")");
    }
}
