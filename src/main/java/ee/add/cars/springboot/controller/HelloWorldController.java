package ee.add.cars.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Contains @Controller and @ResponseBody
@RestController  // All REST Api-s return JSON to the client
public class HelloWorldController {

    // HTTP GET Request
    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
