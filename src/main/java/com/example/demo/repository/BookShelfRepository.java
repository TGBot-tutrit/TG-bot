package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;

import java.util.HashMap;
import java.util.Map;

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

    public String reserveBookForUser(Long userId, Integer bookId) {
        BookSlot bookSlot = booksMap.get(bookId);
        bookSlot.setUserId(userId);
        booksMap.put(bookId, bookSlot);
        return bookSlot.getBook().getTitle();
    }

    public static int sizeBooksMap() {
        return booksMap.size();
    }

}
