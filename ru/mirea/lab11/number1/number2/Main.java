package ru.mirea.lab11.number1.number2;

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year2 = scanner.nextInt();
        int year1 = calendar.get(Calendar.YEAR);

        System.out.print("Введите месяц: ");
        int month2 = scanner.nextInt();
        int month1 = calendar.get(Calendar.MONTH) + 1;

        System.out.print("Введите день: ");
        int day2 = scanner.nextInt();
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.print("Введите час: ");
        int hour2 = scanner.nextInt();
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);

        System.out.print("Введите минуты: ");
        int minute2 = scanner.nextInt();
        int minute1 = calendar.get(Calendar.MINUTE);

        System.out.print("Введите секунды: ");
        int second2 = scanner.nextInt();
        int second1 = calendar.get(Calendar.SECOND);

        System.out.print("\n");
        if (year2 == year1)
        {
            System.out.println("Года совпадают");
        }
        else
        {
            System.out.println("Года не совпадают");
        }

        if (month2 == month1)
        {
            System.out.println("Месяцы совпадают");
        }
        else
        {
            System.out.println("Месяцы не совпадают");
        }

        if (day2 == day1)
        {
            System.out.println("Дни совпадают");
        }
        else
        {
            System.out.println("Дни не совпадают");
        }

        if (hour2 == hour1)
        {
            System.out.println("Часы совпадают");
        }
        else
        {
            System.out.println("Часы не совпадают");
        }

        if (minute2 == minute1)
        {
            System.out.println("Минуты совпадают");
        }
        else
        {
            System.out.println("Минуты не совпадают");
        }

        if (second2 == second1)
        {
            System.out.println("Секунды совпадают");
        }
        else
        {
            System.out.println("Секунды не совпадают");
        }
    }
}
