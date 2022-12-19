package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class RandomChetNechetMassive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 1) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 1){
                    System.out.println("Повторите ввод:");
                }
            }
            else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] mas1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int)(Math.random() * (n + 1));
            if(mas1[i] % 2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(mas1[i] % 2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
