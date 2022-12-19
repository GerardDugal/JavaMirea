package ru.mirea.lab20;

public class main {
    public static void main(String[] aegs)
    {
        int b1 = 5;
        double b2 = 4.2;
        String b3 = "Да";
        Generics A = new Generics<>(b1, b2, b3);
        System.out.println(A.RNC());
    }
}
