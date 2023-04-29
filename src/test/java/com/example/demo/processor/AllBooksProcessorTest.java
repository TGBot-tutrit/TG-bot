package com.example.demo.processor;

import com.example.demo.util.UpdateUtil;
import org.junit.jupiter.api.Test;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.*;

class AllBooksProcessorTest {

    @Test
    void process() {
        Update update = UpdateUtil.readUpdateJsonResourceFile("allBooks.json");
        AddBookProcessor addBookProcessor = new AddBookProcessor();
        addBookProcessor.process(update);

    }
}