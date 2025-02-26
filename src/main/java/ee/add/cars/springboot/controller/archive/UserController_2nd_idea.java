package ee.add.cars.springboot.controller.archive;


import org.springframework.web.bind.annotation.*;

//@Controller
//@AllArgsConstructor
@RestController  // can handle now http request
//@RequestMapping("/api/users")
public class UserController_2nd_idea {

//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private CarService carService;
//
//    @GetMapping("/user-form")
//    public String showUserForm(Model model) {
//        model.addAttribute("user", new User());
//        model.addAttribute("carBrands", carService.getAllCarBrands());
//        model.addAttribute("users", userService.getAllUsers());
//        return "user-form";
//    }
//
//    @PostMapping("/saveUser")
//    public String saveUser(@ModelAttribute User user) {
//        userService.saveUser(user);
//        return "redirect:/user-form";
//    }
//
//    @GetMapping("/user-edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model) {
//        Optional<User> user = userService.getUserById(id);
//        if (user.isPresent()) {
//            model.addAttribute("user", user.get());
//            model.addAttribute("carModels", userService.getAllCarModels());
//            return "user-edit";
//        }
//        return "redirect:/user-form";
//    }
//
//    @PostMapping("/updateUser")
//    public String updateUser(@ModelAttribute User user) {
//        userService.saveUser(user);
//        return "redirect:/user-form";
//    }
//
//    @GetMapping("/deleteUser/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//        return "redirect:/user-form";
//    }
}
