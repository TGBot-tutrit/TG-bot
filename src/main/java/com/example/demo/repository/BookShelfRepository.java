package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BookShelfRepository {
    private static Map<Integer, BookSlot> booksMap = new HashMap<>();

    private static Integer nextId = 1;

    public void addBook(Book book, Long userId) {
        BookSlot bookSlot = new BookSlot();
        bookSlot.setBook(book);
        bookSlot.setUserId(userId);
        booksMap.put(nextId, bookSlot);
        nextId++;
    }

    public Map<Integer, BookSlot> unoccupiedBooks() {
        Map<Integer, BookSlot> freeBooks = new HashMap<>();
        for (Map.Entry<Integer, BookSlot> entry : booksMap.entrySet()) {
            if (entry.getValue().getUserId() == null) {
                freeBooks.put(entry.getKey(), entry.getValue());
            }
        }
        return freeBooks;
    }

    public Map<Integer, BookSlot> findBooksByUserId(Long userId) {
        Map<Integer, BookSlot> userBooks = new HashMap<>();
        for (Map.Entry<Integer, BookSlot> entry : booksMap.entrySet()) {
            if (Objects.equals(entry.getValue().getUserId(), userId)) {
                userBooks.put(entry.getKey(), entry.getValue());
            }
        }
        return userBooks;
    }

    public String reserveBookForUser(Long userId, Integer bookId) {
        BookSlot bookSlot = booksMap.get(bookId);
        if (bookSlot != null) {
            bookSlot.setUserId(userId);
            booksMap.put(bookId, bookSlot);
            return bookSlot.getBook().getTitle();
        }
        return "none";
    }

    public static int sizeBooksMap() {
        return booksMap.size();
    }

    void dropRepository() {
        this.booksMap = new HashMap<>();
        this.nextId = 1;
    }

}
