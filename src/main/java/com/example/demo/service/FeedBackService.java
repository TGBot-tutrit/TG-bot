package com.example.demo.service;

import com.example.demo.model.Feedback;
import org.springframework.stereotype.Service;

@Service
public class FeedBackService {
    public String getColor(Feedback feedback) {
        if (feedback.getRating() >= 10) {
            feedback.setRating(10);
        } else if (feedback.getRating() <= 0) {
            feedback.setRating(0);
        } else {
            feedback.setRating(feedback.getRating());
        }
        return null;
    }
}
