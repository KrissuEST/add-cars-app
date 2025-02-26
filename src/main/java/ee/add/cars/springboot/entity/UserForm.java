package ee.add.cars.springboot.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/* All needed UserForm elements here */
public class UserForm {

    private String firstName;
    private String lastName;
    private String phoneNr;
    private boolean hasLicense;
}