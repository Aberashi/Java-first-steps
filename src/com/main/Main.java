package com.main;

import com.classes.character.*;

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

//
//        Entity arch = new Archer();
//        System.out.println(arch.toString());
//
//        newArch.setAgility(50);
//        System.out.println(newArch.toString());
//        arch = (Entity) newArch;
//        System.out.println(arch.toString());
//
//        if (Archer.class.isInstance(arch)){
//            ((Archer)arch).getAgility();
//        }
        GameManager one = new GameManager();
        one.registerNwCharacter();
    }
}
