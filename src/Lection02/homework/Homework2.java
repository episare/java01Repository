package Lection02.homework;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 17.04.2021
 */

public class Homework2 {

    public static void main(String[] args) {

        System.out.println("Результат задания 1 > " + checkNumbers(1, 15));
        System.out.println("***************");

        isPositive1(-20);
        System.out.println("***************");

        String result;

        result = (isPositive2(20)) ? "Number is positive" : "Number is negative";
        System.out.println(result);

        System.out.println("***************");

        methodPrintStringCount("Hello string" , -10);
        System.out.println("***************");

        int currentYear = 2021;
        System.out.println("Year " + currentYear + " is leap? > " + isLeapYear(currentYear));

    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
    */
    public static boolean checkNumbers(int first, int second) {
//        int sum = first + second;
//        return (sum <= 20) && (sum >= 10);
        return (first + second <= 20) && (first + second >= 10); // true
    }

//    public static boolean checkNumbersError(int first, int second) {
//        if ((first + second <= 20) && (first + second >= 10)) {
//            return true; // System.out.println("true");
//        } else {
//            return false;
//        }
//    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static void isPositive1(int variable) {
        if (variable >= 0) {
            System.out.println(variable + " is positive");
        } else {
            System.out.println(variable + " is negative");
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    public static boolean isPositive2(int variable) {
        return variable <= 0;
    }

    /*
4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
*/

    public static void methodPrintStringCount(String value, int count) {
        if (count < 0) {
            count = -count;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("String #" + (i + 1)  + ": " + value);
        }
    }

    /*
    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}




