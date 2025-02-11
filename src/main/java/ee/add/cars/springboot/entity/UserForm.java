package ee.add.cars.springboot.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {

    private String firstName;
    private String lastName;
    private int phoneNr;
    private boolean hasLicense;
}