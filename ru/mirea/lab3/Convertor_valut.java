package ru.mirea.lab3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Convertor_valut
{
    public static void main(String [] args)
    {
        double amount, ruble, dollar, euro, tenge, yuan;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("1: Ruble");
        System.out.println("2: Dollar");
        System.out.println("3: Tenge");
        System.out.println("4: Euro");
        System.out.println("5: Yuan");

        System.out.print("\nВыберите из вышеперечисленных опций, какая у вас валюта: ");
        choice = sc.nextInt();

        System.out.print("Введите сумму, которую нужно перевести: ");
        amount = sc.nextDouble();

        switch (choice)
        {
            case 1:  // Ruble Conversion
                dollar = amount * 0.018084;
                System.out.println(amount + " Ruble = " + f.format(dollar) + " Dollar");

                tenge = amount * 8.62;
                System.out.println(amount + " Ruble = " + f.format(tenge) + " Tenge");

                euro = amount * 0.018962;
                System.out.println(amount + " Ruble = " + f.format(euro) + " Euro");

                yuan = amount * 0.12262;
                System.out.println(amount + " Ruble = " + f.format(yuan) + " Yuan");
                break;

            case 2:  // Dollar Conversion
                ruble = amount * 55.3;
                System.out.println(amount + " Dollar = " + f.format(ruble) + " Ruble");

                tenge = amount * 476.7;
                System.out.println(amount + " Dollar = " + f.format(tenge) + " Tenge");

                euro = amount * 1.02;
                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");

                yuan = amount * 6.78;
                System.out.println(amount + " Dollar = " + f.format(yuan) + " Yuan");
                break;

            case 3:  // Tenge Conversion
                ruble = amount * 0.116;
                System.out.println(amount + " Tenge = " + f.format(ruble) + " Ruble");

                dollar = amount * 0.002098;
                System.out.println(amount + " Tenge = " + f.format(dollar) + " Dollar");

                euro = amount * 0.0022;
                System.out.println(amount + " Tenge = " + f.format(euro) + " Euro");

                yuan = amount * 0.014224;
                System.out.println(amount + " Tenge = " + f.format(yuan) + " Yuan");
                break;

            case 4:  // Euro Conversion
                ruble = amount * 52.74;
                System.out.println(amount + " Euro = " + f.format(ruble) + " Ruble");

                dollar = amount * 0.9802;
                System.out.println(amount + " Euro = " + f.format(dollar) + " Dollar");

                tenge = amount * 454.63;
                System.out.println(amount + " Euro = " + f.format(tenge) + " Tenge");

                yuan = amount * 6.47;
                System.out.println(amount + " Euro = " + f.format(yuan) + " Yuan");
                break;

            case 5:  // Yuan Conversion
                ruble = amount * 8.16;
                System.out.println(amount + " Yuan = " + f.format(ruble) + " Ruble");

                dollar = amount * 0.14747;
                System.out.println(amount + " Yuan = " + f.format(dollar) + " Dollar");

                tenge = amount * 70.3;
                System.out.println(amount + " Yuan = " + f.format(tenge) + " Tenge");

                euro = amount * 0.15463;
                System.out.println(amount + " Yuan = " + f.format(euro) + " Euro");
                break;

            //Default case
            default:
                System.out.println("Invalid Input");
        }
    }
}