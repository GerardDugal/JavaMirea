package ru.mirea.lab12.number1.number3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Main(){
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 960, 580, null);
    }


    public static void main(String[] args) {
        framlist.add(new ImageIcon("D:\\Для всего\\Для постов\\Картинки\\Готовые\\Case-Cup'22.jpg").getImage());
        framlist.add(new ImageIcon("D:\\Для всего\\Для постов\\Картинки\\Готовые\\Битва первокурсников.jpg").getImage());
        framlist.add(new ImageIcon("D:\\Для всего\\Для постов\\Картинки\\Готовые\\итоги онлайн-квеста.jpg").getImage());
        framlist.add(new ImageIcon("D:\\Для всего\\Для постов\\Картинки\\Готовые\\конкурс поздравлений.jpg").getImage());
        framlist.add(new ImageIcon("D:\\Для всего\\Для постов\\Картинки\\Готовые\\Медиацентр копия.jpeg").getImage());

        Main A = new Main();
        while (true) {
            for (int i = 0; i < 5; i++)
            {
                image = framlist.get(i);
                A.repaint();
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}