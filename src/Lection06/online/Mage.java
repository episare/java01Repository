package Lection06.online;

import Lection06.online.model.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public class Mage extends Hero {

    public Mage(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);
    }

    @Override
    public void sleep(int value1, float value2) {
        System.out.println(name + " sleep 3");
    }
}
