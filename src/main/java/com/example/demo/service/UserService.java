package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService<T> implements ObjectService<T> {


    private final UserRepository<T> userRepository;

    @Autowired
    public UserService(UserRepository<T> userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void save(T user) {
        userRepository.save(user);
    }

}
