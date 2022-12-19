package ru.mirea.lab7.number3.number8;

public class Market implements Printable {
    String name;
    Market(String name){
        this.name=name;
    }

    @Override
    public String print() {
        return name;
    }
}