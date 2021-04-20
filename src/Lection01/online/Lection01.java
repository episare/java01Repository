package Lection01.online;
// one-line com

/*
comm1
comm2
 */

    /**
     * JavaDoc com
     **/

    public class Lection01 {

        public static void main(String[] args) {
//        System.out.print("Hello_Java!!!!");
//        System.out.println("Hello_World!!!!");
//        System.out.print("Hello_World!!!!");

//        String myString1 = "This is my first string";
//        String myString2 = "This is my second string";
//        System.out.println(myString1 + myString2); //конкатенация строк
//
//        //Целочисленные
//        byte myByte = 50; //-128..+127 (1 byte)
//        short myShort = -32768; //-32768..+32767 (2 byte)
//        int myInteger = 5267890; //-2,1млдр .. +2,1млдр (4 byte)
//        long myLong = 3000000000L; //-2^63 .. +2^63 (8 byte)
//
//        System.out.println(myInteger);
//
//        //числа с точкой
//        float myFloat = 956.789f; //(4 byte) - <>.0000000
//        double myDouble = 956.789; // (8 byte) - <>.00000000000000
//
//        //symbols
//        char myChar = 'q'; // (2 byte)
//
//        //boolean
//        boolean myBoolean = true;//false (1 byte)
//
//        //Math
//        //+,-,*,/,^
//
//        int a = 45;
//        int b = 76;
//        System.out.println(a * b);
//
//        int c = 15;
//        int d = 3;
//        System.out.println(c % d);
//        int a = 10;
//
//        if (a > 20) {
//            System.out.println("a > 20");
//            System.out.println("Privet");
//        } else {
//            System.out.println("a < 20");
//            System.out.println("Medved");
//        }

            int a = 150;
            int b = 200;
            int result;

//        result = a + b;
//        System.out.println(result); //350;

            System.out.println(thisIsMethodMyMath(a, b)); //350

            a = a + 1;
//        result = a + b;
//        System.out.println(result); //351;
            System.out.println(thisIsMethodMyMath(a, b));
            b = b + 1;
//        result = a + b;
//        System.out.println(result); //352;
            System.out.println(thisIsMethodMyMath(a, b));
            a = a + 1;
//        result = a + b;
//        System.out.println(result); //353;
            System.out.println(thisIsMethodMyMath(a, b));


            doSomething();
            doSomething();
            doSomething();
            doSomething();
        }

        public static int thisIsMethodMyMath(int valueA, int valueB) { // возвращающий значения метод
            return valueA + valueB * 10;
        }

        public static void doSomething() { //метод ничего не возвращающий
            int a = 10;
            int b = 20;
            System.out.println(a * b);
        }

    }

/*
1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
_Orange
_ Banana
_ Apple

3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
если больше 100 (100 исключительно) - “Зеленый”;

5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите.
Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
 */


