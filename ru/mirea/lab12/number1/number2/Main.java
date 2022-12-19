package ru.mirea.lab12.number1.number2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
public class Main extends JFrame {
    protected static Image image;
    private static JFrame jFrame;
    private static String text;
    protected static ArrayList<Image> framlist = new ArrayList<>();
    Main(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }

    public static void main(String[] args) {
        framlist.add(new ImageIcon("D:\\Для всего\\МИРЭА\\JAVA\\IdeaProjects\\untitled\\src\\background.jpg").getImage());

        Main animImg = new Main();
        while (true)
        {
            for (int i = 0; i < 72; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(85);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

}
