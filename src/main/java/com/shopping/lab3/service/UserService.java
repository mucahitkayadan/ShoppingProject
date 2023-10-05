package com.shopping.lab3.service;

import com.shopping.lab3.domain.User;
import com.shopping.lab3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User login(User user) {
        return null;
    }

    public User register(User user) {
        return null;
    }
}
