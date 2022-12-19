package ru.mirea.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Выберите номер задания (1-2)");
            System.out.println("Или введите 0 для выхода.");
            switch (scanner.nextInt()){
                case 0:
                    System.exit(0);
                case 1:
                    Third.ImgPerRef();
                    break;
                case 2:
                    Fourth.Start();
                    break;
            }
        }
    }
}
