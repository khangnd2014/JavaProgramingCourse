package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.User;

@Controller
public class HomeController {
    @GetMapping("/")
        // uri (localhost://8080/)
    String homePage() {
        return "index";        // index.jsp
    }

    @GetMapping("/user")
        // uri (localhost://8080/user)
    String userPage(Model model) {
        User newUser = new User();
        newUser.setUsername("Dangth");
        newUser.setPassword("pc04349");
        model.addAttribute("user", newUser);
        return "user";        // user.jsp
    }
}
