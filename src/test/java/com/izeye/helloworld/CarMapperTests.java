package com.izeye.helloworld;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link CarMapper}.
 *
 * @author Johnny Lim
 */
class CarMapperTests {

    @Test
    void carToCarDto() {
        String name = "My car";
        int numberOfSeats = 4;
        Car car = new Car(name, numberOfSeats);
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        assertThat(carDto.getName()).isEqualTo(name);
        assertThat(carDto.getSeatCount()).isEqualTo(numberOfSeats);
    }

}