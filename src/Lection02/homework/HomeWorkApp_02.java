package Lection02.homework;

public class HomeWorkApp_02 {

    // Homework to lesson 02
    public static void main (String[] args) {
        System.out.println("Start program");

        System.out.println ("\n 1 --------------");
        System.out.println("Sum is between 10 and 20 = " + checkSum (1, 9));
        System.out.println("Sum is between 10 and 20 = " + checkSum (1, 8));

        System.out.println ("\n 2 --------------");
        printSign(0);
        printSign(10);
        printSign(10-20);

        System.out.println ("\n 3 --------------");
        System.out.println(checkInt(5));
        System.out.println(checkInt(-5));
        System.out.println(checkInt(1-2));

        System.out.println ("\n 4 --------------");
        printStringNTimes("Hello my friend", 5);

        System.out.println ("\n 5 --------------");
        int y1 = 1900;
        int y2 = 2000;
        int y3 = 2020;
        int y4 = 2021;
        System.out.println(y1 + " is a leap year = " + checkYear(y1));
        System.out.println(y2 + " is a leap year = " + checkYear(y2));
        System.out.println(y3 + " is a leap year = " + checkYear(y3));
        System.out.println(y4 + " is a leap year = " + checkYear(y4));

    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean checkSum (int a, int b) {
        return ( (a + b) <= 20 && (a + b) >= 10);
    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void printSign (int num) {
        System.out.println ("Input is " +  ((num >= 0) ? "positive" : "negative"));
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkInt (int num) {
        return ( !(num >= 0));
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printStringNTimes (String str, int times) {
        for (int i=1; i <= times; i++) {
            System.out.println(i + ". " + str);
        }
    }

    // 5. * Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean checkYear (int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

