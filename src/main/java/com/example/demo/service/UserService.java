package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(User user);

    User findById(Long id);

    User findByUserName(String username);

}
