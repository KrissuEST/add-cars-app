package ee.add.cars.springboot.controller;

import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController  // can handle now http request
@RequestMapping("/api/cars")
public class CarController_old {

//    @Autowired
//    private CarClassRepository carRepository;
//
//    // Get All Cars REST API
//    @GetMapping
//    public ResponseEntity<List<CarBrand>> getCars() {
//        List<CarBrand> cars = carRepository.findAll();
//        return ResponseEntity.ok(cars);
//    }
}
