package ru.mirea.lab27.number1;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Владислав");
        hashSet.add("Герард");
        hashSet.add("Виктор");
        hashSet.add("София");
        System.out.println(hashSet);

        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println(treeSet);
    }
}
