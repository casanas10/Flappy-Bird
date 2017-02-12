package com.alejandro;

import java.awt.*;

public class Bird {

//    private boolean isAlive = true;
//    private int yVelocity;
    //private StartingPosition startingPosition;

    private Rectangle bird;


    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    private int xPosition = WIDTH / 2 - 10;
    private int yPosition = HEIGHT / 2 - 10;
    private int width = 40;
    private int height = 40;

    private double gravityForce = 0.6;
    private int lift = -15;
    private double velocity = 0;

    Bird(){
        bird = new Rectangle(xPosition, yPosition, width,height);
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getXPosition(){
        return xPosition;
    }
    public int getYPosition(){
        return yPosition;
    }

    public double getVelocity(){
        return velocity;
    }

    public void setYPosition(int y){
        this.yPosition = y;
    }
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    public void setGravityForce(double g){
        this.gravityForce = g;
    }


    public void jump(){
        velocity += lift;
    }

    public void gravity(){

        velocity += gravityForce;
        velocity *= 0.9;  //air resistance
        yPosition += (int)velocity;

    }

    public void paintBird(Graphics g){
        g.setColor(Color.red);
        g.fillRect(xPosition, yPosition, width, height);
    }



}