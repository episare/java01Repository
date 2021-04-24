package Lection03.homework;

public class HomeWorkApp_03 {

    public static void main (String[] args) {

        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] arr01 = setOppositeValue(new int[]{ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        for (int i=0; i<arr01.length; i++) {
                System.out.print(arr01[i] + "\t");
            }
        System.out.println();

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int [] arr02 = new int[100];
        for (int i=0; i<100; i++) {
            arr02[i] = i+1;
            System.out.print(arr02[i] + "\t");
        }
        System.out.println();

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] arr03 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i < arr03.length; i++) {
            if (arr03[i] < 6) {
                arr03[i] = arr03[i]*2;
            }
            System.out.print(arr03[i] + "\t");
        }
        System.out.println();

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int [][] arr04 = new int[11][11];
        for (int i=0; i<arr04.length; i++) {
            for (int j=0; j<arr04[i].length; j++) {
                if (j==i || j==((arr04[i].length-1)-i)) { // (длина по j)-1
                    arr04[i][j] = 1;
                }
                System.out.print(arr04[i][j] );
            }
            System.out.println();
         }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int []arr05 = initArrayWithValue(10, 25);
        for (int i=0; i<arr05.length; i++) {
            System.out.print(arr05[i] + "\t");
        }
        System.out.println();

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[] arr06 = { 1, 5, 3, 2, 11, 4, 5, 0, 4, 8, -3, 9, 16, 10 };
        int maxValue = 0;
        int minValue = 0;
        for (int arrValue : arr06) {
            if (arrValue < minValue) {
                minValue = arrValue;
            }
            if (arrValue > maxValue) {
                maxValue = arrValue;
            }
        }
        System.out.print ("Max value = " + maxValue + "\nMin value = " + minValue);
        System.out.println();

        //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        //**Примеры:
        //checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        //checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
        //
        //граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
        //
        System.out.println (checkSumLeftWrite(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println (checkSumLeftWrite(new int[]{1, 1, 1, 2, 1, 2}));


        //8. *** Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        // [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        // При каком n в какую сторону сдвиг можете выбирать сами.
        int[] arr08 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        System.out.println ("original values: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100");
        System.out.println("Shift to the right +3");
        int [] newArr = shiftValuesToN(arr08, 3);
        for (int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        System.out.println();

        System.out.println("Shift to the left -3");
        newArr = shiftValuesToN(arr08, -3);
        for (int i=0; i<newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        System.out.println();
    }

    /* ----------------------------- */
    public static int[] setOppositeValue (int[] inputArr) {
        for (int i=0; i<inputArr.length; i++) {
            inputArr[i] = Math.abs((inputArr[i]-1));
        }
        return inputArr;
    }

    /* ----------------------------- */
    public static int[] initArrayWithValue (int len, int initValue) {
        int [] arr = new int [len];
        for (int i=0; i<len; i++) {
            arr[i]=initValue;
        }
        return arr;
    }

    /* ----------------------------- */
    public static boolean checkSumLeftWrite (int[] inputArr) {
        int countL=1;
        int countR=1;
        int valueL=inputArr[0];
        int valueR=inputArr[inputArr.length-1];

        while (countL+countR < inputArr.length) {
            if (valueL <= valueR) {
                valueL += inputArr[countL];
                countL++;
            } else {
                valueR += inputArr[inputArr.length-1-countR];
                countR++;
            }
        }
        return valueL==valueR;

    }

    /* ----------------------------- */
    public static int[] shiftValuesToN (int[] arr, int n) {
        int[] tmp = new int[arr.length];

        if (n > 0) {
            for (int i=0; i<arr.length; i++) {
                tmp[(i+n)%arr.length] = arr[i];
            }
        } else if (n < 0) {
            for (int i=0; i<arr.length; i++) {
                 tmp[i]=arr[(i-n)%arr.length];
            }
        }
        return tmp;
    }

}
