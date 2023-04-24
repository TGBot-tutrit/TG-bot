package com.example.demo.service;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.model.Publisher;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class AuthorService {
    public double calculateBooksPerYear(Author author) {
        return author.getNumberOfBooksWritten() / (double) calculateYearsWriting(author);

    }
    public int calculateYearsWriting(Author author) {
        return Year.now().getValue() - author.getYearOfFirstBookPublished();
    }
}
