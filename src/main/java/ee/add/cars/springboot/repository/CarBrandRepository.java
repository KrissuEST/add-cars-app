package ee.add.cars.springboot.repository;

import ee.add.cars.springboot.entity.CarBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CarBrandRepository extends JpaRepository<CarBrand, Long> {
}