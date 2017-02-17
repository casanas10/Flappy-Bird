package com.alejandro;

import com.alejandro.Controller.BirdController;
import com.alejandro.Controller.PipeController;
import com.alejandro.Model.Bird;
import com.alejandro.Model.Pipe;
import com.alejandro.View.BirdView;
import com.alejandro.View.PipeView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener {

    private Bird bird;
    BirdView birdView = new BirdView();
    private BirdController birdController = new BirdController(bird, birdView);

    PipeView pipeView = new PipeView();
    PipeController pipeController = new PipeController();
    private ArrayList<Pipe> pipes;

    private Timer timer;
    private int ticks = 0;
    private final int FPS = 60;


    GamePanel(Bird bird, ArrayList<Pipe> pipes) {
        this.bird = bird;
        this.pipes = pipes;

        timer = new Timer(1000/FPS, this);
        timer.start();
    }

    //where all the painting occurs
    //This code will be executes whenever your components needs to be rendered
    @Override
    protected void paintComponent(Graphics g) {

        paintBackground(g);
        birdView.paintBird(bird, g);
        pipeController.SpawnPipes(pipes, pipeView, g);
    }

    private void paintBackground(Graphics g) {

        //background color
        g.setColor(Color.cyan);
        g.fillRect(0,0, GameFrame.WIDTH,GameFrame.HEIGHT);

        //dirt
        g.setColor(Color.orange);
        g.fillRect(0, GameFrame.HEIGHT - 150, GameFrame.WIDTH, 150);

        //grass
        g.setColor(Color.green);
        g.fillRect(0, GameFrame.HEIGHT - 150, GameFrame.WIDTH, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (isGameOver()){

            System.out.println("Game Over");

        } else {

            if (bird.isAlive()){
                bird.gravity();
            }

            ticks++;
            if (ticks % 120 == 0){
                pipes.add(new Pipe(800, 0));
                pipes.add(new Pipe(800, 800-150-200));
            }

            this.repaint();
        }


    }

    private boolean isGameOver() {
        if (bird.getY() > GameFrame.HEIGHT - 120){
            bird.setYPosition((int) (GameFrame.HEIGHT - 120 - bird.getHeight()));
            bird.setVelocity(0);
            bird.setGravityForce(0);
            return true;
        } else if (bird.getY() < 0){
            bird.setYPosition(0);
            bird.setVelocity(0);
            bird.setGravityForce(0);
            return true;
        }

        return false;
    }


}
