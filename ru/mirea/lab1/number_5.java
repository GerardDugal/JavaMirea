package ru.mirea.lab1;
import java.util.Scanner;

public class number_5 {
    public static void main(String[] args){
        int num = 10; // number of values we want in a series
        double result = 1.0;
        System.out.print("The harmonic series is: ");
        while (num > 0) {
            result = (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }
    }
}
