package main.java.pl.meszszi.light_riders;

import java.util.ArrayList;

/**
 * Class used for representing whole game map and objects present on the field.
 */

public class Map {
    private final int width;
    private final int height;
    private MapField[][] fields;
    private Player[] players;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;

        this.players = new Player[2];

        this.fields = new MapField[width][height];

        for(int xCoord = 0; xCoord < width; xCoord++)
            for(int yCoord = 0; yCoord < height; yCoord++)
                fields[xCoord][yCoord] = new MapField(new Position(xCoord, yCoord));
    }


    public void updateField(String fieldStr) {

        // String with field update contains following characters separated with commas:
        //      '.' -> empty field
        //      'X' -> wall
        //      '0' -> player0 position
        //      '1' -> player1 position

        fieldStr = fieldStr.replaceAll(",", "");  // Gets rid of unnecessary commas.
        int player0pos = fieldStr.indexOf('0'); // Finds player0 position in the string.
        int player1pos = fieldStr.indexOf('1'); // Finds player1 position in the string.

        // Sets both fields on which players are standing as occupied.
        // Note that there is no need for further field updates, as those are the only fields
        // that could change their state since the previous round.
        this.fields[player0pos % this.width][player0pos / this.height].setToOccupied();
        this.fields[player1pos % this.width][player1pos / this.height].setToOccupied();

        this.players[0].updatePosition(new Position(player0pos % this.width, player0pos / this.height));
        this.players[1].updatePosition(new Position(player1pos % this.width, player1pos / this.height));
    }
}
