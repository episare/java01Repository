package Lection05.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.04.2021
 */

public class Hero {

    private int health; //поле класса
    private int speed;
    private String name;
    private Sword sword;

    public static String voice = "Hello_I_Hero";


//    Hero() {
//        speak();
//        sword.dealDamage();
//    }

    public Hero(int valueHealth, int valueSpeed, String valueName) {
        health = valueHealth;
        speed = valueSpeed;
        name = valueName;
        sword = new Sword();
    }

//    Hero(int valueHealth, int valueSpeed) {
//        health = valueHealth;
//        speed = valueSpeed;
//    }

    void move() {
        System.out.println(name + " has move with speed " + speed);
    }

    private void speak() {
        System.out.println(name + " says Hello!");
    }

    void damage() {
        health -= 10;
        System.out.println(name + " has damage 10pnt. My health now is " + health);
    }

    public class Sword {
        int attack = 150;
        int weight;
        float width;
        float atkSpeed;

        void dealDamage() {
            System.out.println("Our sword deal damage " + attack);
        }

    }

    //Getter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public Sword getSword() {
        return sword;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
}
