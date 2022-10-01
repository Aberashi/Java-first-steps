package com.classes.character;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /*
       * Create a form, where you ask user for a name, Entity type (Warrior, Sorcerer, Archer).
       * Based on that information, create Entity subclass, where the name is the user input name and
       * create class corresponding to the user choice.
       * Check for null inputs.
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


        Scanner sc = new Scanner(System.in);
        String charType = sc.next();
        if (charType.equals("Archer")){
            System.out.println("You chose Archer. Enter your name.");
            System.out.print("Name: ");
            String name = sc.next();
            Archer archer = new Archer(name);
            System.out.println(archer.toString());

        }

    }
}
