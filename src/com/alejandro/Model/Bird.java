package com.alejandro.Model;

import com.alejandro.GameFrame;

import java.awt.*;

public class Bird extends Rectangle{

    private final double AIR_RESITANCE = 0.9;
    private final int LIFT = -15;
    private double gravityForce = 0.6;
    private double velocity = 0;

    public Bird(){
        this.x = GameFrame.WIDTH / 2 - 10;
        this.y = GameFrame.HEIGHT / 2 - 10;
        this.width = 40;
        this.height = 40;

    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getVelocity(){
        return velocity;
    }
    public void setYPosition(int y){
        this.y = y;
    }
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    public void setGravityForce(double g){
        this.gravityForce = g;
    }

    public void jump(){
        velocity += LIFT;
    }

    public void gravity(){
        velocity += gravityForce;
        velocity *= AIR_RESITANCE;
        y += (int)velocity;
    }

    public boolean isAlive(){
        if (velocity == 0)
            return false;
        else
            return true;
    }


}