package Lection07.homework;

public class Dog extends Animal {

    public static int countDogs=0;
    private int distanceCanSwim;

    public Dog (String type, String name, int distanceRun) {
        super (type, name, distanceRun);
        ++countDogs;
        System.out.println ("Hello, I'm the " + countDogs + " dog. My name is " + this.name + ".");
    }

    public Dog (String type, String name, int distanceRun, int distanceSwim) {
        this (type, name, distanceRun);
        this.distanceCanSwim=distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceCanSwim = distanceSwim;
    }

    public int getDistanceSwim() {
        return distanceCanSwim;
    }

    public void swim (int distance) {
        if (distance <= this.distanceCanSwim) {
            System.out.println(this.type + " " + this.name + " can run " + distanceCanSwim + " meters."  + "It just swam " + distance + " meters.");
        } else {
            System.out.println(this.type + " " + this.name + " can swim no more then " + this.distanceCanSwim + " meters.");
        }
    }

}
