package com.classes.character;

public class Archer extends Entity {
    private int agility;

    public Archer(String name, int health, int mana, int agility) {
        super(name, health, mana);
        this.agility = agility;
    }
    public Archer(String name) {
        super.name = name;
        health = 100;
        setMana(50);
        agility = 20;
    }

    public Archer() {
        super();
        agility = 20;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int newAgility) {
        agility = newAgility;

    }

    @Override
    public String toString() {
        return super.toString() + "\r\nAgility: " + agility;


    }
}
