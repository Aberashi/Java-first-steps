package com.main;

import com.classes.character.Archer;
import com.classes.character.Entity;
import com.classes.character.Sorcerer;
import com.classes.character.Warrior;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

       /*
        * Create class called GameManager.
        * The GameManager will have method called RegisterNewCharacter that functions exactly as the current main function.
        * Optimize the method with checking inputs first and than decide what class to create and what name to attach to it.
        * TIP:
        * Try to implement reflection for creating classes based on the String input.
        * https://stackoverflow.com/questions/7495785/java-how-to-instantiate-a-class-from-string
       */


/*        Entity arch = new Archer();
        System.out.println(arch.toString());
        Archer newArch = (Archer)arch;
        System.out.println(arch.toString());
        arch = (Entity) newArch;
        System.out.println(arch.toString());*/

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
