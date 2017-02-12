package com.alejandro;

import java.awt.*;

public class Pipe {

    private Rectangle pipe;

    private int xPosition;
    private int yPosition;
    private int width = 100;
    private int height;

    private int speed = 3;

//    public void paintTopPipe(Graphics g){
//        g.setColor(Color.green.darker());
//        g.fillRect(600, 0, width, height);
//    }
//
//    public void paintBottomPipe(Graphics g){
//        g.setColor(Color.green.darker());
//        g.fillRect(600, 800-150-height, width, height);
//    }

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
}
