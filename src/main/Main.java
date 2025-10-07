package main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Legend of Java");

        try {
            ImageIcon icon = new ImageIcon("res/player/boy_down_1.png");
            window.setIconImage(icon.getImage());
        } catch (Exception e) {
            System.out.println("Image not found, using default");
        }

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        gamePanel.startGameThread();

    }

}
