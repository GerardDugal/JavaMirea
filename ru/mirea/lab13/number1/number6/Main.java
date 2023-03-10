package ru.mirea.lab13.number1.number6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader lineReader = new BufferedReader(new InputStreamReader
                (new FileInputStream(fileName), StandardCharsets.UTF_8));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = lineReader.readLine()) != null) {
            builder.append(line);
            builder.append(" ");
        }
        line = builder.toString().trim();
        StringBuilder result = getLine(line);
        System.out.println(result.toString());
    }
    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(words[0], " ");
        while (st.hasMoreTokens()) list.add(st.nextToken());
        char next = 'А';
        StringBuilder sb = new StringBuilder();
        while (!list.isEmpty()) {
            boolean haveMore = false;
            for (String s : list) {
                char ch = s.toUpperCase().charAt(0);
                if (ch == next) {
                    sb.append(s);
                    sb.append(" ");
                    System.out.print(s + " ");
                    list.remove(s);
                    next = s.toUpperCase().charAt(s.length() - 1);
                    haveMore = true;
                    break;
                }
            }
            if (!haveMore) break;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;
    }
}
