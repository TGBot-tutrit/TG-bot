package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Publisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AuthorServiceTest {
    @Autowired
    AuthorService authorService;

    @Test
    void calculateBooksPerYear() {
        Author author = new Author();
        author.setNumberOfBooksWritten(10);
        author.setYearOfFirstBookPublished(2003);
        double actualResult = authorService.calculateBooksPerYear(author);
        Assertions.assertEquals(0.5, actualResult);
    }
    @Test
    void calculateYearsWriting() {
        Author author = new Author();
        author.setYearOfFirstBookPublished(2003);
        int actualResult = authorService.calculateYearsWriting(author);
        Assertions.assertEquals(20, actualResult);
    }

}