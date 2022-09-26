package com.classes.character;

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

        Entity wizard = new Entity("Hermion", 69, 200);
        Sorcerer supreme = new Sorcerer("Strange", 200, 20, 2);
        Archer hood = new Archer("Robin", 50, 5, 500);
        Warrior sparta = new Warrior("Leonidas", 300, 3, 3000);

        System.out.println(wizard.toString());
        System.out.println(supreme.toString());
        System.out.println(hood.toString());
        System.out.println(sparta.toString());
    }
}
