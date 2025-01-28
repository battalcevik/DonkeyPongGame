package com.donkeypong.playeractions;

import com.donkeypong.entity.CharacterHealth;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Run.java
 *
 * Description: The Run class represents the action of Mario running in the game.
 * It includes a method to simulate Mario running at a specified speed.
 */

public class Run {
    public void runAtSpeed(CharacterHealth character, int speed) {
        System.out.println(character.getCharacterName() + " is running at speed " + speed + ".");
    }
}
