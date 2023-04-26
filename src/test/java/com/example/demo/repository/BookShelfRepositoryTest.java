package com.example.demo.repository;

import com.example.demo.model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfRepositoryTest {

    @Test
    void addBook() {
        Book book1 = new Book();
        book1.setTitle("Vojna i mir");
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        bookShelfRepository.addBook(book1,1L);
        Book book2 = new Book();
        book2.setTitle("Postoronnij");
        BookShelfRepository bookShelfRepository2 = new BookShelfRepository();
        bookShelfRepository2.addBook(book2,2L);
    }
}