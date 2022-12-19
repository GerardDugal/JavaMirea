package ru.mirea.lab4.lab4_1;

public class TransportTrain extends TransportVehicle {
    public TransportTrain(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)((countOfPassengers / 750) * 250 * 45 / 100));
    }
}
