package Lection01.homework;

public class Homework1 {

    // 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
    public static void main(String[] args) {

        printThreeWords1();
        printThreeWords2("Orange", "Banana", "Apple");
        printThreeWords3();

        System.out.println("***************");
        if (checkSumSign(10, 20)) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }

        System.out.println("***************");
        System.out.println(printColor(101));

        System.out.println("***************");
        System.out.println(compareNumbers1(10, 15));

        if (compareNumbers2(20, 15)) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords1() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void printThreeWords2(String value1, String value2, String value3) {
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }

    public static void printThreeWords3() {
        System.out.println("_Orange \n_Banana \n_Apple \n");
    }

    // 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями,
    // которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
    }

    public static void checkSumSignError(int a, int b) {
        int a1 = a;
        int b1 = b;
        int result = a1 + b1;
        if (result >= 0) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }
    }

    // 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
// то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }

    // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static String compareNumbers1(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }

    public static boolean compareNumbers2(int a, int b) {
        return a >= b;
    }

// 6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
}
