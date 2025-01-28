package com.donkeypong.entity;

import com.donkeypong.base.BaseClass;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: CharacterHealth.java
 *
 * Description: The CharacterHealth class extends the BaseClass and adds the health property
 * to represent the health of game characters. It also provides an implementation
 * for the abstract displayDetails method from BaseClass.
 */

public class CharacterHealth extends BaseClass {
    private int health;

    public CharacterHealth(String characterName, int characterPosition, int health) {
        super(characterName, characterPosition);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + getCharacterName() + ", Position: " + getCharacterPosition() + ", Health: " + health);
    }
}
