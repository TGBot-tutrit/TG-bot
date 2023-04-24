package com.example.demo.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void addUser() {
        UserRepository userRepository = new UserRepository();
        userRepository.addUser("Mikas");
        UserRepository userRepository2 = new UserRepository();
        userRepository2.addUser("Danila");

    }
}