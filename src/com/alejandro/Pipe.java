package com.alejandro;

import java.awt.*;

public class Pipe {

    private Rectangle pipe;

    private int xPosition;
    private int yPosition;
    private int width = 100;
    private int height = 200;
    private int speed = 5;

    Pipe(int xPosition, int yPosition){

        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setxPosition(int x){
        this.xPosition = x;
    }

    public void setyPosition(int y){
        this.yPosition = y;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeigth(){
        return height;
    }

    public void movePipe(){
        xPosition -= speed;
    }

    public void paintPipe(Graphics g) {

        g.setColor(Color.green.darker());
        g.fillRect(xPosition, yPosition, width, height);
    }

    public int getxPosition() {
        return xPosition;
    }
}
