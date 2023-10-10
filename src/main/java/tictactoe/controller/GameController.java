package tictactoe.controller;

import tictactoe.model.Game;
import tictactoe.model.Player;
import tictactoe.model.types.GameState;
import tictactoe.strategy.GameWinningStrategy;

import java.util.List;

public class GameController {

    public void printBoard(Game game){
        game.printBoard();
    }

    public void getWinner(Game game) {
        game.getWinnerPlayer();
    }

    public void undo(Game game){
        game.undo();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameState checkState(Game game){
        return game.getGameState();
    }

    public Game startGame(List<Player> players,
                          List<GameWinningStrategy> winRules,
                          Integer size) throws Exception {

        return Game.getBuilder()
                .setDimension(size)
                .setPlayers(players)
                .setWinningStrategies(winRules)
                .build();
    }


}
