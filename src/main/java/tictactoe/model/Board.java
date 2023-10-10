package tictactoe.model;

import java.util.List;

public class Board {
    List<List<Cell>> cells;
    Integer size;

    public List<List<Cell>> getCells() {
        return cells;
    }
    public Integer getSize() {
        return size;
    }


}
