package com.example.demo.processor;

import com.example.demo.util.UpdateUtil;
import org.junit.jupiter.api.Test;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.*;

class AddBookProcessorTest {

    @Test
    void process() {
        Update update = UpdateUtil.readUpdateJsonResourceFile("addBook.json");
        AddBookProcessor addBookProcessor = new AddBookProcessor();
        addBookProcessor.process(update);
    }
}