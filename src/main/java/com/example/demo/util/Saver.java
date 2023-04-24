package com.example.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;

public class Saver {

    private Saver() {
    }

    public static void saveAsJson(Update update) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("./src/test/resources/last_update.json"), update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
