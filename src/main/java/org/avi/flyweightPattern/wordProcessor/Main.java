package org.avi.flyweightPattern.wordProcessor;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        ILetter a = characterFactory.createLetter('a');
        a.display(1, 3);
        ILetter a2 = characterFactory.createLetter('a');
        a2.display(1, 5);

    }
}
