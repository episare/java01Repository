package Lection06.homework;

public class Animal {

    protected int distanceCanRun;
    protected final String name;

    public Animal (String name, int canDistanceRun) {
        this.name=name;
        this.distanceCanRun=canDistanceRun;
   }

    public void setDistanceRun(int distanceRun) {
        this.distanceCanRun = distanceRun;
    }

    public void run (int distance) {
        if (distance <= this.distanceCanRun) {
            System.out.println(this.name + " just run " + distance + " meters.");
        } else {
            System.out.println(this.name + " can run no more then " + this.distanceCanRun + " meters.");
        }
    }

    public void swim () {
        System.out.println(this.name + " can swim.");
    }

}