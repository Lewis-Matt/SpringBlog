package com.codeup.springblog.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// TODO: Create a HomeController class. This class should have one method with a GetMapping for /. It should return a string that says "This is the landing page!".
@Controller
public class HomeController {
// defines a method that should be invoked when a GET request is received for the specified URI
    @GetMapping("/")
    public String landing() {
        return "This is the landing page!";
    }
}
