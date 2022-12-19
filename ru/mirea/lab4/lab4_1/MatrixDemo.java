package ru.mirea.lab4.lab4_1;
import java.util.random.RandomGenerator;

public class MatrixDemo {
    public static void main(String... args) {
        double[][] temp = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                temp[i][j] = RandomGenerator.getDefault().nextDouble(100);
        Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(temp, 3, 3);
        System.out.print("First matrix:\n");
        m1.print();
        System.out.print("\nSecond matrix:\n");
        m2.print();

        System.out.print("\nSum matrix for first with second:\n");
        m1.add(m2);
        System.out.print("First matrix:\n");
        m1.print();
        System.out.print("\nSecond matrix:\n");
        m2.print();

        System.out.print("\nMultiplication matrix for second on 5:\n");
        m2.multiplication(5);
        m2.print();
    }
}
