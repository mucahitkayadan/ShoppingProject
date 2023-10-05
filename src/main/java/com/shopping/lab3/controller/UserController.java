package com.shopping.lab3.controller;

import com.shopping.lab3.domain.User;
import com.shopping.lab3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) {
        return userService.login(user);
    }

    @PostMapping(value = "/signup")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }
}
