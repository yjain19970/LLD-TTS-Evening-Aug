package tictactoe.model;

import tictactoe.model.types.CellState;

public class Cell {
    private Integer row;
    private Integer col;
    private CellState cellState; // state.
    private Player player;

    public Integer getRow() {
        return row;
    }

    public Integer getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }
}
