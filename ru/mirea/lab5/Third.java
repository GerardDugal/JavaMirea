package ru.mirea.lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Third {
    public static void ImgPerRef(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес в формате: 'D:/.../....jpg'");
        String IMG_PATH = scanner.nextLine();

        try {
            BufferedImage img = ImageIO.read(new File(IMG_PATH));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
            JOptionPane.showMessageDialog(null, label);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
