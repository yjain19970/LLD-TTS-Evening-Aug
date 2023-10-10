package tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private Integer size;

    public Board(int dimension) {
        board = new ArrayList<>();
        for(int i=0;i<dimension;i++){
            board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
    public Integer getSize() {
        return this.board.size();
    }


    public void printBoard() {
        /**
         *   C1 C2 C3   R1
         *   C4 C5 C6   R2
         *   C7 C8 C9   R3
         */
        for (List<Cell> row: board) {
            for (Cell cell: row) {
                cell.display();
            }
            System.out.print("\n");
        }
    }
}
