package com.alejandro;

import com.alejandro.Controller.BirdController;
import com.alejandro.Model.Bird;
import com.alejandro.Model.Pipe;
import com.alejandro.View.BirdView;

import javax.swing.*;
import java.util.ArrayList;


public class GameFrame {
    
    private JFrame frame;
    private GamePanel panel;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    private Bird bird = new Bird();
    private BirdView birdView = new BirdView();
    private BirdController birdController = new BirdController(bird, birdView);

    private ArrayList<Pipe> pipes = new ArrayList<>();

    GameFrame(){

        frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.addKeyListener(birdController);

        panel = new GamePanel(bird, pipes);
        frame.add(panel);

    }

}
