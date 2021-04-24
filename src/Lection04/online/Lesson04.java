package Lection04.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 24.04.2021
 */

public class Lesson04 {

    public static char[][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty_field = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = empty_field;
            }
        }
    }

    public static void showMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Enter your turn coordinates from 1 before " + mapSizeX + ":");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        map[y][x] = human;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(mapSizeX); //[0;mapSize)
            y = random.nextInt(mapSizeY);
        } while (!isEmptyCell(x, y));
        System.out.println("AI turn is [" + (y + 1) + ":" + (x + 1) + "]");
        map[y][x] = ai;
    }

    public static boolean isValidCell(int x, int y) {
        return x >= 0 && x < mapSizeX && y >= 0 && y < mapSizeY;
    }

    public static boolean isEmptyCell(int x, int y) {
        return map[y][x] == empty_field;
    }

    public static boolean isDraw() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[y][x] == empty_field) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWin(char player) {
        if (map[0][0] == player && map[0][1] == player && map[0][2] == player) return true;
        if (map[1][0] == player && map[1][1] == player && map[1][2] == player) return true;
        if (map[2][0] == player && map[2][1] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][0] == player && map[2][0] == player) return true;
        if (map[0][1] == player && map[1][1] == player && map[2][1] == player) return true;
        if (map[0][2] == player && map[1][2] == player && map[2][2] == player) return true;

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;

        return false;
    }

//    public static void createMap(int sizeX, int sizeY) {
//        mapSizeX = sizeX;
//        mapSizeY = sizeY;
//        map = new char[mapSizeY][mapSizeX];
//    }

    public static void main(String[] args) {
        createMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();
            if (isWin(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }

            aiTurn();
            showMap();

            if (isWin(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (isDraw()) {
                System.out.println("Is Draw!!!");
                break;
            }
        }
        System.out.println("Game over!");
    }
}

/**
 * Полностью разобраться с кодом, попробовать переписать с нуля;
 * ^ Усовершенствовать метод проверки победы (через циклы);
 * ^ Расширить поле до 5х5 и в качестве условий победы установить серию равной 4.
 * ^^ Проработать базовый искусственный интеллект, чтобы он мог блокировать ходы игрока.
 */
