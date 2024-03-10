package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Simple Chess");
        //closes program when closing the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //makes window non-resizable
        window.setResizable(false);

        // Add main.GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        //centers window
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        // once window is created we call this method creating the "Game loop" by calling the run() method
        gp.launchGame();
    }
}