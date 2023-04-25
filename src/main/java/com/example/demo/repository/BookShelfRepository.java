package com.example.demo.repository;

import com.example.demo.model.BookSlot;

import java.util.HashMap;
import java.util.Map;

public class BookShelfRepository {
    private static Map<Integer, BookSlot> books = new HashMap<>();

    private static Integer nextId = 1;

}
