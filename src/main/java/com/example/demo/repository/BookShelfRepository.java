package com.example.demo.repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookSlot;

import java.util.HashMap;
import java.util.Map;

public class BookShelfRepository {
    private static Map<Integer, BookSlot> booksMap = new HashMap<>();

    private static Integer nextId = 1;

    public static void addBook(Book book, Long userId) {
        BookSlot bookSlot = new BookSlot();
        bookSlot.setBook(book);
        bookSlot.setUserId(userId);
        booksMap.put(nextId, bookSlot);
        nextId++;


    }

}
