package ee.add.cars.springboot.repository;

import ee.add.cars.springboot.entity.CarClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface CarClassRepository extends JpaRepository<CarClass, Long> {
    List<CarClass> findByBrandId(Long brandId);
}