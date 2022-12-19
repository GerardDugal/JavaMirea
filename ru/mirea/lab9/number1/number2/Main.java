package ru.mirea.lab9.number1.number2;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(1000);
        System.out.println(A.toString());
        A.sort(0, 999);
        System.out.println(A.toString());
    }
}
