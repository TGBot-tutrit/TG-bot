package com.example.demo.processor;

import com.example.demo.model.Book;
import com.example.demo.repository.BookShelfRepository;
import com.example.demo.repository.UserRepository;
import org.telegram.telegrambots.meta.api.objects.Update;

public class AddBookProcessor {

    public void process(Update update) {
        String text = update.getMessage().getText();
        String bookName = text.substring("/addBook".length() + 1);
        Book book = new Book();
        book.setTitle(bookName);
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        bookShelfRepository.addBook(book, null);
    }
}
