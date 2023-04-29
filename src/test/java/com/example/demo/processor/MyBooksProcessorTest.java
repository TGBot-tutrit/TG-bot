package com.example.demo.processor;

import com.example.demo.model.Book;
import com.example.demo.repository.BookShelfRepository;
import com.example.demo.util.UpdateUtil;
import org.junit.jupiter.api.Test;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.*;

class MyBooksProcessorTest {

    @Test
    void process() {
        Update update = UpdateUtil.readUpdateJsonResourceFile("myBooks.json");
        MyBooksProcessor myBooksProcessor = new MyBooksProcessor();
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Book book1 = new Book("Voina i mir", "Lev Tolstoi", 750, 1979, "eng");
        Book book2 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 450, 1968, "eng");
        Book book3 = new Book("Dracula", "Bram Stoker", 488, 1897, "eng");
        bookShelfRepository.addBook(book1, 1L);
        bookShelfRepository.addBook(book2, 1L);
        bookShelfRepository.addBook(book3, 2L);
        myBooksProcessor.process(update);
    }
}