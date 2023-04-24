package com.example.demo.processor;

import com.example.demo.repository.UserRepository;
import org.telegram.telegrambots.meta.api.objects.Update;

public class AddUserProcessor {

    public void process(Update update) {
        String text = update.getMessage().getText();
        String userName = text.substring("/addUser".length() + 1);
        UserRepository userRepository = new UserRepository();
        userRepository.addUser(userName);
    }
}
