package com.donkeypong.playeractions;

import com.donkeypong.entity.CharacterHealth;
import com.donkeypong.world.Ladder;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: ClimbLadder.java
 *
 * Description:The ClimbLadder class represents the action of Mario climbing a ladder in the game.
 * It includes a method to simulate Mario climbing a specified ladder.
 */

public class ClimbLadder {
    public void climb(CharacterHealth character, Ladder ladder) {
        System.out.println(character.getCharacterName() + " is climbing the ladder at X=" + ladder.getXPosition() +
                " from Y=" + ladder.getStartY() + " to Y=" + ladder.getEndY());
    }

    public void climb(CharacterHealth character, Ladder ladder, boolean withSpeed) { // Overloading
        if (withSpeed) {
            System.out.println(character.getCharacterName() + " is climbing the ladder at X=" + ladder.getXPosition() +
                    " quickly from Y=" + ladder.getStartY() + " to Y=" + ladder.getEndY());
        } else {
            climb(character, ladder);
        }
    }
}
