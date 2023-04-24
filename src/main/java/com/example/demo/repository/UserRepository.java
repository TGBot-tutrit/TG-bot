package com.example.demo.repository;

import com.example.demo.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private static Map<Integer, User> userMap = new HashMap<>();
    private static Integer nextId = 1;

    public void addUser(String userName) {
        User user = new User();
        user.setName(userName);
        userMap.put(nextId, user);
        nextId++;
    }
}
