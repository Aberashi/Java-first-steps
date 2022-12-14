package com.classes.character;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class GameManager {
    Scanner sc = new Scanner(System.in);

    private String getName() {
        System.out.println("Create a new character! What's your name?");
        System.out.print("Name: ");

        String name = sc.next();
        boolean alphanum = false;
        while (alphanum == false) {
            if (Pattern.matches("[a-zA-Z0-9 ]+", name)) {
                alphanum = true;
            } else {
                System.out.println("Please do not use special symbols!");
                System.out.print("Name:");
                name = sc.next();
            }
        }
        System.out.println("Welcome " + name + " !");
        return name;
    }

    private Entity getCharacter(String name) {
        System.out.println("Choose your class: Archer, Sorcerer, Warrior");
        System.out.print("Class: ");
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


        switch (classType) {
            case "Archer" -> {
                Archer archer = new Archer(name);
                System.out.println(archer.toString());
                return archer;
            }
            case "Sorcerer" -> {
                Sorcerer sorcerer = new Sorcerer(name);
                System.out.println(sorcerer.toString());
                return sorcerer;
            }
            case "Warrior" -> {
                Warrior warrior = new Warrior(name);
                System.out.println(warrior.toString());
                return warrior;
            }
        }
        return new Entity();

    }

    public Entity registerNewCharacter() {
        String name = getName();
        return getCharacter(name);
    }
}
