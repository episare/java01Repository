package Lection06.homework.Homework;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 05.05.2021
 */

public class Dog extends Animal {

    public static int countDog = 0;

    Dog(String name, float maxJump, float maxRun, float maxSwim) {
        super("Пес", name, maxJump, maxRun, maxSwim);
        ++countDog;
    }
}
