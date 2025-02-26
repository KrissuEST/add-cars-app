package ee.add.cars.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "model")  // Car model table
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model_name")
    private String modelName;

    // Many car models can belong to a one car class
    @ManyToOne
    @JoinColumn(name = "class_id")
    private CarClass carClass;

//
//    // Many car models can belong to many users
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User carUser;
}
