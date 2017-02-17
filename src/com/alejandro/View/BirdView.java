package com.alejandro.View;

import com.alejandro.Model.Bird;

import java.awt.*;

/**
 * Created by ale on 2/16/17.
 */
public class BirdView {

    public void paintBird(Bird bird, Graphics g){
        g.setColor(Color.red);
        g.fillRect(bird.x, bird.y,bird.width, bird.height);
    }

}
