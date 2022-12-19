package ru.mirea.lab6.number4.number6;

public class Book implements Printable{
    private String name;

    public Book(String name)
    {
        this.name=name;
    }

    @Override
    public void print() {
        System.out.printf("%s%n",name);
    }
}
