package com.classes.character;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GameManager {
    public void registerNwCharacter() {
        System.out.println("Create a new character!");
        System.out.println("Archer, Sorcerer, Warrior");
        System.out.print("Class: ");

        Scanner sc = new Scanner(System.in);
        String classType = sc.next();
        boolean done = false;
        while (done == false) {

            switch (classType) {
                case "Archer", "Sorcerer", "Warrior" -> {
                    done = true;
                }
                default -> {
                    System.out.println("Please write the class name correctly! For example \"Warrior\" ");
                    System.out.print("Class: ");
                    classType = sc.next();
                }
            }
        }

        System.out.println("You chose " + classType + ". Enter your name.");
        System.out.print("Name: ");
        String name = sc.next();
        boolean alphanum = false;
        while (alphanum == false) {
            if (Pattern.matches("[a-zA-Z0-9 ]+", name)) {
                alphanum = done;
            } else {
                System.out.println("Please do not use special symbols!");
                System.out.print("Name:");
                name = sc.next();
            }
        }
        switch (classType) {
            case "Archer" -> {
                Archer archer = new Archer(name);
                System.out.println(archer.toString());
            }
            case "Sorcerer" -> {
                Sorcerer sorcerer = new Sorcerer(name);
                System.out.println(sorcerer.toString());
            }
            case "Warrior" -> {
                Warrior warrior = new Warrior(name);
                System.out.println(warrior.toString());
            }
        }
    }
}
