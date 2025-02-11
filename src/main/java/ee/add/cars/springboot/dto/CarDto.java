package ee.add.cars.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {   // We use this class for response to REST API-s

    private Long id;
    private String brand;
    private String model;
}
