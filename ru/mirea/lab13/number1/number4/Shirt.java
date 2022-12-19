package ru.mirea.lab13.number1.number4;

public class Shirt {
    private String string = "";

    public Shirt(){};
    public Shirt(String string)
    {
        this.string=string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        String[] item = string.split(",");
        return "Code of item: " + item[0] +
                "\n\tName: " + item[1] +
                "\n\tColor: " + item[2] +
                "\n\tSize: " + item[3] + '\n';
    }
}
