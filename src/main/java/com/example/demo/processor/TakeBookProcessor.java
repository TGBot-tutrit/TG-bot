package com.example.demo.processor;

import com.example.demo.repository.BookShelfRepository;
import org.telegram.telegrambots.meta.api.objects.Update;

import static java.lang.Integer.parseInt;

public class TakeBookProcessor {
    public String process(Update update) {
        Long userID = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        String bookID = text.substring("/takeBook".length() + 1);
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        return bookShelfRepository.reserveBookForUser(userID, parseInt(bookID));


    }
}

