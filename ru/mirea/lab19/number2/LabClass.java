package ru.mirea.lab19.number2;

import java.util.Scanner;

public class LabClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];
        students[0] = new Student("Vlad",19,"IKBO-33-21",4.5);
        students[1] = new Student("Gerard",20,"IKBO-33-21",4.4);
        students[2] = new Student("Vitya",19,"IKBO-04-21",4.3);
        students[3]= new Student("Sofa",19,"IKBO-04-21",4.2);
        LabClassDriver labClassDriver = new LabClassDriver();
        System.out.print("Enter the name to search: ");
        Student temp  = labClassDriver.search(in.nextLine(),students);
        System.out.println(temp);

        System.out.println("\nArray before sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
        students = labClassDriver.sort(students);
        System.out.println("\nArray after sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
    }
}
