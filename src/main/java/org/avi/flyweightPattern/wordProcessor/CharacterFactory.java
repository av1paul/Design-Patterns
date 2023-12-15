package org.avi.flyweightPattern.wordProcessor;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    // One object for all letters 'a' and so on
    private static Map<Character, ILetter> cache = new HashMap<>();

    public ILetter createLetter(char character) {
        if(cache.containsKey(character)) {
            return cache.get(character);
        } else {
            ILetter letter = new DocumentCharacter(character, "Ariel", 10);
            cache.put(character, letter);
            return letter;
        }
    }
}
