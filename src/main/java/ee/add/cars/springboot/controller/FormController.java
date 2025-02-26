package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.dto.UserDto;
import ee.add.cars.springboot.entity.UserForm;
import ee.add.cars.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@AllArgsConstructor
/* Controller for Users form. */
public class FormController {

    private UserService userService;

    // Handler method to handle users page request
    @GetMapping("users")
    public String addCarToUserPage(Model model) {
        // Empty UserForm model object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);  // adding object to model

        List<UserDto> users = userService.getAllUsers();

        model.addAttribute("users", users);

        // List of cars here, older idea, hardcoded bad version but it works.
//        List<String> listCars = Arrays.asList("Mercedes-Benz", "BMW", "Citroën, Audi, Muu");
//        model.addAttribute("listCars", listCars);

        return "user-form";
    }

    // Handler method to handle users page form submission request
    @PostMapping("users/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "submit-success";
    }
}