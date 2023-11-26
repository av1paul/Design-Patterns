package org.avi.ticTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final int size;
    private final PlayingPiece[][] board;

    public int getSize() {
        return size;
    }

    public PlayingPiece[][] getBoard() {
        return board;
    }

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(0 > row || row >= size || 0 > col || col >= size || board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public List<int[]> getEmptyCells() {
        List<int[]> emptyCells = new ArrayList<>();
        for(int i = 0; i < size; i ++) {
            for(int j = 0; j < size; j ++) {
                if(board[i][j] == null) {
                    emptyCells.add(new int[]{i, j});
                }
            }
        }
        return emptyCells;
    }

    public void printBoard() {
        for(int i = 0; i < size; i ++) {
            System.out.print(" |");
            for(int j =  0; j < size; j ++) {
                if(board[i][j] != null) {
                    System.out.print(" " + board[i][j].getPieceType().name() + " ");
                } else {
                    System.out.print("   ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
