package com.izeye.helloworld;

/**
 * DTO for {@link Car}.
 *
 * @author Johnny Lim
 */
public class CarDto {

    private final String name;
    private final int seatCount;

    public CarDto(String name, int seatCount) {
        this.name = name;
        this.seatCount = seatCount;
    }

    public String getName() {
        return name;
    }

    public int getSeatCount() {
        return seatCount;
    }

}
