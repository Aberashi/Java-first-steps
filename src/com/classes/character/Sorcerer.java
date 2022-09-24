package com.classes.character;

public class Sorcerer extends Entity {
    private int intelligence;

    public Sorcerer (String name, int health, int mana, int intelligence){
        super(name, health, mana);
        this.intelligence = intelligence;
    }
    public Sorcerer (){
        super();
        intelligence = 20;
    }

    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int newIntelligence){
        intelligence = newIntelligence;
    }
    @Override
    public String toString(){
        return super.toString() + "\r\nIQ: " + intelligence; 
    }
}
