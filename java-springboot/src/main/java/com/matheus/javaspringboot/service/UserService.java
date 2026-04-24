package com.matheus.javaspringboot.service;

import com.matheus.javaspringboot.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserModel createUser(UserModel user) {
        // aqui poderia ter validações no futuro
        return user;
    }
}