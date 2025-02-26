package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.dto.UserDto;
import ee.add.cars.springboot.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@AllArgsConstructor
@RestController  // can handle now http request
@RequestMapping("/api/users")
public class UserController {

//    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

//    @GetMapping("/users")
//    public String showUsers(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "user-form";   // before user
//    }

    // Get User REST API
    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
        UserDto userDto = userService.getUserById(userId);
        return ResponseEntity.ok(userDto);
    }

//    @GetMapping("/classes")
//    @ResponseBody
//    public List<CarClass> getClassesByBrand(@RequestParam Long brandId) {
//        return carService.getClassesByBrand(brandId);
//    }
//
//    @GetMapping("/models")
//    @ResponseBody
//    public List<CarModel> getModelsByClass(@RequestParam Long classId) {
//        return carService.getModelsByClass(classId);
//    }

    @PostMapping
    // @RequestBody extracts json from http request and converts json into userDto Java object
    public RedirectView createUser(UserDto userDto) {
        UserDto savedUser = userService.createUser(userDto);
        return new RedirectView("/users");
    }

    // Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,
                                              @RequestBody UserDto updatedUser) {
        UserDto userDto = userService.updateUser(userId, updatedUser);
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully!");
    }
}
