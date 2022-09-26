package com.classes.character;

public class Main {
    public static void main(String[] args) {

        // UKOL 3
        /*
         * Vytvor 1-3 potomky tridy "Entity" a pridej jim alespon jednu novou promennou.
         * Trida potomka bude obsahovat 2 konstruktory.
         * Trida potomka obsahovat metody GET(), SET() pro nove vytvorenou promennou.
         * Trida potomka bude mit prepsanou(@Override) metodu toString(), ktera prida
         * informaci o nove promenne.
         * Vytvor novou instanci tridy potomka a vypis jeho informaci i s nove
         * vytvorenou promennou.
         */

        Entity wizard = new Entity("Herion", 69, 200);
        Sorcerer supreme = new Sorcerer("Strange", 200, 20, 2);
        Archer hood = new Archer("Robin", 50, 5, 500);
        Warrior sparta = new Warrior("Leonidas", 300, 3, 3000);

        System.out.println(wizard.toString());
        System.out.println(supreme.toString());
        System.out.println(hood.toString());
        System.out.println(sparta.toString());
    }
}
