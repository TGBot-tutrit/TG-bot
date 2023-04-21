package com.example.demo.service;

import com.example.demo.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {
    @Autowired

    UserService userService;

    @Test
    void shouldReturnFalseIfUsernameLengthLessThan8ch() {
        User username = new User();
        username.setUsername("123456");
        boolean actual = userService.validateUsernameLength(username);
        Assertions.assertEquals(false, actual);
    }

    @Test
    void shouldReturnTrueIfPasswordContainsLettersAndNumbers() {
        User password = new User();
        password.setPassword("ABCD123");
        boolean actual = userService.validatePassword(password);
        Assertions.assertEquals(true, actual);
    }

    @Test
    void checkValidateUsernameAndPassword() {
        User user = new User();
        user.setUsername("Aabbccddee");
        user.setPassword("1a2s3d");
        boolean actual = userService.isValid(user);
        Assertions.assertEquals(true, actual);
    }
}

