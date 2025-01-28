package com.donkeypong.playeractions;

import com.donkeypong.entity.CharacterHealth;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Jump.java
 *
 * Description: The Jump class represents the action of Mario jumping in the game.
 * It includes a method to simulate Mario jumping a specified height.
 */

public class Jump {
    public void jumpToHeight(CharacterHealth character, int height) {
        System.out.println(character.getCharacterName() + " is jumping " + height + " units high.");
    }

    public void jumpToHeight(CharacterHealth character, int height, boolean withFlip) { // Overloading
        if (withFlip) {
            System.out.println(character.getCharacterName() + " is jumping " + height + " units high with a flip!");
        } else {
            jumpToHeight(character, height);
        }
    }
}
