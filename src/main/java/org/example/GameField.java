package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameField extends JPanel {

    private final int SIZE = 640;
    private final int DOT_SIZE = 32;
    private final int ALL_DOTS = 400;
    private Image dot;
    private Image food;
    private int foodX;
    private int foodY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left;
    private boolean right = true;
    private boolean up;
    private boolean down;
    private boolean inGame = true;

    public GameField() {
        setBackground(Color.BLACK);
    }

    public void loadImages() {
        ImageIcon foo = new ImageIcon("food.png");
        food = foo.getImage();
        ImageIcon snk = new ImageIcon("dot.png");
        dot = snk.getImage();
    }

    public void initGame() {
        dots = 3;
        for (int i = 0; i < dots; i++) {
            x[i] = 96;
            y[i] = 96;
            timer = new Timer(100, this);
            timer.start();
            createFood();
        }
    }

    public void createFood() {
        foodX = new Random();
    }
}
