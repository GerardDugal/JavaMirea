package ru.mirea.lab27.number1.number2;

public class Main {
    public static void main(String[] args)
    {
        Map map = new Map();
        map.Add("Усов","Владислав");
        map.Add("Маслов","Герард");
        map.Add("Руднев","Виктор");
        map.Add("Гришина","София");
        map.Add("Девилюк","Алексей");

        map.Add("Усов","Дмитрий");
        map.Add("Маслов","Владислав");
        map.Add("Руднев","Ашот");
        map.Add("Гришина","Анжелла");
        map.Add("Девилюк","Богдан");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
