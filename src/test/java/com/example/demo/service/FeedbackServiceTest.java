package com.example.demo.service;

import com.example.demo.bean.Feedback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedbackServiceTest {

    @Autowired
    FeedbackService feedbackService;

    @Test
    void whenRatingAbowe10_shouldChangeTo10() {
        Feedback feedback = new Feedback();
        int above10 = 100;
        feedback.setRating(above10);
        feedbackService.getColor(feedback);
        Assertions.assertEquals(10, feedback.getRating());
    }

    @Test
    void whenRatingBelow0_shouldChangeTo0() {
        Feedback feedbackRateBelowZero = new Feedback();
        int below0 = -50;
        feedbackRateBelowZero.setRating(below0);
        feedbackService.getColor(feedbackRateBelowZero);
        Assertions.assertEquals(0, feedbackRateBelowZero.getRating());
    }

    @Test
    void whenRatingBetween0And10_shouldNoChanges() {
        Feedback feedbackRateNormal = new Feedback();
        int between0and10 = 5;
        feedbackRateNormal.setRating(between0and10);
        feedbackService.getColor(feedbackRateNormal);
        Assertions.assertEquals(between0and10, feedbackRateNormal.getRating());
    }

    @Test
    void whenFeedbackRatingFrom0To2_returnColorRed() {
        Feedback feedbackFrom0To2 = new Feedback();
        feedbackFrom0To2.setRating(2);
        String colorRed = feedbackService.getColor(feedbackFrom0To2);
        Assertions.assertEquals("red", colorRed);
    }

    @Test
    void whenFeedbackRatingFrom4To7_returnColorYellow() {
        Feedback feedbackFrom4To7 = new Feedback();
        feedbackFrom4To7.setRating(4);
        String colorYellow = feedbackService.getColor(feedbackFrom4To7);
        Assertions.assertEquals("yellow", colorYellow);
    }

    @Test
    void whenFeedbackRatingFrom8To10_returnColorGreen() {
        Feedback feedbackFrom8To10 = new Feedback();
        feedbackFrom8To10.setRating(10);
        String colorGreen = feedbackService.getColor(feedbackFrom8To10);
        Assertions.assertEquals("green", colorGreen);
    }
}
