package org.example;

import javax.swing.*;

public class Game extends JFrame {

    public Game(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,665);
        setLocation(800,800);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Game snake = new Game();
    }
}
