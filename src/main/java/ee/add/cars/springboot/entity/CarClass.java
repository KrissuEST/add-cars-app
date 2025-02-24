package ee.add.cars.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "class")  // Car class table
public class CarClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name")
    private String className;

    // CarClass entity owns the relationship and has a field named brand
    // Many car classes can have one car brand
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private CarBrand brand;  // This is the owning side of the relationship

    // One car class can have many car models
    @OneToMany(mappedBy = "carClass")
    private List<CarModel> models;
}
