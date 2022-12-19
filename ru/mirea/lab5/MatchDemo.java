package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchDemo {
    public static void main(String[] args) {
        Match frame = new Match("Матч: Милан и Мадрид", "Милан", "Мадрид");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Match.EXIT_ON_CLOSE);
        frame.setSize(310, 100);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
}