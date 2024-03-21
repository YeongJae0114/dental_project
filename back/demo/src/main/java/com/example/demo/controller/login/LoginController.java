package com.example.demo.controller.login;

import com.example.demo.service.login.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    LoginController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> addLogin(@RequestParam String email,
                                           @RequestParam String passwd){
    return null;
    }
}
