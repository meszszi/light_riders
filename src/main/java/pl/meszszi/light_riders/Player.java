package main.java.pl.meszszi.light_riders;

/**
 * Class used to represent any player on game field.
 */

public class Player {
    private final PlayerType type;
    private final int playerID;
    private Position position;


    public Player(PlayerType type, int playerID, Position initialPosition) {
        this.type = type;
        this.playerID = playerID;
        this.position = initialPosition;
    }


    /**
     * Updates position to new given one.
     * @param newPosision - new position of a player
     */
    public void updatePosition(Position newPosision) {
        this.position = newPosision;
    }
}
