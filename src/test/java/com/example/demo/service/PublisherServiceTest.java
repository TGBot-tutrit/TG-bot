package com.example.demo.service;

import com.example.demo.model.Publisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PublisherServiceTest {

    @Autowired
    PublisherService publisherService;

    @Test
    void whenPublishedOver10kYearly() {
        Publisher publisherOver10k = new Publisher();
        publisherOver10k.setFoundationYear(1990);
        publisherOver10k.setPublishedAmount(999999999);
        String largePublisher = publisherService.categorizePublisher(publisherOver10k);
        Assertions.assertEquals("Publisher is large", largePublisher);
    }

    @Test
    void whenPublishedBetween10kAnd1kYearly() {
        Publisher publisherBetween10kAnd1k = new Publisher();
        publisherBetween10kAnd1k.setFoundationYear(1990);
        publisherBetween10kAnd1k.setPublishedAmount(34000);
        String middlePublisher = publisherService.categorizePublisher(publisherBetween10kAnd1k);
        Assertions.assertEquals("Publisher is middle", middlePublisher);
    }

    @Test
    void whenPublishedLessThan1kYearly() {
        Publisher publisherLessThan1k = new Publisher();
        publisherLessThan1k.setFoundationYear(1990);
        publisherLessThan1k.setPublishedAmount(19000);
        String smallPress = publisherService.categorizePublisher(publisherLessThan1k);
        Assertions.assertEquals("Small press", smallPress);
    }

    @Test
    void calculateYearsPublishing() {
        Publisher publisher = new Publisher();
        publisher.setFoundationYear(1990);
        int actual = publisherService.calculateYearsPublishing(publisher);
        Assertions.assertEquals(33, actual);
    }

    @Test
    void calculateAverage() {
        Publisher publisher = new Publisher();
        publisher.setPublishedAmount(100);
        publisher.setFoundationYear(1990);
        int actual = publisherService.calculateAverage(publisher);
        Assertions.assertEquals(3, actual);
    }
}
