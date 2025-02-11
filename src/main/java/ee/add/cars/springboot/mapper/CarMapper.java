package ee.add.cars.springboot.mapper;

import ee.add.cars.springboot.dto.CarDto;
import ee.add.cars.springboot.entity.Car;

public class CarMapper {

    public static CarDto mapToUserDto(Car car) {
        return new CarDto(
//                car.getId(),
//                car.getBrand(),
//                car.getModel()
        );
    }

    public static Car mapToUser(CarDto carDto) {
        return new Car(
//                carDto.getId(),
//                carDto.getBrand(),
//                carDto.getModel()
        );
    }
}
