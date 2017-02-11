package com.alejandro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameFrame implements ActionListener, KeyListener {
    
    private JFrame frame;
    private JPanel panel;

    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    private final int FPS = 60;

    private Rectangle bird;

    private Timer timer;

    GameFrame(){

        frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(this);

        panel = new GamePanel();
        frame.add(panel);


        timer = new Timer(1000/FPS, this);
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        panel.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
