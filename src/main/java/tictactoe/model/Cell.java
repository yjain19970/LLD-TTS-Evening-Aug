package tictactoe.model;

import tictactoe.model.types.CellState;

public class Cell {
    private Integer row;
    private Integer col;
    private CellState cellState; // state
    private Player player;

    public Cell(Integer row, Integer col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }

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

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void display() {
        if(cellState.equals(CellState.EMPTY)){
            System.out.println("| - |");
        }else{
            System.out.printf("| " + this.getPlayer()
                    .getSymbol().getPlayerSymbol() + " |"); // | X |
        }
    }
}
