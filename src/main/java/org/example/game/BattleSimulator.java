package org.example.game;


import org.example.character.*;
import org.example.character.Warrior;
import org.example.character.Wizard;
import org.example.character.Character;
import org.example.interfaces.Attacker;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.List;

public class BattleSimulator {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Character> characters = new ArrayList<>();

    public static void startGame(){
        System.out.println("Welcome to IronBattle Simulator!");

        boolean running = true;

        while (running) {
            printMenu();
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> createCharacter();
                case "2" -> listCharacters();
                case "3" -> startBattle();
                case "4" -> {
                    System.out.println("Exiting...Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid option. Try again");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("1️⃣ Create new character");
        System.out.println("2️⃣ List all characters");
        System.out.println("3️⃣ Start battle");
        System.out.println("4️⃣ Exit");
        System.out.println("🔎 Choose an option: ");
    }

    private static void createCharacter() {
        System.out.print("Enter character name: ");
        String name = scanner.nextLine();

        System.out.println("Choose type (1= Warrior 🥷, 2 = Wizard 🧙‍♂️): ");
        String type = scanner.nextLine();

        Character newChar = null;

        int hp = 0;

        if (type.equals("1")) {
            hp = 100 + (int)(Math.random() * 101);
            newChar = new Warrior(name, hp);
        } else if (type.equals("2")) {
            hp = 50 + (int)(Math.random() * 51);
            newChar = new Wizard(name, hp);
        } else {
            System.out.println("Invalid type. Character not created.");
            return;
        }
        characters.add(newChar);
    }

    private static void listCharacters() {
        if (characters.isEmpty()) {
            System.out.println("📭 No characters available.");
            return;
        }

        System.out.println("\n📋 List of Characters:");
        for (int i = 0; i < characters.size(); i++) {
            Character c = characters.get(i);
            System.out.printf("%d. %s (%s) - HP ❤️: %d\n", i + 1, c.getName(), c.getClass().getSimpleName(), c.getHp());
        }
    }

    public static void startBattle() {
        if (characters.size() < 2) {
            System.out.println("Not enough characters to start battle");
            return;
        }

        System.out.println("Enter index of first fighter: ");
        int idx1 = Integer.parseInt(scanner.nextLine()) -1;

        System.out.println("Enter index of second fighter: ");
        int idx2 = Integer.parseInt(scanner.nextLine()) -1;

        if (idx1 < 0 || idx2 < 0 || idx1 >= characters.size() || idx2 >= characters.size()) {
            System.out.println("Invalid selection");
            return;
        }

        Character fighter1 = characters.get(idx1);
        Character fighter2 = characters.get(idx2);

        System.out.println("\n Battle begins between " + fighter1.getName() + " and " + fighter2.getName());
        simulateBattle(fighter1, fighter2);
    }

    private static void simulateBattle(Character a, Character b) {
        int round = 1;

        while (a.isAlive() && b.isAlive()) {

            ((Attacker) a).attack(b);
            ((Attacker) b).attack(a);

            System.out.println("\n 🔁 Round " + round);

            System.out.println(a.getName() + " HP ❤️: " + a.getHp());
            System.out.println(b.getName() + " HP ❤️: " + b.getHp());

            round++;
            try {
                Thread.sleep(1000); // pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (!a.isAlive() && !b.isAlive()) {
            System.out.println("It's a tie! 🤝 Restarting battle...");
            a.setHp(a.getHp()); a.setAlive(true);
            b.setHp(b.getHp()); b.setAlive(true);
            simulateBattle(a, b);
        } else {
            Character defeated = !a.isAlive() ? a : b;
            System.out.println(defeated.getName() + " has lost! 💀💀");

            Character winner = a.isAlive() ? a : b;
            System.out.println("👑 The winner is " + winner.getName() + "!");
        }
    }
}
