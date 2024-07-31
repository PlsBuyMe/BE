package com.example.PlsBuyMe.controller;

import com.example.PlsBuyMe.entity.User;
import com.example.PlsBuyMe.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/auth")
    public List<User> userList() {
        return authService.findAll();
    }

    @PostMapping("/auth/signup")
    public String registerUser(@RequestBody User user) {
        return authService.join(user);
    }

    @PostMapping("/auth/login")
    public String loginUser(@RequestBody User user) {
        return authService.login(user);
    }
}
