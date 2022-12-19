package ru.mirea.lab13.number1;

public class Main {
    public static void main(String[] args)
    {
        Test A = new Test("I like Java!!!");
        System.out.println(A.getString());

        System.out.println(A.getString().charAt(A.BackIndex()));

        System.out.println(A.getString().endsWith("!!!"));

        System.out.println(A.getString().startsWith("I like"));

        A.setString("I like Java!!!");
        System.out.println(A.getString().contains("Java"));

        System.out.println(A.getString().indexOf("Java"));

        A.setString(A.getString().replace("a", "o"));
        System.out.println(A.getString());

        A.setString(A.getString().toUpperCase());
        System.out.println(A.getString());

        A.setString(A.getString().toLowerCase());
        System.out.println(A.getString());

        A.setString("I like Java!!!");
        Test B = new Test(A.getString().substring(A.getString().indexOf("Java"), A.getString().indexOf("Java") + 4));
        System.out.println(B.getString());
    }
}
