package Lection08.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyGameMap extends JPanel {

    private MyMainWindow mainWindow;
    private int mapSizeX;
    private int mapSizeY;
    private int winLength;

    private int cellWidth;
    private int cellHeight;
    private boolean initMap;
    private boolean gameOver;

    public static int [][] map;
    public static int markNumberToWin;
    public static int human = 1;
    public static int ai = 2;
    public static int emptyField = 0;
    public static int turnX;
    public static int turnY;
    public static String result;

    public static Random randomTurn = new Random();


    MyGameMap (MyMainWindow mainWindow) {
        this.mainWindow = mainWindow;
        setBackground(new Color(0, 0, 0));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                update(e);
            }
        });

        initMap = false;

    }

    void startGameWithUserSettings (int mapSizeX, int mapSizeY, int winLen) {
        this.mapSizeX = mapSizeX;
        this.mapSizeY = mapSizeY;
        this.winLength = winLen;
        map = new int [mapSizeY][mapSizeX];

        showMessage("Map size is " + mapSizeX + "x" + mapSizeY + " Win length is " + winLen);

        initMap = true;
        gameOver = false;
        repaint();
    }

    private void showMessage (String text) {
        JOptionPane.showMessageDialog(this, text);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render (g);
     }

     private void update(MouseEvent e) {
        repaint();

        if (!initMap) return;
        if (gameOver) return;

        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

//       System.out.println (cellX + " " + cellY);

        if (!checkTurnWithinMapBorder(cellX, cellY) || !checkTurnToEmptyField(cellX, cellY)) {
            return;
        }

        map[cellX][cellY]=human;
        mainWindow.log("Player > " + (cellX + 1) + " : " + (cellY + 1));

         if (isDraw()) {
             showMessage("It's draw!");
             gameOver = true;
             return;
         } else if (isWin(human)) {
            showMessage("Human win!");
            gameOver = true;
            return;
        }


         if (!setWin(ai, human, winLength)) {
             if (!blockWin(ai, human, winLength)) {
                 setTurnOfAI();
             }
         }

         if (isDraw()) {
             showMessage("It's draw!");
             gameOver = true;
             return;
         } else if (isWin(ai)) {
             showMessage("AI win!");
             gameOver = true;
             return;
         }

     }

     private void render (Graphics g) {
        if (!initMap) return;

        int height = getHeight();
        int width = getWidth();

        cellWidth = width / mapSizeX;
        cellHeight = height / mapSizeY;

        g.setColor(Color.WHITE);

        for (int x=0; x < mapSizeY; x++) {
            int y = x * cellHeight;
            g.drawLine(0, y, width, y);
        }

        for (int y=0; y < mapSizeX; y++) {
            int x = y * cellWidth;
            g.drawLine(x, 0, x, height);
        }

        for (int y=0; y < mapSizeY; y++) {
            for (int x=0; x < mapSizeX; x++) {
                if (checkTurnToEmptyField(x, y)) continue;

                if (map[x][y] == human) {
                    g.setColor(Color.GREEN);
                    g.fillOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                } else if (map[x][y] == ai) {
                    g.setColor(Color.RED);
                    g.fillOval(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }
            }
        }

    }

    private void initMap () {
        for (int x=0; x<mapSizeX; x++) {
            for (int y=0; y<mapSizeY; y++) {
                map[x][y]=emptyField;
            }
        }
    }

    private boolean checkTurnToEmptyField (int posX, int posY) {
        return (map[posX][posY] == emptyField);
    }

   private boolean checkTurnWithinMapBorder (int posX, int posY) {
        return (posX>=0 && posX < mapSizeX && posY>=0 && posY < mapSizeY);
    }

    private void setTurnOfAI () {
        do {
            turnX = randomTurn.nextInt(mapSizeX);
            turnY = randomTurn.nextInt(mapSizeY);
        } while (!checkTurnToEmptyField(turnX,turnY));
        map[turnX][turnY] = ai;
        mainWindow.log ("AI turn: x=" + (turnX+1) + " y=" +(turnY+1));
    }

    private boolean isDraw () {
        for (int x=0; x<mapSizeX; x++) {
            for (int y=0; y<mapSizeY; y++) {
                if (map[x][y] == emptyField)
                    return false;
            }
        }
        return true;
    }

    private boolean isWin(int player) {

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
            if (y >= winLength) return true;
        }

        // check columns
        for (y=0; y<mapSizeY; y++) {
            for (x=0; x<mapSizeX; x++) {
                if (map[x][y] != player) {
                    break;
                }
            }
//           System.out.println ("column:"+x);
            if (x >= winLength) return true;
        }

        // check left diagonal
        for (x=0; x<mapSizeX; x++) {
            if (map[x][x] != player) {
                break;
            }
        }
//        System.out.println ("left:"+x);
        if (x >= winLength) return true;


        // check right diagonal
        for (x=0; x<mapSizeX; x++) {
            if (map[x][mapSizeX-1-x] != player) {
                break;
            }
        }
//       System.out.println ("right:"+x);
        return (x == mapSizeX);
    }

    private boolean blockWin (int player, int markOpponent, int hitsToWin) {
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
    private boolean setWin (int player, int markOpponent, int hitsToWin) {
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
