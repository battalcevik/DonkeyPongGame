package com.donkeypong.entity;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Mario.java
 *
 * Description: The Mario class represents the player character and extends the CharacterHealth class.
 * It includes specific actions for Mario, such as jump, run, and climb ladder.
 * It demonstrates method overloading through the jump method and overrides the
 * displayDetails method for customized output.
 */

public class Mario extends CharacterHealth {
    public Mario(String name, int position, int health) {
        super(name, position, health);
    }


    public void jump(int height) {
        System.out.println(getCharacterName() + " is jumping " + height + " units high.");
    }

    public void run(int speed) {
        System.out.println(getCharacterName() + " is running at " + speed + " units of speed.");
    }

    public void climb(String ladderType) {
        System.out.println(getCharacterName() + " is climbing a " + ladderType + " ladder.");
    }
}