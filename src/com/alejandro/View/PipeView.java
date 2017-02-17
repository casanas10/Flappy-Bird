package com.alejandro.View;

import com.alejandro.Model.Pipe;
import java.awt.*;

/**
 * Created by ale on 2/16/17.
 */
public class PipeView {

    public void paintPipe(Pipe pipe, Graphics g){
        g.setColor(Color.green.darker());
        g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
    }
}
