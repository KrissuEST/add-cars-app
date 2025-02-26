package ee.add.cars.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/* We use this class for response to REST API-s */
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNr;
    private boolean hasLicense;

    // Missing method for hasLicense
    public boolean hasLicense() {
        return hasLicense;
    }
}