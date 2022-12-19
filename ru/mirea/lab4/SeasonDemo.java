package ru.mirea.lab4;

public class SeasonDemo {
    public static void main(String[] args){
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.SUMMER);
        printAllValues();
    }
    public static void print(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void printAllValues(){
        for(Season s : Season.values()){
            System.out.println(s + " " + s.getTmp() + " " + s.getDiscription());
        }
    }
}
