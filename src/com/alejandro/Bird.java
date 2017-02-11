package com.alejandro;

import java.awt.*;

public class Bird {

    private boolean isAlive = true;
    private int xPosition;
    private int yPosition;
    private int yVelocity;
    private StartingPosition startingPosition;
    private Rectangle bird;

    Bird(){
        bird = new Rectangle(20,20);
    }

    public void fly(){
        yVelocity -= 8;
    }

    public void reset(){
        xPosition = startingPosition.getXPosition();
        yPosition = startingPosition.getYPosition();
    }

}

class StartingPosition {

    private int xPos = 200;
    private int yPos = 200;

    public int getXPosition(){
        return xPos;
    }

    public int getYPosition(){
        return yPos;
    }

}