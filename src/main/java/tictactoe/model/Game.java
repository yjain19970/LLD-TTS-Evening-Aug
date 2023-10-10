package tictactoe.model;

import tictactoe.model.types.CellState;
import tictactoe.model.types.GameState;
import tictactoe.model.types.PlayerType;
import tictactoe.strategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> playerMoves;
    private Player winnerPlayer;
    private GameState gameState;
    private Integer nextPlayerIndex;
    List<GameWinningStrategy> winningStrategies;

    private Game(int dimension, List<Player> players, List<GameWinningStrategy> winningStrategies){
        this.players = players;
        this.board = new Board(dimension); //
        this.gameState = GameState.IN_PROGRESS; //
        this.nextPlayerIndex = 0; //
        this.winningStrategies = winningStrategies;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getPlayerMoves() {
        return playerMoves;
    }

    public Player getWinnerPlayer(Game game) {
        return winnerPlayer;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }
    /*
        DEFINE BUILDER FOR GAME.
     */

    public static Builder getBuilder(){
        return new Builder();
    }

    public void makeMove() throws Exception {
        /*
            S1. get the nextPlayerIndex. D
            S2. call makeMove on Player D
            S3. validation D
            S4. update your cell D
            s5. Add Move to list
            s6. checkWinner
         */

        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.println("Current Player's move: " + currentPlayer.getName());

        Move move = currentPlayer.makeMove();

        if(!validateMove(move)){
            throw new Exception();
        }

        Integer row = move.getCell().getRow();
        Integer col = move.getCell().getCol();

       Cell cellTobeUpdated = board.getBoard().get(row).get(col);
       cellTobeUpdated.setCellState(CellState.FILLED);
       cellTobeUpdated.setPlayer(move.getPlayer());

       move.setCell(cellTobeUpdated);
       playerMoves.add(move);

       nextPlayerIndex++;
       nextPlayerIndex = nextPlayerIndex%players.size(); // [A,B,C]

       // checkWinner
        if(checkWinner(move,board)){
            gameState = GameState.END;
            winnerPlayer = move.getPlayer();
        }else if(playerMoves.size() == board.getSize()*board.getSize()){
            gameState = GameState.DRAW;
        }
    }

    public boolean checkWinner(Move move, Board board){
        for(GameWinningStrategy st : winningStrategies){
            if(st.checkWinner(board,move)){
                return true;
            }
        }
        return false;
    }

    private boolean validateMove(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if(row >= board.getSize()){
            return false;
        }

        if(col >= board.getBoard().get(0).size()){
            return false;
        }

        if(board.getBoard().get(row).get(col).
                getCellState().equals(CellState.EMPTY)){
            return true;
        }

        return false;
    }


    public void printBoard() {
        board.printBoard();
    }

    public void undo() {
    }


    public static class Builder {
        private List<Player> players;
        private List<GameWinningStrategy> winningStrategies;
        private int dimension;

        private Builder(){
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<GameWinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }


        public Game build() throws Exception {
            validations();

            return new Game(dimension,players,winningStrategies);
        }

        private void validations() throws Exception {
            if(players.size() < 1){
                throw new Exception();
            }

            validateNumberOfBots();
        }

        private void validateNumberOfBots() throws Exception {
            int botCount = 0;
            for(int i=0;i<players.size();i++){
                if(players.get(i).getType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            // ALL the BOTs cannot play the GAME.
            if(botCount == players.size()) {
                throw new Exception();
            }

            /**
             * ToDo: Add Validation for player count & board size.
             */
        }
    }
}
