package ru.mirea.lab7.number3.number4;

public class MathFunc implements MathCalculable {

    @Override
    public double pov(double x, double y) {
        double z = x;
        for (int i = 1; i < y; ++i)
        {
            z = z * x;
        }
        return z;
    }

    @Override
    public double module(double x, double y) {
        return Math.sqrt(((x*x)+(y*y)));
    }

    @Override
    public double PI() {
        return 3.1415926535;
    }
}
