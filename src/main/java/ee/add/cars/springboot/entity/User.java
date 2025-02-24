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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_nr", unique = true)
    private String phoneNr;

    @Column(name = "has_license")
    private boolean hasLicense;

    // One user can have many car models
    @ManyToOne
    @JoinColumn(name = "model_id")   // model_name
    private CarModel selectedCarModel;
}
