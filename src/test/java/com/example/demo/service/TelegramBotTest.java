package com.example.demo.service;

import com.example.demo.util.UpdateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TelegramBotTest {

    @Autowired
    TelegramBot telegramBot;

    @Test
    void onUpdateReceived() {
        Update update = UpdateUtil.readUpdateJsonResourceFile("addUser.json");
        telegramBot.onUpdateReceived(update);
    }
}