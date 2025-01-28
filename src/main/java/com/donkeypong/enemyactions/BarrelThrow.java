package com.donkeypong.enemyactions;

import com.donkeypong.entity.Gorilla;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: BarrelThrow.java
 *
 * Description: The BarrelThrow class defines the action of Gorilla throwing barrels (Casks).
 * It includes two execute methods, demonstrating method overloading:
 * 1. A basic throw.
 * 2. A throw with a specified distance.
 */

public class BarrelThrow {
    // Method Overloading
    public void throwBarrel(Gorilla gorilla, Cask cask) {
        System.out.println(gorilla.getCharacterName() + " is throwing a " + cask);
    }
    // Method Overloading
    public void throwBarrelToDistance(Gorilla gorilla, Cask cask, int distance) {
        System.out.println(gorilla.getCharacterName() + " is throwing a " + cask + " to a distance of " + distance + " units!");
    }
}
