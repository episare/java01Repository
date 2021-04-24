package Lection03.homework;

import java.util.Arrays;

public class Homework3 {

    public static void main(String[] args) {
        /*
         * 1.   Создать массив, состоящий из элементов 0 и 1, например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] array1 = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
        printArray1("1. Before\t", array1);
        change(array1);
        printArray1("1. After\t", array1);

        System.out.println("**********");

        /*
         * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] array2 = new int[100];
        fillIn(array2);
        printArray1("2. Filled with cycle:\t", array2);

        System.out.println("**********");

        /*
         * 3.   Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         * пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
         */
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1("3. Before:\t", array3);
        doubling(array3);
        printArray1("3. After:\t", array3);

        System.out.println("**********");

        /*
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        int side = 10;
        int[][] array4 = new int[side][side];
        crossFill(array4);
        printArray2("4. Result fill diagonals", array4);

        /*
         * 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
         */

        int[] returnArrayFromMethod = returnArray(10, 999);
        printArray1("5. Array from method", returnArrayFromMethod);

        /*
         * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
         */
        printArray1("6. Find min & max in array\t", array3);
        System.out.println("6. Minimum: " + findMin(array3));
        System.out.println("6. Maximum: " + findMax(array3));

        /*
         * 7.   ** Написать метод, в который передается не пустой
         * одномерный целочисленный массив, метод должен вернуть
         * true если в массиве есть место, в котором сумма
         * левой и правой части массива равны.
         * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
         * checkBalance ([2, 1, 1, 2, 1]) → false,
         * checkBalance ([10, || 10]) → true,
         * граница показана символами ||, эти символы в массив не входят.
         */
        int[] balance = {1, 1, 1, 1, 1, 1, 7};
        System.out.print("6. Is the " + Arrays.toString(balance) + " balanced? ");
        System.out.println(checkBalance(balance));

        /*
         * 8. Написать метод, которому на вход подаётся одномерный
         * массив и число n (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементы массива на n позиций.
         *
         * **** Для усложнения задачи нельзя пользоваться вспомогательными массивами
         */
        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray1("7. Array for shift", shiftArray);
        shifter(shiftArray, -3);
        printArray1("shift <<< (-3)", shiftArray);
        shifter(shiftArray, 6);
        printArray1("shift >>> (+6)", shiftArray);
    }

    /**
     * Вспомогательный метод. Печать одномерного массива в консоль
     *
     * @param inputArray
     */
    public static void printArray1(String msg, int[] inputArray) {
        System.out.print(msg + ": ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Вспомогательный метод. Печать двумерного массива в консоль
     *
     * @param inputArray
     */
    public static void printArray2(String msg, int[][] inputArray) {
        System.out.println(msg);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
//            if (array[i] == 1) {
//                array[i] = 0;
//            } else {
//                array[i] = 1;
//            }
//        array[i] = (array[i] == 1) ? 0 : 1;
        array[i] = 1 - array[i];
    }

    public static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }

    public static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) {
                array[i] *= 2;
            }
    }

    public static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }

        return tempArray;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int index : array)
            if (index < min) {
                min = index;
            }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    private static boolean checkBalance(int[] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = i + 1; j < array.length; j++)
                right += array[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    private static void shifter(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
    }
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
 * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 * 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг можете выбирать сами.
 */
