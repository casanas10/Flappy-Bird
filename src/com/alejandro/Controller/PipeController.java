package com.alejandro.Controller;

import com.alejandro.Model.Pipe;
import com.alejandro.View.PipeView;

import java.awt.*;
import java.util.ArrayList;

public class PipeController {

    public void SpawnPipes(ArrayList<Pipe> pipes, PipeView pipeView, Graphics g){
        for (int i = 0; i < pipes.size(); i++) {
            Pipe pipe = pipes.get(i);
            pipe.movePipe();
            pipeView.paintPipe(pipe, g);
        }
    }



//            if (pipe.getxPosition() < 0 - 100){
//
//                pipes.remove(i);
//                System.out.println("deleted");
//
//
//            }
//
//            if (pipe.getxPosition() < WIDTH/2){
//
//                pipes.add(new Pipe(800, 0));
//                pipes.add(new Pipe(800, 800-150-200));
//                System.out.println("added");
//            }

}
