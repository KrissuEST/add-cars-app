package ee.add.cars.springboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is mandatory")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "Phone number is mandatory")
    @Column(name = "phone_nr", unique = true)
    private String phoneNr;

    @Column(name = "has_license")
    private boolean hasLicense;

    // Can have many car models
//    @ManyToMany
//    private Set<CarModel> carModels = new HashSet<>();

    // One user can have many car models
//    @ManyToOne
//    @JoinColumn(name = "model_id")   // model_name
//    private CarModel selectedCarModel;
}
