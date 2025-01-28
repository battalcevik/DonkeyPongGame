# Donkey Pong Game

## Overview
Donkey Pong is a simple object-oriented design project that showcases the use of core Java OOP principles. The game includes various elements such as:
- **Player**: (`Mario`) who performs actions like jumping, running, and climbing.
- **Enemy**: (`Gorilla`) who throws barrels to challenge the player.
- **Actions**: (`Cask`, simulated via the `BarrelThrow` class).
- **Environment**: (`Map`, `Platform`, `Ladder`) representing the game's layout.

While this project does not develop a complete game, it defines meaningful classes, methods, and interactions to demonstrate **inheritance**, **method overriding**, **method overloading**, **encapsulation**, and **abstraction**.

---

## Features
1. **Object-Oriented Design**:
    - **Inheritance**:
        - `Mario` and `Gorilla` inherit from the `GameCharacter` class, which itself extends the `BaseClass`.
    - **Encapsulation**: All fields are private, with controlled access through getters and setters.
    - **Polymorphism**:
        - **Method Overloading**: The `jump` method in Mario and `execute` method in BarrelThrow have multiple versions.
        - **Method Overriding**: The `displayDetails` method is overridden in both `Mario` and `Gorilla`.

2. **Player Actions**:
    - Mario can:
        - Jump (normal or with a flip).
        - Run at a specified speed.
        - Climb ladders to reach higher platforms.

3. **Enemy Actions**:
    - Gorilla can:
        - Throw barrels dynamically, with variations in distance.

4. **Game Environment**:
    - The map includes platforms and ladders for gameplay simulation.
    - Barrels roll dynamically across the map, interacting with Mario.

---

## Environment Setup
To run the project, ensure you have the following environment set up:

1. **Java Version**:
    - Java Development Kit (JDK) 11 or above installed.

2. **IDE Recommendation**:
    - IntelliJ IDEA (or any Java IDE) for easier navigation and debugging.

3. **Build Tools**:
    - A `pom.xml` file is provided if you want to use Maven for dependency management, though the project does not currently rely on external libraries.

---

## How to Run
1. Clone or download the project to your local machine.
2. Open the project in your preferred IDE.
3. Compile the code:
    - Make sure all files are compiled successfully.
4. Run the `Main` class to simulate the game:
    - `src/main/java/com/donkeypong/main/Main.java`
5. Follow the on-screen instructions to interact with the game.

---

## Instructions for Gameplay
When you run the `Main` class:
1. The program initializes the game environment (map, platforms, and ladders).
2. Donkey Kong throws barrels, and the player (Mario) must respond by:
    - Jumping over barrels.
    - Running to specific positions.
    - Climbing ladders to avoid obstacles.
    - Waiting (but note that waiting decreases Mario’s health).
3. The game ends when Mario’s health drops to 0 or if the player exits.

---

## Code Organization
The project is organized into several packages for clarity and modularity:

1. **`base`**:
    - Contains the abstract `BaseClass`, which defines common properties (`name`, `position`) and behaviors for all game objects.

2. **`entity`**:
    - Defines game characters like `Mario`, `Gorilla`, and objects like `CharacterHealth` to manage shared functionality for characters.

3. **`enemyactions`**:
    - Contains actions specific to enemies, such as the `Cask` class representing barrels and the `BarrelThrow` class for throwing barrels dynamically.

4. **`playeractions`**:
    - Defines Mario's specific actions like `Jump`, `Run`, and `ClimbLadder`.

5. **`world`**:
    - Includes classes for the game environment, such as the `Map` (game layout), `Platform` (horizontal surfaces), and `Ladder` (vertical climbing paths).

6. **`main`**:
    - The entry point of the application is the `Main` class, which initializes the game and handles user interaction.

---

## Key Concepts Demonstrated
This project highlights the following OOP principles:

1. **Inheritance**:
    - `Mario` and `Gorilla` extend `CharacterHealth`, which itself extends `BaseClass`.
    - This promotes code reuse and keeps the design clean.

2. **Encapsulation**:
    - Fields like `name`, `position`, and `health` are private and accessed via getters and setters for controlled modification.

3. **Abstraction**:
    - The `BaseClass` defines an abstract method, `displayDetails`, which is implemented specifically in `Mario` and `Gorilla`.

4. **Polymorphism**:
    - **Method Overloading**: Demonstrated in Mario's `jump` method and the `execute` method in `BarrelThrow`.
    - **Method Overriding**: The `displayDetails` method in both `Mario` and `Gorilla` provides specific implementations.

---

## Sample Output
Running the game will produce outputs like this:

```
Welcome to Donkey Pong!
Instructions:
1 - Jump
2 - Climb Ladder
3 - Run
4 - Wait (Lose Health)

Donkey Kong is about to throw a barrel!
Donkey Kong is throwing a Cask [Weight=45, Speed=10] to a distance of 40 units.

What will Mario do?
Enter your choice (1=Jump, 2=Climb Ladder, 3=Run, 4=Wait): 1
Enter jump height: 10
Mario is jumping 10 units high.

Do you want to continue playing? (yes/no): yes
```

---

## Notes
1. **Game Logic**:
    - The game currently operates in a simulated environment without a graphical user interface (GUI).
    - The player interacts through console inputs.

2. **Limitations**:
    - The game mechanics are simplified and focus on demonstrating OOP principles rather than full gameplay development.

---

## Conclusion
This project demonstrates a solid understanding of Java's object-oriented programming principles through a modular design. It is a great foundation for building a more complex game in the future.

Thank you for reviewing the Donkey Pong game project!