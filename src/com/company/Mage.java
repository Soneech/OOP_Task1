package com.company;

public class Mage extends Unit {
    private String pet;
    private String element; // стихия

    public Mage () {

    }

    public Mage(String name, int health, int power, int mana, String pet, String element) {
        super(name, health, power, mana);
        this.pet = pet;
        this.element = element;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getPet() {
        return pet;
    }

    public String getElement() {
        return element;
    }

    @Override
    public void attack() {
        System.out.println("Mage attack!");
    }

    public void useElement() {
        System.out.println("use " + this.element);
    }

    public void petCall () {
        System.out.println("pet " + this.pet + " is here!");
    }
}
