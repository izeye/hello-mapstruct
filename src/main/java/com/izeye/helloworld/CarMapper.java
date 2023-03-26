package com.izeye.helloworld;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * {@link Mapper} for {@link Car}.
 *
 * @author Johnny Lim
 */
@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "seatCount", source = "numberOfSeats")
    CarDto carToCarDto(Car car);

}
