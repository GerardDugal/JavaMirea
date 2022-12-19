package ru.mirea.lab15.number1;

import javax.swing.*;

public class JCB extends JFrame {
    String ct[] = { "Argentina", "China", "England", "Russia", "USA" };
    JComboBox cb = new JComboBox(ct);

    JCB(){
        super("JCOMBOBOX");
        setLayout(null);
        setSize(400,300);
        cb.setBounds(100,50,150,20);
        add(cb);
    }

    public static void main(String[] args) {
        new JCB().setVisible(true);
    }
}
