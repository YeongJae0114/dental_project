package com.example.demo.service.login;

import com.example.demo.domain.User;

import java.util.Optional;

public interface LoginService {
    public User saveUser(User user);

    public Optional<User> getUserById(Integer id);


}
