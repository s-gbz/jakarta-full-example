package com.example.studentjakarta;

import jakarta.validation.constraints.NotNull;

public record Student(
        @NotNull(message = "Die ID darf nicht leer sein")
        String id,
        @NotNull(message = "Der Name darf nicht leer sein")
        String name,
        String course) {
}
