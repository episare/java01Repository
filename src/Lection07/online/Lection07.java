package Lection07.online;

import Lection06.homework.Homework.Cat;
import Lection06.online.Titan;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 12.05.2021
 */

public class Lection07 extends Object {

//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String exampleString = "Example"; //String exampleString = new String ("Example");
        StringBuilder stringBuilder = new StringBuilder("Example");

        long startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            exampleString += i; //Example0123456
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(exampleString);
        System.out.println("Work for-cycle for String = " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i);//Example0123456
        }

        deltaTime = System.nanoTime() - startTime;

        System.out.println(stringBuilder.toString());
        System.out.println("Work for-cycle for StringBuilder = " + deltaTime * 0.000001f + " millisec.");
        System.out.println(exampleString.equals(stringBuilder.toString()));
//        byte b1 = 40;
//        int i1 = b1;
//
//        int i2 = 150000;
//        short b2 = (short) i2;
//
//        System.out.println(b2);
//
//        String testString = "Hello";
//
//        char myChar = 'H';
//        System.out.println((int) myChar);
//        System.out.println((char) b1); //type casting
//
//        Object[] myObjects = new Object[4];
//        myObjects[0] = i2;
//        myObjects[1] = testString;
//        myObjects[2] = new Cat("Barsik", 15, 20, 30);
//        myObjects[3] = new Titan("Titan", 100, 50, 25, 3555);
//
//        for (int i = 0; i < myObjects.length; i++) {
//            if (myObjects[i] instanceof String) {
////                System.out.println(((Cat) myObjects[i]).swim(150));
//                System.out.println(((String) myObjects[i]).length());
//            }
//        }




//        String s0 = "Hello world"; //s0 = Hello_world
//        String s1 = "Hello "; // s1 = Hello_world
//        s1 += "world";
//
////        String s2 = scanner.nextLine(); // s2 = Hello_world
//
//        String s3 = "Hello world";// s3 = Hello_world
//
//        System.out.println(s0);
//        System.out.println(s1);
////        System.out.println(s2);
//        System.out.println(s3);
//
//        System.out.println("----------");
//
//        System.out.println(s0 == s1);
////        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println("----------");
//        System.out.println(s0.equals(s1));
////        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));
    }
}
