package tictactoe;

import tictactoe.controller.GameController;
import tictactoe.model.Game;
import tictactoe.model.Player;
import tictactoe.model.Symbol;
import tictactoe.model.types.GameState;
import tictactoe.model.types.PlayerType;
import tictactoe.strategy.ColumnGameWinStrategy;
import tictactoe.strategy.GameWinningStrategy;
import tictactoe.strategy.RowGameWinStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    public static void main(String[] args) throws Exception {
        GameController gameController = new GameController();
        Scanner sc = new Scanner(System.in);

        List<Player> players = new ArrayList<>();

        players.add(new Player("Mudit", 1,
                new Symbol('X'),
                PlayerType.HUMAN,sc));

        players.add(new Player("Nipun", 2,
                new Symbol('0'),
                PlayerType.HUMAN,sc));

        List<GameWinningStrategy> winRules = new ArrayList<>();
        winRules.add(new RowGameWinStrategy());
        winRules.add(new ColumnGameWinStrategy());

        Game game  = gameController.startGame(players,
                winRules,
                3);


        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)){
            /**
             * 1. Print the board
             * 2. identify which players move it is.
             * 3. Ask player to give cell no to move
             *
             */

            gameController.printBoard(game);

            gameController.makeMove(game);
            // user -> Controller -> Game -> Player
        }

        if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game is DRAW...");
        }

        if(game.getGameState().equals(GameState.END)){
            System.out.println("GAME ENDED and USER" +
                    gameController.getWinner(game).getName()+ " won the game...");
        }


    }
}
