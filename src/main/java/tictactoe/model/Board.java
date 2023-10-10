package tictactoe.model;

import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private Integer size;

    public Board(int dimension) {
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
    public Integer getSize() {
        return this.board.size();
    }


}
