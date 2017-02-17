package com.alejandro;

import com.alejandro.Controller.PipeController;
import com.alejandro.Model.Bird;
import com.alejandro.Model.Pipe;
import com.alejandro.View.BirdView;
import com.alejandro.View.PipeView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    BirdView birdView = new BirdView();
    PipeView pipeView = new PipeView();
    PipeController pipeController = new PipeController();

    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    private Bird bird = new Bird();

    private ArrayList<Pipe> pipes = new ArrayList<>();

    GamePanel(Bird bird, ArrayList<Pipe> pipes) {
        this.bird = bird;
        this.pipes = pipes;
    }

    //where all the painting occurs
    //This code will be executes whenever your components needs to be rendered
    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(Color.cyan);
        g.fillRect(0,0,WIDTH,HEIGHT);

        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT - 150, WIDTH, 150);

        g.setColor(Color.green);
        g.fillRect(0, HEIGHT - 150, WIDTH, 20);


        birdView.updateBirdPosition(bird, g);
        pipeController.SpawnPipes(pipes, pipeView, g);
    }

}
