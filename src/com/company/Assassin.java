package com.company;

public class Assassin extends Unit{
    private boolean stealth;

    private Assassin () {

    }

    public Assassin(String name, int health, int power, int mana, boolean stealth) {
        super(name, health, power, mana);
        this.stealth = stealth;
    }

    public void setStealth(boolean stealth) {
        this.stealth = stealth;
    }

    public boolean isStealth() {
        return stealth;
    }

    @Override
    public void attack() {
        System.out.println("Assassin Attack!");
    }

    public void useStealth() {
        System.out.println("use stealth");
    }

}
