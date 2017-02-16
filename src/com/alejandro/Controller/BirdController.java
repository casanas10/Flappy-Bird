package com.alejandro.Controller;

import com.alejandro.Model.Bird;
import com.alejandro.View.BirdView;

/**
 * Created by ale on 2/16/17.
 */
public class BirdController {

    private Bird bird;
    private BirdView birdView;

    public BirdController(Bird bird, BirdView birdView){
        this.bird = bird;
        this.birdView = birdView;
    }

    
}
