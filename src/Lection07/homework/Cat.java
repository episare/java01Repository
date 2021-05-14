package Lection07.homework;

public class Cat extends Animal {

    private static int countCats=0;

    public Cat (String type, String name, int distanceRun) {
        super (type, name, distanceRun);
        ++countCats;
        System.out.println ("Hello, I'm the " + countCats + " cat. My name is " + this.name + ".");
    }

    @Override
    public void swim() {
        System.out.println ("Cat " + this.name + " can not swim.");
    }

}
