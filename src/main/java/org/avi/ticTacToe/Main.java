package org.avi.ticTacToe;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        String result = game.startGame();
        System.out.println(result);
    }
}
