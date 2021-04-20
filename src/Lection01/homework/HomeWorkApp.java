package Lection01.homework;

public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords();

        checkSumSign(-1, 1);
        checkSumSign(-1, 0);

        System.out.println( printColor(0,1) );
        System.out.println( printColor(101,1) );
        System.out.println( printColor(101,0) );

        compareNumbers(5,4);
        compareNumbers(5,5);
        compareNumbers(5,6);
    }

    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign (int firstNum, int secondNum) {
        if (firstNum + secondNum >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    public static String printColor (int firstNum, int secondNum) {

        if (firstNum - secondNum <= 0)
            return ("Красный");
        else if (firstNum - secondNum <= 100)
            return ("Жёлтый");
        else
            return ("Зелёный");

    }

    public static void compareNumbers (int firstNum, int secondNum) {

        if (firstNum>=secondNum)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
}