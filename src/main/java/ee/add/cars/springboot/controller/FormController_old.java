package ee.add.cars.springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class FormController_old {

//    private UserService userService;
//
//    // Handler method to handle user page request
//    @GetMapping("user")
//    public String addCarToUserPage(Model model) {
//        // Empty UserForm model object to store form data
//        UserForm userForm = new UserForm();
//        model.addAttribute("userForm", userForm);  // adding object to model
//
//        List<UserDto> users = userService.getAllUsers();
//
//        model.addAttribute("users", users);
//
//        // List of cars here
//        List<String> listCars = Arrays.asList("Mercedes-Benz", "BMW", "Citroën, Audi, Muu");
//        model.addAttribute("listCars", listCars);
//
//        return "user-form";
//    }
//
//    // Handler method to handle user page form submission request
//    @PostMapping("user/save")
//    public String submitForm(Model model,
//                             @ModelAttribute("userForm") UserForm userForm) {
//        model.addAttribute("userForm", userForm);
//        return "submit-success";
//    }
}