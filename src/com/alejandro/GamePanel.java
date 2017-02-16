package com.alejandro;

import com.alejandro.Model.Bird;
import com.alejandro.Model.Pipe;
import com.alejandro.View.BirdView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    BirdView birdView = new BirdView();

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


        birdView.updateBirdPosition(g, bird);

        for (int i = 0; i < pipes.size(); i++){

            Pipe pipe = pipes.get(i);
            pipe.movePipe();
            pipe.paintPipe(g);

//            if (pipe.getxPosition() < 0 - 100){
//
//                pipes.remove(i);
//                System.out.println("deleted");
//
//
//            }
//
//            if (pipe.getxPosition() < WIDTH/2){
//
//                pipes.add(new Pipe(800, 0));
//                pipes.add(new Pipe(800, 800-150-200));
//                System.out.println("added");
//            }

        }

    }

}
