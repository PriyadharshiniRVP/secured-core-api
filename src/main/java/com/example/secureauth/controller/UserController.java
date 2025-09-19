package com.example.secureauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String helloUser() {
        return "Hello Priya 👋, you accessed a PROTECTED endpoint!";
    }
}

