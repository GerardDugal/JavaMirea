package ru.mirea.lab4;

public class ComputersDemo {
    public static void main(String[] args){
        Computers comp = Computers.HP;
        printAllValues();
    }


    public static void printAllValues(){
        for(Computers s : Computers.values()){
            System.out.println(s + s.getProcessor() + s.getMemory() + s.getMonitor() + "\n");
        }
    }
}
