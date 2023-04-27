package com.example.demo.model;

import java.util.Objects;

public class BookSlot {
    private Book book;
    private Long userId;

    public BookSlot() {
    }

    public BookSlot(Book book, Long userId) {
        this.book = book;
        this.userId = userId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSlot bookSlot = (BookSlot) o;
        return userId == bookSlot.userId && Objects.equals(book, bookSlot.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, userId);
    }

    @Override
    public String toString() {
        return "BookSlot{" +
                "book=" + book +
                ", userId=" + userId +
                '}';
    }
}
