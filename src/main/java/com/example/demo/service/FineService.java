package com.example.demo.service;

import com.example.demo.model.Fine;
import org.springframework.stereotype.Service;

@Service
public class FineService {

    public double calculateFine(Fine fine) {
        fine.setFineBalance(fine.getFineBalance() + fine.getDaysLate() * 0.25);
        return fine.getFineBalance() * 2;
    }
}
