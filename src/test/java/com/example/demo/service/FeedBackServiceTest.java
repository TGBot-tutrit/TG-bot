package com.example.demo.service;

import com.example.demo.model.Feedback;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FeedBackServiceTest {
    @Autowired
    FeedBackService feedBackService;

    @Test
    void getColor() {
        Feedback feedbackRateAboveTen = new Feedback();
        feedbackRateAboveTen.setRating(100);
        feedBackService.getColor(feedbackRateAboveTen);
        Assertions.assertEquals(10, feedbackRateAboveTen.getRating());
    }
}