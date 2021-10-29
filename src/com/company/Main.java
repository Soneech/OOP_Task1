package com.company;

public class Main {
    public static void main(String[] args) {
        Assassin killer = new Assassin("killer", 200, 200, 50, true);
        killer.useStealth();
        System.out.println("Assassin health: " + killer.getHealth());
        killer.attack();
        killer.setHealth(180);
        System.out.println("Assassin health: " + killer.getHealth());

        Mage hiller = new Mage("hiller", 150, 100, 300, "owl", "fire");
        hiller.setName("super hiller");
        hiller.useElement();
        hiller.petCall();
        hiller.attack();
        hiller.setMana(200);
        System.out.println("Mage mana: " + hiller.getMana());
    }
}
