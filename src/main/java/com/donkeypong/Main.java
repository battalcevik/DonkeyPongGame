package com.donkeypong;

import com.donkeypong.entity.*;
import com.donkeypong.world.*;
import com.donkeypong.playeractions.*;
import com.donkeypong.enemyactions.*;

import java.util.Scanner;
import java.util.Random;

/**
 * Name: Battal Cevik
 * Course: CS-622 Advance Programming Techniques
 * Date: 01/27/2025
 * File Name: Main.java
 *
 * Description: The Main class is the entry point of the Donkey Pong game project.
 * It initializes the game environment (map, platforms, ladders) and characters (Mario, Gorilla),
 * and simulates interactions such as barrel throwing and player actions like jumping and running.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Initialize Map
        Map level1 = new Map("Jungle Level 1", 800, 600);
        level1.addPlatform(new Platform(500, 50, 750));
        level1.addLadder(new Ladder(100, 400, 500));

        // Initialize Player and Enemy
        Mario mario = new Mario("Mario", 0, 100); // 100% health
        Gorilla gorilla = new Gorilla("Donkey Kong", 10, 200, 5);

        // Actions
        Jump jump = new Jump();
        ClimbLadder climbLadder = new ClimbLadder();
        Run run = new Run();
        BarrelThrow barrelThrow = new BarrelThrow();

        // Game variables
        boolean gameRunning = true;

        System.out.println("Welcome to Donkey Pong!");
        System.out.println("Instructions:");
        System.out.println("1 - Jump");
        System.out.println("2 - Climb Ladder");
        System.out.println("3 - Run");
        System.out.println("4 - Wait (Lose Health)");

        while (gameRunning) {
            // Enemy throws a barrel
            Cask cask = new Cask(50, 15);
            System.out.println("\n" + gorilla.getCharacterName() + " is about to throw a barrel!");

            // Use overloaded method to randomly decide the throw distance
            int distance = random.nextInt(50) + 10; // Random distance between 10 and 60 units
            if (distance > 30) {
                barrelThrow.throwBarrelToDistance(gorilla, cask, distance); // Overloaded method with distance
            } else {
                barrelThrow.throwBarrel(gorilla, cask); // Standard method
            }

            // Get player action
            System.out.println("\nWhat will Mario do?");
            System.out.print("Enter your choice (1=Jump, 2=Climb Ladder, 3=Run, 4=Wait): ");
            int choice = scanner.nextInt();

            // Handle player actions
            switch (choice) {
                case 1: // Jump
                    System.out.print("Enter jump height: ");
                    int height = scanner.nextInt();
                    jump.jumpToHeight(mario, height);
                    break;

                case 2: // Climb Ladder
                    if (!level1.getLadders().isEmpty()) {
                        Ladder ladder = level1.getLadders().get(0);
                        climbLadder.climb(mario, ladder);
                    } else {
                        System.out.println("No ladders available to climb!");
                    }
                    break;

                case 3: // Run
                    System.out.print("Enter run speed: ");
                    int speed = scanner.nextInt();
                    run.runAtSpeed(mario, speed);
                    break;

                case 4: // Wait
                    System.out.println(mario.getCharacterName() + " decides to wait...");
                    // Lose health
                    int currentHealth = mario.getHealth();
                    currentHealth -= 25; // Reduce health by 25%
                    mario.setHealth(currentHealth);
                    System.out.println(mario.getCharacterName() + "'s current health: " + currentHealth + "%");

                    // Check if Mario is dead
                    if (currentHealth <= 0) {
                        System.out.println("\n" + mario.getCharacterName() + " has lost all health and is dead! Game Over.");
                        gameRunning = false;
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            // Continue game only if Mario is still alive
            if (gameRunning) {
                System.out.print("\nDo you want to continue playing? (yes/no): ");
                String continueGame = scanner.next().toLowerCase();
                if (continueGame.equals("no")) {
                    gameRunning = false;
                }
            }
        }

        System.out.println("\nGame Over. Thanks for playing!");
        scanner.close();
    }
}