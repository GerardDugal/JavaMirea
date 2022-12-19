package ru.mirea.lab4.lab4_1;

public class TransportPlane extends TransportVehicle {
    public TransportPlane(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)(countOfPassengers / 50 * 68291 / 100));
    }
}
