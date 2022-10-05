package com.classes.character;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

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
        String classType = sc.next();
        boolean done = false;
        while (done == false ){

            switch (classType){
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

            System.out.println("You chose "+classType+ ". Enter your name.");
            System.out.print("Name: ");
            String name = sc.next();
            boolean alphanum = false;
            while(alphanum==false){
                if(Pattern.matches("[a-zA-Z0-9 ]", name)){
                    alphanum = done;
                }
                else{
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