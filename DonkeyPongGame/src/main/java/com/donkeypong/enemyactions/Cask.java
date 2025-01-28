package com.donkeypong.enemyactions;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Cask.java
 *
 * Description: The Cask class represents barrels thrown by Donkey Kong.
 * It includes properties like weight, speed, and position, as well as
 * a roll method to simulate the barrel's movement.
 */


public class Cask {
    private int weight;    // Weight of the cask
    private int speed;     // Speed at which the cask rolls

    public Cask(int weight, int speed) {
        this.weight = weight;
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void roll() {
        System.out.println("The cask is rolling at speed " + speed + "!");
    }

    @Override
    public String toString() {
        return "Cask [Weight=" + weight + ", Speed=" + speed + "]";
    }
}