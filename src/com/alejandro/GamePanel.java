package com.alejandro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {


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

        bird.paintBird(g);

        for (Pipe pipe: pipes){

            pipe.paintPipe(g);
        }

    }

}
