package ru.mirea.lab7.number3.number5;

public class IntString implements StringInt{
    @Override
    public int score(String A) {
        return A.length();
    }

    @Override
    public String newString(String A) {
        String s = "";
        for (int i = 1; i <= A.length(); ++i)
        {
            if(!((i % 2) == 0))
            {
                s += A.charAt(i-1);
            }
        }
        return s;
    }

    @Override
    public String TeneT(String A) {
        String s = "";
        for (int i = 0; i < A.length(); ++i)
        {
            s = A.charAt(i) + s;
        }
        return s;
    }
}
