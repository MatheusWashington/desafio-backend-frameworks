package com.matheus.javaspringboot.controller;

import com.matheus.javaspringboot.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public UserModel createUser(@RequestBody UserModel user) {
        return user;
    }
}