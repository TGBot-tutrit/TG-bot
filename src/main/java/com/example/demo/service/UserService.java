package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean isValid(User user) {
        if (validateUsernameLength(user) && validatePassword(user)) {
            return true;
        } else return false;
    }

    public boolean validateUsernameLength(User user) {
        if (user.getUsername().length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validatePassword(User user) {
        String a = "^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+$";
        return user.getPassword().matches(a);
    }
}

