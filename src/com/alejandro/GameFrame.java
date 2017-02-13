package com.alejandro;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class GameFrame implements ActionListener, KeyListener {
    
    private JFrame frame;
    private GamePanel panel;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    private final int FPS = 60;

    private Bird bird = new Bird();
    private ArrayList<Pipe> pipes = new ArrayList<>();

    private Timer timer;
    private int ticks = 0;


    GameFrame(){

        frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(this);

        panel = new GamePanel(bird, pipes);
        frame.add(panel);


        timer = new Timer(1000/FPS, this);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        bird.gravity();

        if (bird.getYPosition() > HEIGHT - 120){
            bird.setYPosition(HEIGHT - 120 - bird.getHeight());
            bird.setVelocity(0);
            bird.setGravityForce(0);
        }

        if (bird.getYPosition() < 0){
            bird.setYPosition(0);
            bird.setVelocity(0);
            bird.setGravityForce(0);
        }


        ticks++;
        if (ticks == 120){
            pipes.add(new Pipe(800, 0));
            pipes.add(new Pipe(800, 800-150-200));
            ticks = 0;
        }


        panel.repaint();



    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            bird.jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
