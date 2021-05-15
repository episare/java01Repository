package Lection07.homework;
import java.util.Random;

public class MyAnimals {

//    private static Dog myDogRex = new Dog("Rex", 500, 10);
//    private static Dog myDogCharlie = new Dog("Charlie", 500);
//    private static Cat myCatTiger = new Cat("Tiger", 200);
//    private static Cat myCatSmoky = new Cat("Smoky", 200);
//    private static Cat myCatMax = new Cat("Max", 200);

    private static Random random = new Random();

    public static void main (String[] args)  throws InterruptedException {

        Animal[] allAnimals = new Animal [8];
        String[] names = {"Rex", "Tiger", "Smoky", "Max", "Charlie", "Black", "Sunny", "Harry"};

        for (int i=0; i < allAnimals.length; i++) {
            if (random.nextInt() % 2 == 0) {
                allAnimals[i] = new Dog("Dog", names[i], random.nextInt(200)+300, random.nextInt(15)+10);
            } else {
                allAnimals[i] = new Cat("Cat", names[i], random.nextInt(200)+200);
            }
        }
        System.out.println();

        int distanceRun = random.nextInt(300)+100;
        int distanceSwim = random.nextInt(10)+15;

        System.out.println ("Must run: " + distanceRun+ " meters. ");
        System.out.println ("Must swim: " + distanceSwim+ " meters. \n ");

        for (int i=0; i < allAnimals.length; i++) {
            allAnimals[i].run(distanceRun);
            allAnimals[i].swim();
            if (allAnimals[i] instanceof Dog) {
                ((Dog) allAnimals[i]).swim(distanceSwim);
            }
            System.out.println();
            Thread.sleep(3000);
        }

//        myDogCharlie.setDistanceSwim(10);
//        myCatTiger.swim();
//        myDogRex.run(300);
//        myDogCharlie.run(600);
//        myDogRex.swim();
//        myDogRex.swim(20);
//        myDogRex.swim(5);
//        myDogCharlie.swim(myDogCharlie.getDistanceSwim());
//        myCatSmoky.run(100);
//        myCatMax.run(250);
    }

}
