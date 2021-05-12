package Lection06.homework;


public class Dog extends Animal {

    private int uid;
    private static int id=0;
    private int distanceCanSwim;

    public Dog (String name, int distanceRun) {
        super (name, distanceRun);
        uid=++id;
        System.out.println ("Hello, I'm the " + uid + " dog. My name is " + this.name + ".");
    }

    public Dog (String name, int distanceRun, int distanceSwim) {
        this (name, distanceRun);
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
            System.out.println(this.name + " just swam " + distance + " meters.");
         } else {
            System.out.println(this.name + " can swim no more then " + this.distanceCanSwim + " meters.");
        }
    }

}
