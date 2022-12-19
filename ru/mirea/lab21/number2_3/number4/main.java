package ru.mirea.lab21.number2_3.number4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void Filelist(String path){
        File f = new File(path);
        String[] fArray = null;
        if (f.exists()||f.isDirectory()) fArray = f.list(null);
        else System.out.print("Папка не найдена");
        ArrayList<String> list = new ArrayList(Arrays.asList(fArray));

        for (int i =0; i<list.size();i++) {
            if(i<5) System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Filelist("D:\\Для всего");
    }
}
