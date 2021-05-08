package Lection06.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public class Titan extends Paladin {

    public Titan(String name, int health, int power, int attack, int defense) {
        super(name, health, power, attack, defense);
        dex = 20;
    }

    @Override
    public void healSelf(int valueUpHp) {
        System.out.println(name + " dont't heal self");
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(name + " do something");
    }
}
