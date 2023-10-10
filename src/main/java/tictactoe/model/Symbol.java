package tictactoe.model;

public class Symbol {
    private Character playerSymbol;

    public Symbol(Character playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public Character getPlayerSymbol() {
        return playerSymbol;
    }
}