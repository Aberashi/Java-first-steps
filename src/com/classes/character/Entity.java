package com.classes.character;

public class Entity {
    private String name;
    private int health;
    private int mana;

    public Entity(String name, int health, int mana) {
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public Entity() {
        this.name = "Entity";
        health = 100;
        mana = 10;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public void setMana(int newMana) {
        mana = newMana;
    }

    @Override
    public String toString() {
        String debug = "Name: " + name + "\r\n" + "HP: " + health + "\r\n" + "Mana: " + mana;
        return debug;
    }
}
