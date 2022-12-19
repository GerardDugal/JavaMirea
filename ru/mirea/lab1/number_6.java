package ru.mirea.lab1;
import java.util.Scanner;

public class number_6 {

    public static int get_factorial(int f){
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int f = sc.nextInt();

        System.out.println("Факториал данного числа равен: " + get_factorial(f));
    }
}
