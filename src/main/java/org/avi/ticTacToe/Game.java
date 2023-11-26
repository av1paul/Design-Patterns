package org.avi.ticTacToe;

import org.avi.ticTacToe.Model.*;

import java.util.*;

public class Game {

    private Deque<Player> players;
    private Board board;

    public String startGame() {
        initializeGame();
        Scanner in = new Scanner(System.in);
        boolean gameOn = true;
        while (gameOn) {
            Player turnPlayer = players.pollFirst();

            board.printBoard();
            List<int[]> emptyCells = board.getEmptyCells();
            if(emptyCells.isEmpty()) {
                gameOn = false;
                continue;
            }

            System.out.print("Player: " + turnPlayer.getName() + ", Enter row, column: ");
            String input = in.nextLine();
            String[] values = input.split(",");
            int row = Integer.parseInt(values[0].trim()), col = Integer.parseInt(values[1].trim());

            boolean piecePlaced = board.addPiece(row, col, turnPlayer.getPlayingPiece());
            if(!piecePlaced) {
                System.out.println("Incorrect position. Try again");
                players.addFirst(turnPlayer);
                continue;
            }
            players.addLast(turnPlayer);
            boolean hasWinner = isThereAWinner(row, col, turnPlayer.getPlayingPiece().getPieceType());
            if(hasWinner) {
                return turnPlayer.getName() + " wins!!";
            }
        }
        return "Tie:";
    }

    private void initializeGame() {
        players = new ArrayDeque<>();
        PlayingPiece pieceX = new PlayingPieceX();
        PlayingPiece pieceO = new PlayingPieceO();
        Player player1 = new Player("Player1", pieceX);
        Player player2 = new Player("Player2", pieceO);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    private boolean isThereAWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true, colMatch = true, diagonalMatch = true, antiDiagonalMatch = true;
        for(int j = 0; j < board.getSize(); j ++) {
            if(board.getBoard()[row][j] == null || board.getBoard()[row][j].getPieceType() != pieceType) {
                rowMatch = false;
                break;
            }
        }
        for(int i = 0; i < board.getSize(); i ++) {
            if(board.getBoard()[i][col] == null || board.getBoard()[i][col].getPieceType() != pieceType) {
                colMatch = false;
                break;
            }
        }
        for(int i = 0, j = 0; i < board.getSize(); i ++, j ++) {
            if(board.getBoard()[i][j] == null || board.getBoard()[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
                break;
            }
        }
        for(int i = 0, j = board.getSize() - 1; i < board.getSize(); i ++, j --) {
            if(board.getBoard()[i][j] == null || board.getBoard()[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }
        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}
