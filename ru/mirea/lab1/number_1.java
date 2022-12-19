package ru.mirea.lab1;
import java.util.Scanner;

public class number_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split(" ");

        double sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += Integer.parseInt(num[i]);
        }
        System.out.println((int)sum);
        System.out.println(sum / num.length);
    }
}
