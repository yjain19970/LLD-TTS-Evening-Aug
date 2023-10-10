package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;

public class ColumnGameWinStrategy implements GameWinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
