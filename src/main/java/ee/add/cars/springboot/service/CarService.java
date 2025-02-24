package ee.add.cars.springboot.service;

import ee.add.cars.springboot.entity.CarBrand;
import ee.add.cars.springboot.entity.CarClass;
import ee.add.cars.springboot.entity.CarModel;
import ee.add.cars.springboot.repository.CarBrandRepository;
import ee.add.cars.springboot.repository.CarClassRepository;
import ee.add.cars.springboot.repository.CarModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    @Autowired   //It's a constructor
    private CarBrandRepository carBrandRepository;

    @Autowired
    private CarClassRepository carClassRepository;

    @Autowired
    private CarModelRepository carModelRepository;

    public List<CarBrand> getAllBrands() {
        return carBrandRepository.findAll();
    }

    public List<CarClass> getClassesByBrand(Long brandId) {
        return carClassRepository.findByBrand_Id(brandId);
    }

    public List<CarModel> getModelsByClass(Long classId) {
        return carModelRepository.findByCarClassId(classId);
    }
}
