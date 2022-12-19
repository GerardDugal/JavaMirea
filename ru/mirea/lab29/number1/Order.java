package ru.mirea.lab29.number1;

public interface Order {
    boolean add(MenuItem item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    int size();
    String[] nameOfItems();
}
