package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

public interface GameWinningStrategy {
    // ROW
    //COL
    //DIAG

    boolean checkWinner(Board board, Move move);
}
