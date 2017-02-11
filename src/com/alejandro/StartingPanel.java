package com.alejandro;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ale on 2/11/17.
 */
public class StartingPanel {

    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private JButton highScoresButton;
    private JLabel flappyBirdLabel;


    StartingPanel(){
        setupGUI();
    }

    public void setupGUI(){

        frame = new JFrame("Flappy Bird");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.CYAN);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = new Insets(10,10,10,10);

        startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String start = "Start the game";
                System.out.println(start);
            }
        });

        highScoresButton = new JButton("High Scores");
        highScoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String highScores = "Show high scores";
                System.out.println(highScores);
            }
        });
        flappyBirdLabel = new JLabel("This is a flappy bird game clone");

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panel.add(startButton,gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panel.add(highScoresButton, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        panel.add(flappyBirdLabel, gridBagConstraints);

        frame.add(panel);

    }

}
