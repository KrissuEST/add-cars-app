package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.entity.Car;
import ee.add.cars.springboot.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import java.util.List;

@AllArgsConstructor
@RestController  // can handle now http request
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    // Build Get All Cars REST API
    @GetMapping
    public ResponseEntity<List<Car>> getCars() {
        List<Car> cars = carRepository.findAll();
        return ResponseEntity.ok(cars);
    }
}
