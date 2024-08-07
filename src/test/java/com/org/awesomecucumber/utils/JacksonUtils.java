package com.org.awesomecucumber.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {
    public static <T> T deserializeJson(String fileName, Class<T> T) throws IOException {
        InputStream inputStream = JacksonUtils.class.getClassLoader().getResourceAsStream("payloads\\"+fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(inputStream, T);
    }
}