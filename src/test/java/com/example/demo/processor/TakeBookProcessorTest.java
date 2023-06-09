package com.example.demo.processor;

import com.example.demo.util.UpdateUtil;
import org.junit.jupiter.api.Test;
import org.telegram.telegrambots.meta.api.objects.Update;

import static org.junit.jupiter.api.Assertions.*;

class TakeBookProcessorTest {

    @Test
    void process() {
        Update update = UpdateUtil.readUpdateJsonResourceFile("takeBook.json");
        AddUserProcessor addUserProcessor = new AddUserProcessor();
        addUserProcessor.process(update);
    }
}