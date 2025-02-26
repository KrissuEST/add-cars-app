package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.entity.CarClass;
import ee.add.cars.springboot.entity.CarModel;
import ee.add.cars.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import java.util.List;

/* Not sure is this Controller needed at all. */
//@AllArgsConstructor
//@RestController  // can handle now http request
//@RequestMapping("/api/cars")
public class CarController {

//    @Autowired
//    private CarService carService;
//
//    // Adding endpoints to fetch classes and models.
//    @GetMapping("/classes")
//    public List<CarClass> getClassesByBrand(@RequestParam Long brandId) {
//        return carService.getClassesByBrand(brandId);
//    }
//
//    @GetMapping("/models")
//    public List<CarModel> getModelsByClass(@RequestParam Long classId) {
//        return carService.getModelsByClass(classId);
//    }
}
