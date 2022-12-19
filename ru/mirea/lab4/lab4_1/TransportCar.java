package ru.mirea.lab4.lab4_1;

public class TransportCar extends TransportVehicle {
    public TransportCar(int speed, int countOfPassengers) {
        super(speed, countOfPassengers, (long)((1 + countOfPassengers / 5) * 3.7 * 50 / 100));
    }
}
