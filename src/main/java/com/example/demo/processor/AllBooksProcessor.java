package com.example.demo.processor;

import com.example.demo.model.BookSlot;
import com.example.demo.repository.BookShelfRepository;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Map;

public class AllBooksProcessor {

    public String process(Update update) {
        StringBuilder stringBuilder = new StringBuilder();
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Map<Integer, BookSlot> allBooks = bookShelfRepository.unoccupiedBooks();
        for( Map.Entry<Integer, BookSlot> entry : allBooks.entrySet()) {
            if (entry.getValue().getUserId() == null) {
                stringBuilder.append(entry.getKey()+". " + entry.getValue().getBook().getTitle());
            }
        }
        return stringBuilder.toString();
    }
}
