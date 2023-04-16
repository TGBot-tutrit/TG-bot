package com.example.demo.service;

import com.example.demo.model.Fine;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
class FineServiceTest {
    @Autowired
    FineService fineService;

    @Test
    void calculateFine() {
        Fine fine = new Fine();
        fine.setFineBalance(4);
        fine.setDaysLate(3);
        double actualFine = fineService.calculateFine(fine);
        Assert.assertEquals(9.5, actualFine, 1e-15);
    }

}