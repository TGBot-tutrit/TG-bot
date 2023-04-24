package com.example.demo.model;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String language;
    private int pages;
    private int yearPublished;

    public Book() {
    }

    public Book(String title, String author, int pages, int yearPublished, String language) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && yearPublished == book.yearPublished && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(language, book.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages, yearPublished, language);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", yearPublished=" + yearPublished +
                ", language='" + language + '\'' +
                '}';
    }
}

