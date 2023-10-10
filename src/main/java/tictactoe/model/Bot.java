package tictactoe.model;

import tictactoe.model.types.BotDifficultyLevel;
import tictactoe.model.types.PlayerType;

import java.util.Scanner;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Integer id, Symbol symbol, PlayerType type,
               BotDifficultyLevel botDifficultyLevel, Scanner sc) {

        super(name, id, symbol, type, sc); // Player

        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }
}
