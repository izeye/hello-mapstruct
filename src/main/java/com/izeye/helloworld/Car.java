package com.izeye.helloworld;

/**
 * Car.
 *
 * @author Johnny Lim
 */
public class Car {

    private final String name;
    private final int numberOfSeats;

    public Car(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
