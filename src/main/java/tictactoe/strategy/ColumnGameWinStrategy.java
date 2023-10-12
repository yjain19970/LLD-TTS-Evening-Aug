package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Player;
import tictactoe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnGameWinStrategy implements GameWinningStrategy{
    private final Map<Integer, HashMap<Symbol, Integer>> colCountMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        /**
         * {
         * C1 -> {'X' -> 3, '0' -> 0}
         * C2 ->    {'X' -> 1, '0' -> 1}
         * --> C3 -> {'X' -> 0, '0' -> 0}
         *}
         */

        int col = move.getCell().getCol();
        Symbol playerSymbol = move.getPlayer().getSymbol();

        if(!colCountMap.containsKey(col)){
            colCountMap.put(col, new HashMap<>());
        }

        Map<Symbol,Integer> symbolMap = colCountMap.get(col);

        if(!symbolMap.containsKey(playerSymbol)){
            symbolMap.put(playerSymbol,0); // if symbol doesnt exists in the map.
        }

        symbolMap.put(playerSymbol,symbolMap.get(playerSymbol)+1); // increament the count for symbol

        if(symbolMap.get(playerSymbol).equals(board.getSize())){
            return true;
        }

        return false;
    }
}
