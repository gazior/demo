package com.example.demo.rest;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/rest/{id}")
    public User showUSer(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/rest")
    public User addUser(@RequestBody User user) {

        userService.save(user);
        return user;
    }

}
