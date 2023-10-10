package tictactoe;

import tictactoe.controller.GameController;
import tictactoe.model.Game;
import tictactoe.model.Player;
import tictactoe.model.types.GameState;
import tictactoe.strategy.ColumnGameWinStrategy;
import tictactoe.strategy.GameWinningStrategy;
import tictactoe.strategy.RowGameWinStrategy;

import java.util.ArrayList;
import java.util.List;

public class User {

    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();

        // below code will interact with GC.

        // S1:
        List<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());

        List<GameWinningStrategy> winRules = new ArrayList<>();
        winRules.add(new RowGameWinStrategy());
        winRules.add(new ColumnGameWinStrategy());

        Game game  = gameController.startGame(players,
                winRules,
                3);

        //S2:
        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            /**
             * 1. Print the board
             * 2. identify which players move it is.
             * 3. Ask player to give cell no to move
             *
             */

            gameController.printBoard(game);
            gameController.makeMove(game);
        }

    }
}
