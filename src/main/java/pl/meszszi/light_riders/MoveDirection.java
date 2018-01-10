package main.java.pl.meszszi.light_riders;

/**
 * Enum type for different directions of movement.
 */

public enum MoveDirection {
    LEFT,
    RIGHT,
    UP,
    DOWN;


    /**
     * Finds opposite direction to this.
     * @return MoveDirection opposite to this
     */
    MoveDirection getOpposite() {
        switch (this){

            case LEFT:
                return RIGHT;

            case RIGHT:
                return LEFT;

            case UP:
                return DOWN;

            case DOWN:
                return UP;

            default:
                return null;
        }
    }
}
