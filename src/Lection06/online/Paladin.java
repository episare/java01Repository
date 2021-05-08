package Lection06.online;

import Lection06.online.model.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public class Paladin extends Hero {

    protected float dex;
//    protected String name;

    public Paladin(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);
//        this.name = "Vasia";
    }

    public Paladin(String name) {
        super(name);
    }

    public Paladin(String name, float dex) {
        super(name);
        this.dex = dex;
    }

    public void defense() {
        System.out.println(name + " defence " + defense + " points");
    }

    public String getName() {
        return name;
    }

    @Override
    public void sleep(int value1, float value2) {
        System.out.println(name + " sleep 1");
    }
}
