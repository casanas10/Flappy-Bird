package com.alejandro.Model;

import java.awt.*;

public class Pipe extends Rectangle {

    private Rectangle pipe;

    private int speed = 5;

    public Pipe(int xPosition, int yPosition){

        this.x = xPosition;
        this.y = yPosition;
        this.width = 100;
        this.height = 200;
    }

    public void movePipe(){
        x -= speed;
    }

    public void paintPipe(Graphics g) {

        g.setColor(Color.green.darker());
        g.fillRect(x, y, width, height);
    }

    public int getxPosition() {
        return x;
    }
}
