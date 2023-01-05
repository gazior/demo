package com.example.demo.service;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class UserImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setActive(true);
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<>(List.of(userRole)));
        userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
