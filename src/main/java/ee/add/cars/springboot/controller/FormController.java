package ee.add.cars.springboot.controller;

import ee.add.cars.springboot.entity.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // Handler method to handle user page request
    @GetMapping("user")
    public String addCarToUserPage(Model model) {
        // Empty UserForm model object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listCars = Arrays.asList("Mercedes-Benz", "BMW", "Citroën");
        model.addAttribute("listCars", listCars);
        return "user-form";
    }

    // Handler method to handle user page form submission request
    @PostMapping("user/save")
    public String submitForm(Model model,
                             @ModelAttribute("userForm") UserForm userForm) {
        model.addAttribute("userForm", userForm);
        return "submit-success";
    }
}