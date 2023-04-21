package com.example.demo.model;

import java.util.Objects;

public class Publisher {
    private String name;
    private int foundationYear;
    private int publishedAmount;

    public Publisher() {
    }

    public Publisher(String name, int foundationYear, int publishedAmount) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.publishedAmount = publishedAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public int getPublishedAmount() {
        return publishedAmount;
    }

    public void setPublishedAmount(int publishedAmount) {
        this.publishedAmount = publishedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return foundationYear == publisher.foundationYear && publishedAmount == publisher.publishedAmount && Objects.equals(name, publisher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundationYear, publishedAmount);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", publishedAmount=" + publishedAmount +
                '}';
    }
}
