package com.donkeypong.world;

import java.util.ArrayList;
import java.util.List;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Map.java
 *
 * Description:The Map class represents the game environment. It includes dimensions
 * (width and height) and lists of platforms and ladders. It provides methods
 * to dynamically add platforms and ladders to the game.
 */

public class Map {
    private String layout;
    private int width;
    private int height;
    private List<Platform> platforms;
    private List<Ladder> ladders;

    public Map(String layout, int width, int height) {
        this.layout = layout;
        this.width = width;
        this.height = height;
        this.platforms = new ArrayList<>();
        this.ladders = new ArrayList<>();
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Platform> getPlatforms() {
        return platforms;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    // Add a platform to the map
    public void addPlatform(Platform platform) {
        platforms.add(platform);
    }

    // Add a ladder to the map
    public void addLadder(Ladder ladder) {
        ladders.add(ladder);
    }

    public void displayMap() {
        System.out.println("Map Layout: " + layout);
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Platforms:");
        for (Platform platform : platforms) {
            System.out.println(platform);
        }
        System.out.println("Ladders:");
        for (Ladder ladder : ladders) {
            System.out.println(ladder);
        }
    }
}
