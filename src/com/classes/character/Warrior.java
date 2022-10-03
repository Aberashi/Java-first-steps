package com.classes.character;

public class Warrior extends Entity {
    int strength;

    public Warrior (String name, int health, int mana, int strength){
        super(name, health, mana);
        this.strength = strength;
    }
    public Warrior(String name){
        super.name = name;
        health = 150;
        mana = 50;
        strength = 20;
    }
    public Warrior (){
        super();
        strength = 20;
    }

    public int getStrength (){
        return strength;
    }
    
    public void setStrength (int newStrength){
        strength = newStrength;
    }

    @Override
    public String toString (){
        return super.toString() + "\r\nStrength: " + strength;
    }
}
