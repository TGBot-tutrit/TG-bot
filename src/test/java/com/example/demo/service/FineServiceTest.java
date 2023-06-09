package com.example.demo.service;

import com.example.demo.model.Fine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class FineServiceTest {
    @Autowired
    FineService fineService;

    @Test
    void calculateFine() {
        Fine fine = new Fine();
        fine.setFineBalance(2);
        fine.setDaysLate(4);
        double actualFine = fineService.calculateFine(fine);
        Assertions.assertEquals(3, actualFine);
    }
}