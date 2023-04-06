package com.example.demo.model;

import java.util.Objects;

public class Feedback {
    private String user;
    private String message;
    private int rating;

    public Feedback() {
    }

    public Feedback(String user, String message, int rating) {
        this.user = user;
        this.message = message;
        this.rating = rating;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return rating == feedback.rating && Objects.equals(user, feedback.user) && Objects.equals(message, feedback.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, message, rating);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "user='" + user + '\'' +
                ", message='" + message + '\'' +
                ", rating=" + rating +
                '}';
    }
}

