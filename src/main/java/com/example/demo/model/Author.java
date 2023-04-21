package com.example.demo.model;

import java.util.Objects;

public class Author {
    private String name;
    private int ageOfBirth;

    public Author() {
    }

    public Author(String name, int ageOfBirth) {
        this.name = name;
        this.ageOfBirth = ageOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeOfBirth() {
        return ageOfBirth;
    }

    public void setAgeOfBirth(int ageOfBirth) {
        this.ageOfBirth = ageOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return ageOfBirth == author.ageOfBirth && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ageOfBirth);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ageOfBirth=" + ageOfBirth +
                '}';
    }
}
