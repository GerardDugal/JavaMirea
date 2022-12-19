package ru.mirea.lab13.number1;

public class Test {
    private String string;

    public Test(String string)
    {
        this.string=string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public int BackIndex()
    {
        return string.length() - 1;
    }

}