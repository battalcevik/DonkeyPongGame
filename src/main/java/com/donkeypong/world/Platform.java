package com.donkeypong.world;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Platform.java
 *
 * Description:The Platform class represents horizontal surfaces in the game environment
 * where Mario can walk or stand. It includes position properties to define its
 * placement on the map.
 */

public class Platform {
    private int yPosition;  // Vertical position of the platform
    private int startX;     // Starting X coordinate
    private int endX;       // Ending X coordinate

    public Platform(int yPosition, int startX, int endX) {
        this.yPosition = yPosition;
        this.startX = startX;
        this.endX = endX;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    @Override
    public String toString() {
        return "Platform at Y=" + yPosition + " from X=" + startX + " to X=" + endX;
    }
}