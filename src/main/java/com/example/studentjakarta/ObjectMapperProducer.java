package com.example.studentjakarta;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

public class ObjectMapperProducer {
    @Produces
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}