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
        Scanner scanner = new Scanner(System.in);

        List<Player> players = new ArrayList<>();

        players.add(new Player("Mudit", 1,
                new Symbol('X'),
                PlayerType.HUMAN,scanner));

        players.add(new Player("Nipun", 2,
                new Symbol('0'),
                PlayerType.HUMAN,scanner));

        List<GameWinningStrategy> winRules = new ArrayList<>();
        winRules.add(new RowGameWinStrategy());
        winRules.add(new ColumnGameWinStrategy());

        Game game  = gameController.startGame(players,
                winRules,
                3);


        while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
            // 1. printBoard
            // 2. x's turn
            // 3. ask to makeMove

            gameController.printBoard(game);

            System.out.println("Does anyone want to undo? (y/n)");
            String undoAnswer = scanner.next();

            if (undoAnswer.equalsIgnoreCase("y")) {
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);
        }

        System.out.println("Game is finished");
        GameState state = gameController.checkState(game);

        if (state.equals(GameState.DRAW)) {
            System.out.println("It is a draw");
        } else {
            System.out.println("Winner is " + gameController.getWinner(game).getName());
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
