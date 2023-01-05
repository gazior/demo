package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @PostMapping(value = "/index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/index")
    public String doGetIndex(){
        return "index";
    }

    @PostMapping(value = "/error")
    @ResponseBody
    public String error(){
        return "error";
    }
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

    @GetMapping(value = "/my/logout")
    @ResponseBody
    public String logout() {
        return "Wyloguj";
    }

    @GetMapping(value = "/my/index")
    @ResponseBody
    public String logoutInfo() {
        return "Wylogowano";
    }
}
