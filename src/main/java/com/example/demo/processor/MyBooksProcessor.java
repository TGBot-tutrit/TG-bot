package com.example.demo.processor;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;
import com.example.demo.repository.BookShelfRepository;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Map;

public class MyBooksProcessor {

    public String process(Update update) {
        StringBuilder stringBuilder = new StringBuilder();
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Long userId = update.getMessage().getChatId();
        Map<Integer, BookSlot> userBooks = bookShelfRepository.findBooksByUserId(userId);
        for (Map.Entry<Integer, BookSlot> entry : userBooks.entrySet()) {
            stringBuilder.append(userId).
                          append(": ").
                          append(entry.getValue().getBook().getTitle()).
                          append("\n");
        }
        return stringBuilder.toString();
    }
}
