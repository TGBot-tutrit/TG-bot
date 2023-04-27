package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookShelfRepositoryTest {

    @Test
    void addBookInBookMAp() {
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Book book1 = new Book("Voina i mir", "Lev Tolstoi", 750, 1979, "eng");
        Book book2 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 450, 1968, "eng");
        Book book3 = new Book("Dracula", "Bram Stoker", 488, 1897, "eng");
        bookShelfRepository.addBook(book1, 1L);
        bookShelfRepository.addBook(book2, 2L);
        bookShelfRepository.addBook(book3, 3L);
        Assertions.assertEquals(3, BookShelfRepository.sizeBooksMap());
    }

    @Test
    void unoccupiedBooks() {
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Book book1 = new Book("Voina i mir", "Lev Tolstoi", 750, 1979, "eng");
        Book book2 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 450, 1968, "eng");
        Book book3 = new Book("Dracula", "Bram Stoker", 488, 1897, "eng");
        bookShelfRepository.addBook(book1, 1L);
        bookShelfRepository.addBook(book2, 2L);
        bookShelfRepository.addBook(book3, null);
        Assertions.assertEquals(1, bookShelfRepository.unoccupiedBooks().size());
    }
}

