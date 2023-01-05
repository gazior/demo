package com.example.demo.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


import java.util.Collection;
@Getter
@Setter

public class CurrentUser extends User {

    private final com.example.demo.domain.User user;

    public CurrentUser(String username, String password,
                       Collection<? extends GrantedAuthority> authorities,
                       com.example.demo.domain.User user) {
        super(username,password,authorities);
        this.user = user;

    }
    public com.example.demo.domain.User getUser() {
        return user;
    }
}
