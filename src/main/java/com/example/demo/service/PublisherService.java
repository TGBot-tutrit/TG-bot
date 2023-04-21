package com.example.demo.service;

import com.example.demo.model.Publisher;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class PublisherService {
    public String categorizePublisher(Publisher publisher) {
        if (calculateAverage(publisher) > 10000) {
            return "Publisher is large";
        } else if (calculateAverage(publisher) <= 10000 && calculateAverage(publisher) >= 1000) {
            return "Publisher is middle";
        } else return "Small press";
    }

    public int calculateYearsPublishing(Publisher publisher) {
        return Year.now().getValue() - publisher.getFoundationYear();
    }

    public int calculateAverage(Publisher publisher) {
        return publisher.getPublishedAmount() / calculateYearsPublishing(publisher);
    }

}
