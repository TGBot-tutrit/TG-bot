package com.example.demo.bean;

import java.util.Objects;

public class Feedback {
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(final int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Feedback feedback = (Feedback) o;
        return rating == feedback.rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "rating=" + rating +
                '}';
    }
}
