package tictactoe.strategy;

import tictactoe.model.Board;
import tictactoe.model.Move;
import tictactoe.model.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowGameWinStrategy implements GameWinningStrategy{
    private final Map<Integer, HashMap<Symbol, Integer>> rowCountMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol playerSymbol = move.getPlayer().getSymbol();

        if(!rowCountMap.containsKey(row)){
            rowCountMap.put(row, new HashMap<>());
        }

        Map<Symbol,Integer> symbolMap = rowCountMap.get(row);

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
