package ru.mirea.lab18.number1.number8;

import java.util.Scanner;

public class main {
    public static void getKey(){
        String key = "";
        while(true){
            try {
                System.out.print("Enter key: ");
                Scanner sc = new Scanner(System.in);
                key = sc.next();
                if(key == "")
                    throw new ArithmeticException("Key is empty!");
                else break;
            }catch (ArithmeticException arithmeticException)
            {
                System.out.println(arithmeticException);
            }
        }
        printDetails( key );
    }
    public static void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private static String getDetails(String key) {
        return "data for " + key; }
    public static void main(String[] args) {
        getKey();
    }// end main
}