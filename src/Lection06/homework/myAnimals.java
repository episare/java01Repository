package Lection06.homework;

public class myAnimals {

    private static Dog myDogRex = new Dog("Rex", 500, 10);
    private static Dog myDogCharlie = new Dog("Charlie", 500);
    private static Cat myCatTiger = new Cat("Tiger", 200);
    private static Cat myCatSmoky = new Cat("Smoky", 200);
    private static Cat myCatMax = new Cat("Max", 200);


    public static void main (String args[]) {
        myDogCharlie.setDistanceSwim(10);
        myCatTiger.swim();
        myDogRex.run(300);
        myDogCharlie.run(600);
        myDogRex.swim();
        myDogRex.swim(20);
        myDogRex.swim(5);
        myDogCharlie.swim(myDogCharlie.getDistanceSwim());
        myCatSmoky.run(100);
        myCatMax.run(250);
    }

}
