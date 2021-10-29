package com.company;

public class Unit {
    private String name;
    private int health;
    private int power;
    private int mana;

    public Unit () {

    }

    public Unit(String name, int health, int power, int mana) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.mana = mana;
    }

    public void attack () {
        System.out.println("Attack!");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getMana() {
        return mana;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
