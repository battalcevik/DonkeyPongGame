package com.donkeypong.world;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Ladder.java
 *
 * Description: The Ladder class represents vertical paths that Mario can climb
 * to move between different platforms in the game. It includes
 * properties to define its position on the map.
 */

public class Ladder {
    private int xPosition;  // Horizontal position of the ladder
    private int startY;     // Starting Y coordinate
    private int endY;       // Ending Y coordinate

    public Ladder(int xPosition, int startY, int endY) {
        this.xPosition = xPosition;
        this.startY = startY;
        this.endY = endY;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    @Override
    public String toString() {
        return "Ladder at X=" + xPosition + " from Y=" + startY + " to Y=" + endY;
    }
}
