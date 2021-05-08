package Lection06.online;

import Lection06.online.model.Hero;

import java.util.Random;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public class Lection6 {

    private static Random random = new Random();

    public static void main(String[] args) {
//        Hero hero = new Hero("Hero", 1,1,1,1);

        Paladin paladin = new Paladin("Paladin", 100, 2, 30, 75);
        Archer archer = new Archer("Archer", 50, 5, 100, 20);
        Mage mage = new Mage("Mage", 10, 10, 60, 1);
        Titan titan = new Titan("Titan", 1000, 200, 150, 100);

//        Paladin paladinTest = new Paladin("Test Paladin");
//
//        Paladin paladin0 = new Paladin("Test Paladin 0", 10.0f);
//
//        paladinTest.speak();
//        paladinTest.dealDamage();
//        paladinTest.healSelf(random.nextInt(500));
//        paladinTest.defense();
//
//
//        hero.speak();

        paladin.speak();
        paladin.dealDamage();
        paladin.healSelf(random.nextInt(500));
        paladin.defense();
//
//        archer.speak();
//        archer.dealDamage();
//        archer.healSelf(random.nextInt(500));
//
//        mage.speak();
//        mage.dealDamage();
//        mage.healSelf(random.nextInt(500));
//
        titan.speak();
//        titan.dealDamage();
//        titan.healSelf(random.nextInt(500));
//        titan.defense();
    }
}


