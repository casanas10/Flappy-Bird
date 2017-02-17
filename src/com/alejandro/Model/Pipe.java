package com.alejandro.Model;

import java.awt.*;

public class Pipe extends Rectangle {

    private int speed = 5;

    public Pipe(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 100;
        this.height = 200;
    }

    public void movePipe(){
        x -= speed;
    }

}
