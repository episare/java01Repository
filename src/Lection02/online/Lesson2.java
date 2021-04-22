package Lection02.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 17.04.2021
 */

public class Lesson2 {

    public static String valueFromClass = "Hello from Class!";

    public static void main(String[] args) {
//        String valueFromMethodMain = "Hello from methodMain!";
// result = a * b + (c / d); 248.47072

//        float result = valueA(10, 25, 10.159f) *
//                valueB(99.456f, 9.9f) +
//                (valueC(5) / valueD(200, 45));
//
//        System.out.println(result);
//        printResult(
//                valueA(valueD(100, 80), valueD(12, 5), valueD(150, 12)),
//                valueB(99.456f, 9.9f),
//                valueC(5),
//                valueD(200, 45)
//        );

//        for(int i = 0; i < 10; i++) { // i = i + 1 > i++
//            System.out.print(i + " ");
//        }

//        System.out.println("result a^b = " + myMath(2, 10));

//        tableFromPifagor(10,10);

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//
//            }
//        }

//        int a = 0;

//        while(a < 10) {
//            a++;
//            if (a == 5 || a == 7) {
//                continue;
//            }
//            System.out.print(a + " | ");
//        }

//        do {
//            a++;
//            if (a == 6) {
//                break;
//            }
//            System.out.print(a + " | ");
//        } while (a < 10);

//        int[] array = {12, 25, 99, 42, 84};
//        //for-each
//        for (int i : array) {
//            System.out.print(i + " | ");
//        }

//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Boris") {
//            System.out.println("Give letter Boris");
//        } else if (nameLetter == "Olga") {
//            System.out.println("Give letter Olga");
//        } else if (nameLetter == "Mike") {
//            System.out.println("Give letter Mike");
//        } else {
//            System.out.println("go out office");
//        }
//
//        System.out.println("**********");
//
//        switch (nameLetter) {
//            case "Boris": //nameLetter == "Boris"
//                System.out.println("Give letter Boris");
//                break;
//            case "Olga":
//                System.out.println("Give letter Olga");
//                break;
//            case "Mike":
//                System.out.println("Give letter Mike");
//                break;
//            default:
//                System.out.println("go out office");
//                break;
//        }

        int a = 15;
        int b = 20;
        int c;

        if (a > b) {
            c = a;
        } else {
            c = b;
        }

        c = (a > b) ? a : b;

        System.out.println(c);

        System.out.println("\nEnd program");

    }

    public static int myMath(int baseValue, int signature) {
        int result = 1;
        for (int i = 0; i < signature; i++) {
            result = result * baseValue;
        }
        return result;
    }

    public static void tableFromPifagor(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

//    public static void printResult(float a, float b, float c, int d) {
//        System.out.println(a * b + (c / d));
//    }
//
//    public static float valueA(int input1, int input2, float input3) {
//        return input1 * input2 / input3;
//    }
//
//    public static float valueB(float input1, float input2) {
//        return input1 / input2;
//    }
//
//    public static float valueC(int input) {
//        return input * input;
//    }
//
    public static int valueD(int input1, int input2) {
        return input1 % input2;
    }


}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
 * в противном случае – false.
 * 2. Написать метод, которому в качестве параметра передается целое число,
 * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
 * Замечание: ноль считаем положительным числом.
 * 3. Написать метод, которому в качестве параметра передается целое число.
 * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 * 4. Написать метод, которому в качестве аргументов передается строка и число,
 * метод должен отпечатать в консоль указанную строку, указанное количество раз;
 * 5.* Написать метод, который определяет, является ли год високосным,
 * и возвращает boolean (високосный - true, не високосный - false).
 * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
