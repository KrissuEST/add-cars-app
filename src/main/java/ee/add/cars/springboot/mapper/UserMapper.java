package ee.add.cars.springboot.mapper;

import ee.add.cars.springboot.dto.UserDto;
import ee.add.cars.springboot.entity.User;

/* Here are the needed mappings for User */
public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getPhoneNr(),
                user.isHasLicense()
        );
    }

    public static User mapToUser(UserDto userDto) {
        return new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getPhoneNr(),
                userDto.hasLicense()
        );
    }
}