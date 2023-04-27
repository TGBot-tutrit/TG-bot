package com.example.demo.service;

import com.example.demo.processor.AddBookProcessor;
import com.example.demo.processor.AddUserProcessor;
import com.example.demo.processor.AllBooksProcessor;
import com.example.demo.processor.SaveBookProcessor;
import com.example.demo.util.Saver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    @Value("${bot.username}")
    private String botUsername;
    @Value("${bot.token}")
    private String botToken;

    @Override
    public void onUpdateReceived(Update update) {
        Long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        SendMessage sendMessage = new SendMessage();

        if("/start".equals(text)) {
            sendMessage.setText("Hello teamS2!");
            sendMessage.setChatId(chatId);
        } else if("/save_book".equals(text)) {
            new SaveBookProcessor().save(update);
            sendMessage.setText("Book shell is full! come back later");
            sendMessage.setChatId(chatId);
        } else if (text.startsWith("/addUser")) {
            Saver.saveAsJson(update);
            new AddUserProcessor().process(update);
            sendMessage.setText("User saved!");
            sendMessage.setChatId(chatId);
        } else if (text.startsWith("/addBook")) {
            // Saver.saveAsJson(update);
            new AddBookProcessor().process(update);
            sendMessage.setText("Book saved!");
            sendMessage.setChatId(chatId);
        } else if (text.startsWith("/allBooks")) {
            // Saver.saveAsJson(update);
            String response = new AllBooksProcessor().process(update);
            sendMessage.setText(response);
            sendMessage.setChatId(chatId);
        }
        try {
            this.execute(sendMessage);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }
}
