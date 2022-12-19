package ru.mirea.lab5;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Fourth extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1;

    private Fourth(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel(new ImageIcon(getClass().getResource("1.png")));

        getContentPane().add(imgLabel);

        Timer timer = new Timer(2000, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".png")));
        if(imgNum == 8) imgNum = 0;

    }

    public static void Start() {
        Fourth fourth = new Fourth();
        fourth.setVisible(true);
    }
}

