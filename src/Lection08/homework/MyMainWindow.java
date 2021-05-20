package Lection08.homework;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMainWindow extends JFrame {

    private int winWidth=800;
    private int winHeight=600;
//    private int winPosX=600;
//    private int winPosY=200;
    private int minMapSize = 3;
    private int maxMapSize = 10;
    private int minWinLength = 3;

    private JButton buttonStart;
    private JButton buttonExit;
    private JButton buttonClearLog;

    private JPanel panelSettings;

    private MyGameMap gameMap;

    private JPanel panelControls;
    private JLabel labelMapSize;
    private JLabel labelWinLength;
    private JSlider sliderMapSize;
    private JSlider sliderWinLength;
    private String mapSizePrefix = "Map size is ";
    private String winLengthPrefix = "Win length is ";

    private JTextArea gameLog;
    private JScrollPane scrollPane;
    private int round = 0;

    MyMainWindow() {

        prepareWindow();
        prepareButtons();

        gameMap = new MyGameMap(this);

        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayout(2,1));
//        panelSettings.setBackground(Color.BLUE);

        prepareGameSettings();
        prepareGameLog();
        panelSettings.add(panelControls);
        panelSettings.add(scrollPane);  // scrollPane включает в себя TextArea gameLog

        add(gameMap);
        add(panelSettings, BorderLayout.EAST);

//        setLayout(new GridLayout(10, 15));
//        setLayout(new FlowLayout());
//        add (buttonStart, BorderLayout.NORTH);
//        add (buttonExit, BorderLayout.SOUTH);

        setVisible(true);
    };

    private void prepareWindow () {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
//        System.out.println("Width = " + dimension.getWidth() + " Height = " + dimension.getHeight());
        int screenSizeW = dimension.width;
        int screenSizeH = dimension.height;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(winWidth, winHeight);
        setLocation(screenSizeW/2-winWidth/2, screenSizeH/2-winHeight/2);
        setTitle("Tic Tac Toe");

        setResizable(false);
    }

    private void prepareButtons () {
        buttonStart = new JButton("Start game");
        buttonStart.setBackground(new Color(170, 220, 170));
        buttonExit = new JButton("Exit geme");
        buttonClearLog = new JButton("Clear log");

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(NORMAL);
            }
        });

        buttonClearLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLog.setText("");
            }
        });

    }

    private void prepareGameLog () {
        gameLog = new JTextArea();
        scrollPane = new JScrollPane(gameLog);
 //       gameLog.setLineWrap(true);
        gameLog.setEditable(false);
        gameLog.setBackground(new Color(185, 195, 215));

    }

    void log (String text) {
        gameLog.append(text + "\n");
    }

    private void prepareGameSettings () {

        panelControls = new JPanel();
        panelControls.setLayout(new GridLayout(7,1));

        mapSetupController();

        panelControls.add(labelMapSize);
        panelControls.add(sliderMapSize);
        panelControls.add(labelWinLength);
        panelControls.add(sliderWinLength);
        panelControls.add(buttonStart);
        panelControls.add(buttonExit);
        panelControls.add(buttonClearLog);
//        panelControls.add(gameLog);


    }

    private void mapSetupController () {
        labelMapSize = new JLabel(mapSizePrefix + minMapSize);
        labelWinLength = new JLabel(winLengthPrefix + minWinLength);

        sliderMapSize = new JSlider(minMapSize, maxMapSize, minMapSize);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentMapSize = sliderMapSize.getValue();
                sliderWinLength.setMaximum(currentMapSize);
                labelMapSize.setText(mapSizePrefix + currentMapSize);
            }
        });
        sliderWinLength = new JSlider(minWinLength, sliderMapSize.getValue(), minWinLength);
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                labelWinLength.setText(winLengthPrefix + sliderWinLength.getValue());
            }
        });


    }

    private void startGame() {
        int mapSize = sliderMapSize.getValue();
        int winLength = sliderWinLength.getValue();

        ++round;
        log("--- Round " + round + " --- ");
        log("New game " + + mapSize + "x" + mapSize + " | Win " + winLength);

        gameMap.startGameWithUserSettings(mapSize, mapSize, winLength);
    }

}
