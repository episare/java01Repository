package Lection07.homework;

public class Animal {

    protected int distanceCanRun;
    protected final String name;
    protected final String type;
    public static int countAnimals=0;

    public Animal (String type, String name, int canDistanceRun) {
        this.type=type;
        this.name=name;
        this.distanceCanRun=canDistanceRun;
        ++countAnimals;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceCanRun = distanceRun;
    }

    public void run (int distance) {
        if (distance <= this.distanceCanRun) {
            System.out.println(this.type + " " + this.name + " can run " + distanceCanRun + " meters." +
                    " It just run " + distance + " meters.");
        } else {
            System.out.println(this.type + " " + this.name + " can run no more then " + this.distanceCanRun + " meters.");
        }
    }

    public void swim () {
        System.out.println(this.type + " " + this.name + " can swim.");
    }

}
