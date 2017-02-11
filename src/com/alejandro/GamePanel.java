package com.alejandro;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {


    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    private Rectangle bird = new Rectangle(WIDTH / 2 -10, HEIGHT/2-10, 20,20);

    GamePanel() {

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

        g.setColor(Color.red);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);

    }

}
