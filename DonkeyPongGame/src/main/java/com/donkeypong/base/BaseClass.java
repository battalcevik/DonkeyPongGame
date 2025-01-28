package com.donkeypong.base;


/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: BaseClass.java
 *
 * Description: The BaseClass is an abstract class that serves as the foundation for all game objects.
 * It contains common properties like characterName and characterPosition,
 * and enforces the implementation of the displayDetails method in subclasses.
 */

public abstract class BaseClass {
    private String characterName;
    private int characterPosition;

    public BaseClass(String name, int position) {
        this.characterName = name;
        this.characterPosition = position;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getCharacterPosition() {
        return characterPosition;
    }

    public void setCharacterPosition(int characterPosition) {
        this.characterPosition = characterPosition;
    }

    public abstract void displayDetails();
}
