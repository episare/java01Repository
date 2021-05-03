package Lection04.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp_04 {

    public static int mapSizeX;
    public static int mapSizeY;
    public static char[][] map;
    public static int markNumberToWin;
    public static char markX = 'X';
    public static char markO = 'O';
    public static char emptyField = '_';
    public static int turnX;
    public static int turnY;
    public static String result;

    public static Scanner scannerIn = new Scanner (System.in);
    public static Random randomTurn = new Random();

    public static void main (String[] args) {

        mapSizeX=3;
        mapSizeY=3;
        map = new char[mapSizeX][mapSizeY];
        markNumberToWin=3;

        initMap();
        printMap();
        System.out.println("Start the game!");

        while (true) {
            setTurnOfPlayer();
            if (isDraw()) {
                result = "It is draw";
                break;
            } else if (isWin(markX,markNumberToWin)) {
                result = "You win! :)";
                break;
            }

            if (!setWin(markO, markX,markNumberToWin)) {
                if (!blockWin(markO, markX, markNumberToWin)) {
                    setTurnOfAI();
                }
            }
            if (isDraw()) {
                result = "It is draw";
                break;
            } else if (isWin(markO,markNumberToWin)) {
                result = "You loss :(";
                break;
            }

            printMap();
        }

        System.out.println(result);
        printMap();

    }

     public static void initMap () {
        for (int x=0; x<mapSizeX; x++) {
            for (int y=0; y<mapSizeY; y++) {
                map[x][y]=emptyField;
            }
        }
    }


    public static void printMap () {
        for (int x=0; x<mapSizeX; x++) {
            for (int y=0; y<mapSizeY; y++) {
                System.out.print(map[x][y] + "|");
            }
            System.out.println();
        }
    }

    public static void setTurnOfPlayer () {
        do {
            System.out.println("Give your turn - x and y:");
            turnX = scannerIn.nextInt()-1;
            turnY = scannerIn.nextInt()-1;
        } while (!checkTurnWithinMapBorder(turnX, turnY) || !checkTurnToEmptyField(turnX,turnY));
       map[turnX][turnY] = markX;
       System.out.println ("Your turn: x=" + (turnX+1) + " y=" +(turnY+1));
    }

    public static boolean checkTurnToEmptyField (int posX, int posY) {
        return (map[posX][posY] == emptyField);
    }

    public static boolean checkTurnWithinMapBorder (int posX, int posY) {
        return (posX>=0 && posX < mapSizeX && posY>=0 && posY < mapSizeY);
    }

    public static void setTurnOfAI () {
        do {
            turnX = randomTurn.nextInt(mapSizeX);
            turnY = randomTurn.nextInt(mapSizeY);
        } while (!checkTurnToEmptyField(turnX,turnY));
        map[turnX][turnY] = markO;
        System.out.println ("AI turn: x=" + (turnX+1) + " y=" +(turnY+1));
    }

    public static boolean isDraw () {
        for (int x=0; x<mapSizeX; x++) {
            for (int y=0; y<mapSizeY; y++) {
                if (map[x][y] == emptyField)
                    return false;
            }
        }
        return true;
    }

    public static boolean isWin(char player, int hitsToWin) {

        // check rows
        int x;
        int y;
        for (x=0; x<mapSizeX; x++) {
            for (y=0; y<mapSizeY; y++) {
                if (map[x][y] != player) {
                    break;  // next row
                }
            }
//            System.out.println ("row:"+y);
            if (y >= hitsToWin) return true;
        }

        // check columns
        for (y=0; y<mapSizeY; y++) {
             for (x=0; x<mapSizeX; x++) {
                if (map[x][y] != player) {
                    break;
                }
            }
//           System.out.println ("column:"+x);
            if (x >= hitsToWin) return true;
        }

        // check left diagonal
        for (x=0; x<mapSizeX; x++) {
           if (map[x][x] != player) {
                break;
            }
        }
//        System.out.println ("left:"+x);
        if (x >= hitsToWin) return true;


        // check right diagonal
        for (x=0; x<mapSizeX; x++) {
            if (map[x][mapSizeX-1-x] != player) {
                break;
            }
        }
//       System.out.println ("right:"+x);
        return (x == mapSizeX);
    }

    public static boolean blockWin (char player, int markOpponent, int hitsToWin) {
        // check rows
        int hitsNumber = 0;
        for (int x = 0; x < mapSizeX; x++) {
            for (int y = 0; y < mapSizeY; y++) {
                if (map[x][y] == markOpponent) {
                    hitsNumber++;
                } else if (map[x][y] == player) {
                    hitsNumber = 0;
                }
            }
  //          System.out.println("Rows number hitsNumber="+hitsNumber);
            if (hitsNumber == hitsToWin - 1) {
                for (int y = 0; y < mapSizeY; y++) {
                    if (map[x][y] == emptyField) {
                        map[x][y] = player;
                        return true;
                    }
                }
            }
            hitsNumber = 0;
        }
        // check columns
        hitsNumber = 0;
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[x][y] == markOpponent) {
                    hitsNumber++;
                } else if (map[x][y] == player) {
                    hitsNumber = 0;
                }
            }
 //           System.out.println("Columns number hitsNumber="+hitsNumber);
            if (hitsNumber == hitsToWin - 1) {
                for (int x = 0; x < mapSizeX; x++) {
                    if (map[x][y] == emptyField) {
                        map[x][y] = player;
                        return true;
                    }
                }
            }
            hitsNumber = 0;
        }

        // check left diagonal
        hitsNumber = 0;
        for (int x=0; x<mapSizeX; x++) {
            if (map[x][x] == markOpponent) {
                hitsNumber++;
            } else if (map[x][x] == player) {
                hitsNumber = 0;
            }
        }
 //       System.out.println("Left diagonal number hitsNumber="+hitsNumber);
        if (hitsNumber == hitsToWin - 1) {
            for (int x = 0; x < mapSizeX; x++) {
                if (map[x][x] == emptyField) {
                    map[x][x] = player;
                    return true;
                }
            }
         }

        // check right diagonal
        hitsNumber = 0;
        for (int y=0; y<mapSizeY; y++) {
            if (map[y][mapSizeY-1-y] == markOpponent) {
                hitsNumber++;
            } else if (map[y][mapSizeY-1-y] == player) {
                hitsNumber = 0;
            }
        }
 //       System.out.println("Right diagonal number hitsNumber="+hitsNumber);
        if (hitsNumber == hitsToWin - 1) {
            for (int y = 0; y < mapSizeY; y++) {
                if (map[y][mapSizeY-1-y] == emptyField) {
                    map[y][mapSizeY-1-y] = player;
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean setWin (char player, int markOpponent, int hitsToWin) {
        // check rows
        int hitsNumber;
        for (int x = 0; x < mapSizeX; x++) {
            hitsNumber = 0;
            for (int y = 0; y < mapSizeY; y++) {
                if (map[x][y] == player) {
                    hitsNumber++;
                } else if (map[x][y] == markOpponent) {
                    hitsNumber = 0;
                }
            }
 //           System.out.println("Rows number hitsNumber="+hitsNumber);
            if (hitsNumber == hitsToWin - 1) {
                for (int y = 0; y < mapSizeY; y++) {
                    if (map[x][y] == emptyField) {
                        map[x][y] = player;
                        return true;
                    }
                }
            }
       }
        // check columns
        for (int y = 0; y < mapSizeY; y++) {
            hitsNumber = 0;
            for (int x = 0; x < mapSizeX; x++) {
                if (map[x][y] == player) {
                    hitsNumber++;
                } else if (map[x][y] == markOpponent) {
                    hitsNumber = 0;
                }
            }
  //          System.out.println("Columns number hitsNumber="+hitsNumber);
            if (hitsNumber == hitsToWin - 1) {
                for (int x = 0; x < mapSizeX; x++) {
                    if (map[x][y] == emptyField) {
                        map[x][y] = player;
                        return true;
                    }
                }
            }
        }

        // check left diagonal
        hitsNumber = 0;
        for (int x=0; x<mapSizeX; x++) {
             if (map[x][x] == player) {
                hitsNumber++;
            } else if (map[x][x] == markOpponent) {
                hitsNumber = 0;
            }
        }
 //       System.out.println("Left diagonal number hitsNumber="+hitsNumber);
        if (hitsNumber == hitsToWin - 1) {
            for (int x = 0; x <mapSizeX; x++) {
                if (map[x][x] == emptyField) {
                    map[x][x] = player;
                    return true;
                }
            }
        }

        // check right diagonal
        hitsNumber = 0;
        for (int y=0; y<mapSizeY; y++) {
            if (map[y][mapSizeY-1-y] == player) {
                hitsNumber++;
            } else if (map[y][mapSizeY-1-y] == markOpponent) {
                hitsNumber = 0;
            }
        }
  //      System.out.println("Right diagonal number hitsNumber="+hitsNumber);
        if (hitsNumber == hitsToWin - 1) {
            for (int y = 0; y < mapSizeY; y++) {
                if (map[y][mapSizeY-1-y] == emptyField) {
                    map[y][mapSizeY-1-y] = player;
                    return true;
                }
            }
        }
        return false;
    }
}
