package Lection06.homework;

public class Cat extends Animal {

    private int uid;
    private static int id=0;

    public Cat (String name, int distanceRun) {
        super (name, distanceRun);
        uid=++id;
        System.out.println ("Hello, I'm the " + uid + " cat. My name is " + this.name + ".");
    }

    @Override
    public void swim() {
        System.out.println (this.name + " can not swim.");
    }

}
