package Lection03.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 21.04.2021
 */

public class Lection03 {

    public static Random random = new Random(); //[0;1) 0.9999999

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        recordUserData("Your result: ", userInt());

        String stringUser = scanner.next();
        System.out.println("Your string data is " + stringUser);


//        int[][] myArrayDouble = new int[5][10];
//        int count = 0;
//
//        for (int y = 0; y < myArrayDouble.length; y++) {
//            for (int x = 0; x < myArrayDouble[y].length; x++) {
//                myArrayDouble[y][x] = count;
//                count++;
//            }
//        }

//        for (int i = 0; i < myArrayDouble.length; i++) {
//            for (int j = 0; j < myArrayDouble[i].length; j++) {
//                System.out.print(myArrayDouble[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        String[] myTestArray = new String[20];
//
//        for (int i = 0; i < myTestArray.length; i++) {
//            System.out.print(myTestArray[i] + " | ");
//        }
//
//        int a= 5;
//        int b= 10;
//
//        int[] intAr = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(intAr[5]);
//        int abc = 150;
//
//        int[] myArray = new int[5];
//        myArray[0] = 89;
//        myArray[1] = -15;
//        myArray[2] = abc;
//        myArray[3] = 198;
//        myArray[4] = -1;
//
//        System.out.println(myArray[2]);
//        myArray[2] = 999;
//        System.out.println(myArray[2]);

//        String[] myArrayString = {"String1", "String2"," String3", "String4"};

//        float[] myArrayFloat = new float[120];
//
//        for (int i = 0; i < myArrayFloat.length; i++) {
//            myArrayFloat[i] = random.nextFloat();
//        }

//        for (int i = 0; i < myArrayFloat.length; i++) {
//            System.out.print(i + "=" + myArrayFloat[i] + " | ");
//        }
//"StringN"

//        fillArray(myArrayString);
//        printArray(myArrayString);

//        String[] myStringFromFloat = workWithArray(myArrayFloat);
//        printArray(myStringFromFloat);

//        System.out.println(random.nextFloat());
//        int x = 5;
//
//        System.out.println(random.nextInt(x)); //[0;5)
//        System.out.println(random.nextInt(x));
//        System.out.println(random.nextInt(x));
//
//        String[] myArrayString = new String[500];
//
//        String[] box = new String[50];
//
//        fillBox(box, "Cat");
//        printArray(box);

//        for (int i = 0; i < myArrayString.length; i++) {
//            myArrayString[i] = box[random.nextInt(box.length)]; //[0;50) box[5] | box[25]
//        }

//        printArray(myArrayString);
//        fillArray(myArrayString);
//        printArray(myArrayString);

    }

    public static void recordUserData(String welcomeMessage, int userValue){
        System.out.println(welcomeMessage + (userValue * 20));
    }

    public static int userInt(){
        System.out.print("Enter your value: ");
        return scanner.nextInt();
    }

//    public static void fillBox(String[] inputArray, String inputString) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = inputString + (i + 1);
//        }
//    }
//
//    public static void fillArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = "String" + random.nextInt(150);
//        }
//    }
//
//    public static String[] workWithArray(float[] inputArrayFloat) {
//        String[] tmp = new String[inputArrayFloat.length];
//        for (int i = 0; i < tmp.length; i++) {
//            tmp[i] = Float.toString(inputArrayFloat[i]);
//        }
//        return tmp;
//    }
//
//    public static void printArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(i + "=" + inputArray[i] + " | ");
//        }
//        System.out.println();
//    }

}

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
 * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * **Примеры:
 * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 * checkBalance([1, 1, 1, ||| 2, 1]) → false, т.е. 1 + 1 + 1 = 2 + 1
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */
