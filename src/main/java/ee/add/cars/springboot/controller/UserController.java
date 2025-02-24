package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.entity.CarClass;
import ee.add.cars.springboot.entity.CarModel;
import ee.add.cars.springboot.entity.User;
import ee.add.cars.springboot.service.CarService;
import ee.add.cars.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import java.util.List;

@Controller
@AllArgsConstructor
@RestController  // can handle now http request
//@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private CarService carService;

    // Get All Users REST API using Spring annotations
    // GetMapping for showing at form
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("brands", carService.getAllBrands());
        return "user-form";
    }
//    @GetMapping("/")
//    public ResponseEntity<List<UserDto>> getAllUsers() {
//        List<UserDto> users = userService.getAllUsers();
//        return ResponseEntity.ok(users);
//    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "user-form";   // before user
    }
    // Get User REST API
//    @GetMapping("{id}")
//    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
//        UserDto userDto = userService.getUserById(userId);
//        return ResponseEntity.ok(userDto);
//    }
    @GetMapping("/classes")
    @ResponseBody
    public List<CarClass> getClassesByBrand(@RequestParam Long brandId) {
        return carService.getClassesByBrand(brandId);
    }

    @GetMapping("/models")
    @ResponseBody
    public List<CarModel> getModelsByClass(@RequestParam Long classId) {
        return carService.getModelsByClass(classId);
    }

    // Add new User REST API
    @PostMapping("/save")
    public String saveUser(User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("brands", carService.getAllBrands());
            return "user-form";
        }
        userService.saveUser(user);
        return "redirect:/users";
    }
    //    @PostMapping
//    // @RequestBody extracts json from http request and converts json into userDto Java object
//    public RedirectView createUser(UserDto userDto) {
//        UserDto savedUser = userService.createUser(userDto);
//        return new RedirectView("/user");
//    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("brands", carService.getAllBrands());
        return "user-edit";
    }

    // Update User by id REST API
    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("brands", carService.getAllBrands());
            return "user-edit";
        }
        user.setUser_id(id);
        userService.saveUser(user);
        return "redirect:/users";
    }

    // Delete User REST API
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
//        userService.deleteUser(userId);
//        return ResponseEntity.ok("User deleted successfully!");
//    }
}
