package ru.mirea.lab13.number1.number3;

public class Address {
    private String country = "";
    private String Region = "";
    private String City = "";
    private String Street = "";
    private String House = "";
    private String Building = "";

    public Address(){}

    public void setAddress(String s) {
        s = s.replace(',', ' ');
        s = s.replace('.', ' ');
        s = s.replace(';', ' ');
        String[] str = s.split("  ");
        country = str[0];
        Region = str[1];
        City = str[2];
        Street = str[3];
        House = str[4];
        Building = str[5];
    }

    public String toString()
    {
        return country+"\n"+Region+'\n'+City+"\n"+Street+"\n"+House+"\n"+Building+"\n";
    }
}
