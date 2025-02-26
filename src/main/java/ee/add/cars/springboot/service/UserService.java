package ee.add.cars.springboot.service;

import ee.add.cars.springboot.dto.UserDto;

import java.util.List;

/* It's more like an interface to UserServiceImpl class */
public interface UserService {  // Was class before

    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto updatedUser);

    void deleteUser(Long userId);

}