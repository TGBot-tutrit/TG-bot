package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;

import java.util.HashMap;
import java.util.Map;

public class BookShelfRepository {
    private static Map<Integer, BookSlot> booksMap = new HashMap<>();
    private static Map<Integer, BookSlot> unoccupiedBooksMap = new HashMap<>();
    private static Integer nextId = 1;

    public void addBook(Book book, Long userId) {
        BookSlot bookSlot = new BookSlot();
        bookSlot.setBook(book);
        bookSlot.setUserId(userId);
        booksMap.put(nextId, bookSlot);
        nextId++;

    }

    public Map<Integer, BookSlot> unoccupiedBooks(BookSlot bookSlot) {

        if (bookSlot.getUserId() == 0) {
            unoccupiedBooksMap.put(nextId, bookSlot);
            nextId++;
        }
        return unoccupiedBooksMap;
    }

    public static int sizeBooksMap() {
        return booksMap.size();
    }

    public static int sizeUnoccupiedBooksMap() {
        return unoccupiedBooksMap.size();
    }
}
