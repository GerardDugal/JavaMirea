package ru.mirea.lab3;

public class RandomVozrastMassive {
    public static void main(String[] args){
        int[] mas = new int[4];

        for (int i = 0; i < 4; i++){
            mas[i] = (int)(Math.random() * 90 + 10);
            System.out.print(mas[i] + " ");
        }

        for (int i = 0; i < 4; i++){
            if(i > 0) {
                if (mas[i] >= mas[i + 1]) {
                    System.out.println("\nПрогрессия не возрастающая");
                    break;
                }
                else {
                    System.out.println("\nПрогрессия возрастающая");
                    break;
                }
            }
        }
    }
}
