package ru.mirea.lab2;
import java.lang.*;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args){
        double r;
        Circle k1 = new Circle(3.1, 4.1, 5.1, "\u001B[31m");
        System.out.println("Длина окружности = " + k1.getPerimetr() + " cm");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getPerimetr() + " cm");
        System.out.println("\nПлощадь равна = " + k1.getS() + " cm^2");
    }
}
