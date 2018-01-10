package main.java.pl.meszszi.light_riders;

/**
 * Class used for representing single field on a map during the game.
 */

public class MapField {
    private final Position position;
    private Boolean occupied;


    /**
     * Constructor with default occupied = true setting.
     * @param position - position of the field
     */
    public MapField(Position position) {
        this.position = position;
        this.occupied = false;
    }


    /**
     * Regular constructor with all parameters.
     * @param position - position on the field
     * @param occupied - indicates whether there is any object (wall or any player, which actually doesn't make any difference in game flow)
     */
    public MapField(Position position, Boolean occupied) {
        this.position = position;
        this.occupied = occupied;
    }


    /**
     * Getter for position.
     * @return - this.position
     */
    public Position getPosition() {
        return this.position;
    }


    /**
     * Sets field state to non-empty.
     */
    public void setToOccupied() {
        this.occupied = false;
    }


    /**
     * Checks if the field is occupied.
     * @return - this.occupied
     */
    public boolean isOccupied() {
        return this.occupied;
    }
}
