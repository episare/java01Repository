package Lection06.online.model;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public abstract class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defense;

    public Hero(String name, int health, int power, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defense = defense;
//        System.out.println("this is something text from constructor");
    }

    public Hero(String name) {
        this.name = name;
        speak();
    }

    public void speak() {
        System.out.println(name + " says Hello!");
    }

    public void dealDamage() {
        System.out.println(name + " deals damage " + attack * power);
    }

    public void healSelf(int valueUpHp) {
        this.health += valueUpHp;
        System.out.println(name + " heal self to " + valueUpHp + ". My health now " + health);
    }

    public abstract void sleep(int value1, float value2);
}
