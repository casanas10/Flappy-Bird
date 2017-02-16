package com.alejandro.View;

import com.alejandro.Model.Bird;

import java.awt.*;

/**
 * Created by ale on 2/16/17.
 */
public class BirdView {

    public void updateBirdPosition(Graphics g, Bird bird){
        g.setColor(Color.red);
        g.fillRect((int)bird.getX(), (int)bird.getY(),(int)bird.getWidth(), (int)bird.getHeight());
    }

}
