package com.classes.character;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
       * Create a form, where you ask user for a name, Entity type (Warrior, Sorcerer, Archer).
       * Based on that information, create Entity subclass, where the name is the user input name and
       * create class corresponding to the user choice.
       * Check for null or empty string inputs.
       * The name should include only big/small letters and numbers ONLY.
       * Print out the user created character to the console.
       *
       * QUICK TIP:
       * Recommend using switch statement on creating class.
       * To get user input use Scanner class from the java.util.Scanner.
       * Use "System.in" as argument when creating instance of the Scanner.
       */

        System.out.println("Welcome, choose your character!");
        System.out.println("Archer, Sorcerer, Warrior");
        System.out.print("Class: ");


        Scanner sc = new Scanner(System.in);

        boolean done = false;
        while (done == false ){
            switch (sc.next()) {
                case "Archer" -> {
                    System.out.println("You chose Archer. Enter your name.");
                    System.out.print("Name: ");
                    String archName = sc.next();
                    Archer archer = new Archer(archName);
                    System.out.println(archer.toString());
                    done = true;
                }
                case "Sorcerer" -> {
                    System.out.println("You chose Sorcerer. Enter your name.");
                    System.out.print("Name: ");
                    String sorName = sc.next();
                    Sorcerer sorcerer = new Sorcerer(sorName);
                    System.out.println(sorcerer.toString());
                    done = true;
                }
                case "Warrior" -> {
                    System.out.println("You chose Warrior. Enter your name.");
                    System.out.print("Name: ");
                    String warName = sc.next();
                    Warrior warrior = new Warrior(warName);
                    System.out.println(warrior.toString());
                    done = true;
                }
                default -> {
                    System.out.println("Please write the class name correctly! For example \"Warrior\" ");
                    System.out.print("Class: ");
                }
            }
        }
    }
}
