package ru.mirea.lab14.number1.number9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] stat = new int[123];
        Arrays.fill(stat, 0);
        try {
            Files.lines(Paths.get("D:\\Для всего\\МИРЭА\\JAVA\\IdeaProjects\\untitled\\src\\ru\\mirea\\lab14\\number1\\number9\\abc.txt"))
                    .flatMapToInt(String::chars)
                    .filter(Character::isLetter)
                    .forEach(c -> stat[c]++);

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < stat.length; i++) {
            if (stat[i] != 0)
                System.out.println((char)i + " - " + stat[i] + " раз(a)");
        }
    }
}
