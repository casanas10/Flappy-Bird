package com.alejandro.Controller;

import com.alejandro.Model.Bird;
import com.alejandro.View.BirdView;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BirdController implements KeyListener {

    private Bird bird;
    private BirdView birdView;

    public BirdController(Bird bird, BirdView birdView){
        this.bird = bird;
        this.birdView = birdView;
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
