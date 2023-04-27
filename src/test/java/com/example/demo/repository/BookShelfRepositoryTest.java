package com.example.demo.repository;

import com.example.demo.model.Book;
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

    @Test
    void reserveBookForUser(){
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Book book1 = new Book("Voina i mir", "Lev Tolstoi", 750, 1979, "eng");
        Book book2 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 450, 1968, "eng");
        bookShelfRepository.addBook(book1, null);
        bookShelfRepository.addBook(book2, null);
        String actualBook = bookShelfRepository.reserveBookForUser(1L, 1);
        Assertions.assertEquals("Voina i mir", actualBook);
    }

    @Test
    void findBooksByUserId() {
        BookShelfRepository bookShelfRepository = new BookShelfRepository();
        Book book1 = new Book("Voina i mir", "Lev Tolstoi", 750, 1979, "eng");
        Book book2 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 450, 1968, "eng");
        Book book3 = new Book("Dracula", "Bram Stoker", 488, 1897, "eng");
        bookShelfRepository.addBook(book1, 1L);
        bookShelfRepository.addBook(book2, 1L);
        bookShelfRepository.addBook(book3, 2L);
        Assertions.assertEquals(2, bookShelfRepository.findBooksByUserId(1L).size());
    }

}

