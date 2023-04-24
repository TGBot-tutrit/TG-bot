package com.example.demo.model;

import java.util.List;
import java.util.Objects;

public class Author {
    private String name;
    private int yearOfBirth;
    private int numberOfBooksWritten;
    private int yearOfFirstBookPublished;

    public int getYearOfFirstBookPublished() {
        return yearOfFirstBookPublished;
    }

    public void setYearOfFirstBookPublished(int yearOfFirstBookPublished) {
        this.yearOfFirstBookPublished = yearOfFirstBookPublished;
    }

    public int getNumberOfBooksWritten() {
        return numberOfBooksWritten;
    }

    public void setNumberOfBooksWritten(int numberOfBooksWritten) {
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

    public Author() {
    }

    public Author(String name, int ageOfBirth) {
        this.name = name;
        this.yearOfBirth = ageOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeOfBirth() {
        return yearOfBirth;
    }

    public void setAgeOfBirth(int ageOfBirth) {
        this.yearOfBirth = ageOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return yearOfBirth == author.yearOfBirth && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ageOfBirth=" + yearOfBirth +
                '}';
    }
}
