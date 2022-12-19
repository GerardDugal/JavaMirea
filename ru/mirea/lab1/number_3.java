package ru.mirea.lab1;

import java.util.Scanner;

public class number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");

        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int maxValue = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        int minValue = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        int sum = 0;
        int i = 0;
        do {
            sum += (array[i]);
            i++;
        } while(size != i);

        System.out.println(sum);
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
