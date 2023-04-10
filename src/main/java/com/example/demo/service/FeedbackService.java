package com.example.demo.service;

import com.example.demo.bean.Feedback;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    public String getColor(Feedback feedback) {
        if (feedback.getRating() > 10) {
            feedback.setRating(10);
        } else if (feedback.getRating() < 0) {
            feedback.setRating(0);
        } else {
            feedback.setRating(feedback.getRating());
        }

        if (feedback.getRating() >= 0 && feedback.getRating() <= 2) {
            return "red";
        } else if (feedback.getRating() >= 4 && feedback.getRating() <= 7) {
            return "yellow";
        }
        return "green";
    }
}
