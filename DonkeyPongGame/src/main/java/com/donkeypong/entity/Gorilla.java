package com.donkeypong.entity;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Gorilla.java
 *
 * Description: The Gorilla class represents the enemy character and extends the CharacterHealth class.
 * It includes the angerLevel property and a throwCask method to simulate throwing barrels.
 * It overrides the displayDetails method to include anger level information.
 */


public class Gorilla extends CharacterHealth {
    private int angerLevel;

    public Gorilla(String name, int position, int health, int angerLevel) {
        super(name, position, health);
        this.angerLevel = angerLevel;
    }

    public int getAngerLevel() {
        return angerLevel;
    }

    public void setAngerLevel(int angerLevel) {
        this.angerLevel = angerLevel;
    }

    public void throwCask() {
        System.out.println(getCharacterName() + " is throwing a cask!");
    }

    @Override
    public void displayDetails() { // Method Overriding
        super.displayDetails();
        System.out.println("Anger Level: " + angerLevel);
    }
}
