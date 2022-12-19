package ru.mirea.lab4.lab4_1;

public class TransportMain {
    public static void main(String... args) {
        TransportCar     c = new TransportCar(100, 5);
        TransportTrain   t = new TransportTrain(130, 750);
        TransportPlane   p = new TransportPlane(350, 335);
        System.out.print(c.getCostOfTravel(100) + "\n");
        System.out.print(t.getCostOfTravel(100) + "\n");
        System.out.print(p.getCostOfTravel(100));
    }
}

