package ee.add.cars.springboot.repository;

import ee.add.cars.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Database connection, mapping Person class to database table.
// The art of Jpa, Hiberante, converting Java class to Database table and vice versa.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
