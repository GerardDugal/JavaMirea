package ru.mirea.lab6.number4.number10;

public class CPU implements Information{
    private String name;
    private int MHz;
    private byte Core;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getPower() {
        return MHz;
    }

    @Override
    public void setPower(int power) {
        MHz = power;
    }

    @Override
    public byte getObj() {
        return Core;
    }

    @Override
    public void setObj(byte obj) {
        Core = obj;
    }
}
