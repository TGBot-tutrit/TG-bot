package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;
import org.junit.jupiter.api.Test;

class BookShelfRepositoryTest {

    @Test
    void addBook() {
        Book book1 = new Book();
        book1.setTitle("Vojna i mir");
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        bookShelfRepository.addBook(book1, 1L);
        Book book2 = new Book();
        book2.setTitle("Postoronnij");
        BookShelfRepository bookShelfRepository2 = new BookShelfRepository();
        bookShelfRepository2.addBook(book2, 2L);
    }

    @Test
    void unoccupiedBooks() {
        BookShelfRepository bookShelfRepository = new BookShelfRepository();

        BookSlot bookSlot = new BookSlot();
        BookSlot bookSlot2 = new BookSlot();
        BookSlot bookSlot3 = new BookSlot();

        Book book1 = new Book();
        book1.setTitle("Alhimik");
        bookSlot.setBook(book1);
        bookShelfRepository.unoccupiedBooks(bookSlot);

        Book book2 = new Book();
        book2.setTitle("Generation Pi");
        bookSlot2.setBook(book2);
        bookSlot2.setUserId(1);
        bookShelfRepository.unoccupiedBooks(bookSlot2);

        Book book3 = new Book();
        book3.setTitle("Snuff");
        bookSlot3.setBook(book3);

        bookShelfRepository.unoccupiedBooks(bookSlot3);


    }
}

