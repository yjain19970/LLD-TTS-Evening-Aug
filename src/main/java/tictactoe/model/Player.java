package tictactoe.model;

import tictactoe.model.types.PlayerType;

public class Player {
    private String name;
    private Integer id;
    private Symbol symbol;
    private PlayerType type;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getType() {
        return type;
    }
}
