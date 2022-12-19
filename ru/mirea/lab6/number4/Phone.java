package ru.mirea.lab6.number4;

public class Phone implements Priceable {
    private int Price = 10;

    @Override
    public int getPrice()
    {
        return Price;
    }

}
